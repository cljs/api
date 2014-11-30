# Get Symbol Metadata

This project generates symbol metadata from the clojure & clojurescript
repositories.  It outputs `docs-generated/*.cljsdoc` files (at project root)
for each found API symbol.  For example:

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

## Setup

We use git submodules to associate our project's commits to commits in the
clojure & clojurescript repositories.  Run the following to populate the
submodule directories appropriately after cloning our project.

```
git submodule init
git submodule update
```

If clojure or clojurescript comes out with a new version that we want
to support with our docs, we go to `code-to-parse/<repo>`, where we
can run `git pull` and `git checkout` to bring it to a desired version.

After making this update, we have to back out of the submodule directories
by going to the directory of this readme.  From here, we have to `git add`
our update submodules, and `git commit` to save our changes.

__NOTE__: This allows us to easily update version and generate permanent github
links for each symbol.

## Run

This creates the `docs-generated/*.cljsdoc` files at project root:

```
lein run
```
