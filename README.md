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

## Implementation

To gather docs, we are doing self-analysis of literal forms created from
`tools.reader` rather than using `tools.analyzer`. We may use the helpful
wrapper [codox] if this becomes insufficient.

It's worth nothing that parsing the full `cljs.core` namespace requires reading
symbols from a specific `import-macros` expression, then finding their
implementations in `clojure.core`.

[codox]:https://github.com/weavejester/codox
[cljs.info]: https://github.com/oakmac/cljs.info
[cljs-api-docs]:https://github.com/shaunlebron/cljs-api-docs
