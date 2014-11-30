# ClojureScript API Parser

This creates ClojureScript API docs by parsing the ClojureScript and Clojure
repositories.  It outputs `docs-generated/*.cljsdoc` files (at project root)
for each API symbol found.  For example:

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
  "Associates a value in a nested associative structure, where ks is a
  sequence of keys and v is the new value and returns a new nested structure.
  If any levels do not exist, hash-maps will be created."
  [m [k & ks] v]
  (if ks
    (assoc m k (assoc-in (get m k) ks v))
    (assoc m k v)))

===== Github
https://github.com/clojure/clojurescript/blob/bf2d2413dcb46b2cec9a00e37af407006634c804/src/cljs/cljs/core.cljs#L3957-L3964
```

These docs are intended to be merged with manually-written docs found in
`docs/*.cljsdoc` at project root. The merging is done in `Gruntfile.js`.

## Setup

The clojure and clojurescript repos are git submodules that we retrieve with
the following:

```
git submodule init
git submodule update
```

To update the repos, go to `repos/<repo>`, run `git pull` and `git checkout` to
bring it to a desired version.  Then we have back out to the directory of this readme,
and commit the change.

## Run

This creates the `docs-generated/*.cljsdoc` files at project root:

```
lein run
```
