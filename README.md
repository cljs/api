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
 :signature         [[m [k & ks] v]]
 :docstring         "...full docstring..."
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

The runner is currently being refactored for an easier development cycle.

But you can run the following to build docs for every ClojureScript version.
It creates a catalog repo at `output-repo/`, containing a tag for each cljs
version.

```
lein run '{:catalog :all}'
```

__Restarting__ the build process is not in a good state currently, sorry.
Please run the following before running the build process again:

```
rm -rf output-repo changes symbol-history
```

Other usages can be found with:

```
$ lein run

Usage: lein run '{}'.  For example:

|              :opts |                                                       :desc |
|--------------------+-------------------------------------------------------------|
|    {:catalog :all} | Start or resume building docs catalog for all cljs versions |
|       {:catalog 3} |                    Start or resume the next 3 cljs versions |
| {:version "r3211"} |       Process and output docs for single cljs version r3211 |
| {:version :latest} |             Process and output docs for latest cljs version |
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
