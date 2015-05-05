# CLJS API Docs Generator

This is a tool that generates a versioned catalog of ClojureScript's core
functions, macros, and special forms (and their metadata).

- __[Browse latest docs](https://github.com/cljsinfo/api-docs-generator/tree/docs)__
- __[Browse scraped examples from clojuredocs](https://github.com/cljsinfo/api-docs-generator/tree/examples)__
- __[Downloads](https://github.com/cljsinfo/api-docs-generator/releases)__

An `autodocs.edn` file is generated for each version.  It is a list of maps of
the following structure:

```
{:full-name         "cljs.core/assoc-in"
 :ns                "cljs.core"
 :name              "assoc-in"
 :type              "function"
 :signatures        [[m [k & ks] v]]
 :history           ["+r927"]
 :return-type       nil
 :source-filename   "clojurescript/src/cljs/cljs/core.cljs"
 :source-link       "https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L4018-L4025"
 :source            "...full source code..."}
```

Readable `*.cljsdoc` files are also produced:

```
===== Name
cljs.core/assoc-in

===== Type
function

===== Docstring
Associates a value in a nested associative structure, where ks is a
sequence of keys and v is the new value and returns a new nested structure.
If any levels do not exist, hash-maps will be created.

===== Signature
[m [k & ks] v]

===== Filename
clojurescript/src/cljs/cljs/core.cljs

===== Source
(defn assoc-in
  [m [k & ks] v]
  (if ks
    (assoc m k (assoc-in (get m k) ks v))
    (assoc m k v)))

===== Github
https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L4018-L4025

===== History
Added in 0.0-927
```

## Run

Run this to build docs for every ClojureScript version:

```
lein run
```

This creates an `output-repo/` directory.  It is a git repo with a tag for each cljs version.

__Restarting__ the build process is not in a good state currently, sorry.
Please run the following before running the build process again:

```
rm -rf output-repo changes symbol-history
```

To __build for just a single version__:

```
lein run r3211
```

### scraping clojuredocs examples

To help build our initial set of clojurescript docs, we are scraping examples
from clojuredocs.  Each symbol will have its own file with its scraped examples
placed in the `examples` branch of the docs repo.

```
lein run examples
```

## Implementation

To gather docs, we are doing self-analysis of literal forms created from
`tools.reader` rather than using `tools.analyzer`. We may use the helpful
wrapper [codox] if this becomes insufficient.

It's worth nothing that parsing the full `cljs.core` namespace requires:

- finding __macros__ in `clojure.core` (specific clj version in `cljs/script/bootstrap`)
    - excluding those in `(:refer-clojure :exclude` in `cljs.core`
    - including those in `(import-macros clojure.core` in `cljs.core`
- finding __special-forms__ as `(defmethod parse` in `cljs.analyzer` (`cljs.compiler` for older)
    - (currently can't parse signatures and docstrings)

[codox]:https://github.com/weavejester/codox
