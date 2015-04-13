# ClojureScript API Parser

This tool generates the __[ClojureScript API
docs](https://github.com/shaunlebron/cljs-api-docs)__ by parsing the
ClojureScript and Clojure repositories.  It creates `*.cljsdoc` files for each
API symbol found.  For example:

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

It creates a `cljs-api-docs` repository, and dumps the doc files into a "docs"
branch containing release version tagged commits.  A `symbol-history` table
file is written to track symbol history and the most recently parsed release.
The tool will skip the releases already listed in `symbol-history`.

I publish the docs to [cljs-api-docs] with:

```
# for incremental updates
script/build-push.sh

# when doc format changes
script/rebuild-push.sh
```

### scraping clojuredocs examples

To help build our initial set of clojurescript docs, we are scraping examples
from clojuredocs.  Each symbol will have its own file with its scraped examples
placed in the `examples` branch of the docs repo.

```
lein run examples
```

### Restoring

If I lose my local repo and I want to restore from github:

```
$ git clone git@github.com:shaunlebron/cljs-api-docs.git
$ script/restore-docs-from-github.sh
```

Then, incremental updates can be made again:

```
$ script/build-push.sh
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

----

Built for the upcoming __[cljs.info]__ website.

[codox]:https://github.com/weavejester/codox
[cljs.info]: https://github.com/oakmac/cljs.info
[cljs-api-docs]:https://github.com/shaunlebron/cljs-api-docs
