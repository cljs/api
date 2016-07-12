---
name: cljs.core/atom
see also:
  - cljs.core/atom
  - cljs.core/swap!
  - cljs.core/reset!
  - cljs.core/set-validator!
  - cljs.core/get-validator
---

## Summary

`(atom x)` - creates atom with initial value of `x`
`(atom x opts)` - adds metadata or validator to atom

## Details

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
