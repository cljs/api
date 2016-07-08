## Name
cljs.core/concat

## Signature
[]
[x]
[x y]
[x y & zs]

## Description

Returns a lazy sequence representing the concatenation of the elements in the
supplied collections.

## Example#dcc019

```clj
(concat (list 1 2 3) (list 4 5 6))
;;=> (1 2 3 4 5 6)

(concat [1 2 3] (list 4 5 6))
;; => (1 2 3 4 5 6)

(concat [1] [2] [3])
;; => (1 2 3)
```

## Related
cljs.core/conj
cljs.core/into
