---
name: cljs.core/atom
related:
  - cljs.core/atom
  - cljs.core/swap!
  - cljs.core/reset!
  - cljs.core/set-validator!
  - cljs.core/get-validator
---

## Signature
[x]
[x opts]


## Description

Creates and returns an atom with an initial value of `x`.

`opts` is an optional map with optional keys `:meta` and `:validator`.

`:meta` should be a [metadata-map](http://clojure.org/metadata) for the atom.

`:validator` should be a validator function for the atom. See `set-validator!`
for more information.


## Examples

```clj
(def a (atom 1))

@a
;;=> 1

(reset! a 2)
@a
;;=> 2

(swap! a inc)
@a
;;=> 3
```