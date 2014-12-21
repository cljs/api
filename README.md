# ClojureScript API Parser

This creates ClojureScript API docs by parsing the ClojureScript and Clojure
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
https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/core.cljs#L3881-L3888
```

These docs are intended to be merged with manually-written docs found in
`docs/*.cljsdoc` at project root. The merging is done in `Gruntfile.js`.

## Setup

Run this to clone clj/cljs repos to the "repos" directory:

```
./get-repos.sh
```

From there, manually checkout the repo versions you wish to run the tool on.

## Run

This creates the `docs/*.cljsdoc` files at project root:

```
lein run
```

## Implementation

To gather docs, we are doing self-analysis of literal forms created from
`tools.reader` rather than using `tools.analyzer`. We may use the helpful
wrapper [codox] if this becomes insufficient.

It's worth nothing that parsing the full `cljs.core` namespace requires reading
symbols from a specific `import-macros` expression, then finding their
implementations in `clojure.core`.

[codox]:https://github.com/weavejester/codox
