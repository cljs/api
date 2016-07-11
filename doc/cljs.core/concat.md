---
name: cljs.core/concat
see also:
  - cljs.core/conj
  - cljs.core/into
---

## Summary

## Details

Returns a lazy sequence representing the concatenation of the elements in the
supplied collections.

## Examples

```clj
(concat (list 1 2 3) (list 4 5 6))
;;=> (1 2 3 4 5 6)

(concat [1 2 3] (list 4 5 6))
;; => (1 2 3 4 5 6)

(concat [1] [2] [3])
;; => (1 2 3)
```

## Signature
[]
[x]
[x y]
[x y & zs]
