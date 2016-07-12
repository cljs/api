---
name: cljs.core/as->
see also:
  - cljs.core/->
  - cljs.core/->>
  - cljs.core/cond->
  - cljs.core/cond->>
  - cljs.core/some->
  - cljs.core/some->>
---

## Summary

## Details

Binds `name` to `expr`, evaluates the first form in the lexical context of that
binding, then binds `name` to that result, repeating for each successive form,
returning the result of the last form.

Useful for when you want a threading macro to use different "places" at each
form.

## Examples

```clj
(as-> [1 2 3 4] x
  (reduce + x)
  (/ x 2))
;;=> 5
```
