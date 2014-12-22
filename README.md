# ClojureScript API Parser

This is built for the ClojureScript documentation project at [cljs.info]. It
creates ClojureScript API docs by parsing the ClojureScript and Clojure
repositories.  It outputs `docs/*.cljsdoc` files for each API symbol found.
For example:

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
Added in r927
```

## Run

Run this to build docs for every clojurescript version.  It builds a
`symbol-history` file as it progresses through the versions in order to track
when symbols were added/removed.

```
lein run
```

When running again, the program will skip the versions already parsed by
`symbol-history`.

## Doc Archives

There will be a docs branch with tags for each version archive.

## Implementation

To gather docs, we are doing self-analysis of literal forms created from
`tools.reader` rather than using `tools.analyzer`. We may use the helpful
wrapper [codox] if this becomes insufficient.

It's worth nothing that parsing the full `cljs.core` namespace requires reading
symbols from a specific `import-macros` expression, then finding their
implementations in `clojure.core`.

[codox]:https://github.com/weavejester/codox
[cljs.info]: https://github.com/oakmac/cljs.info
