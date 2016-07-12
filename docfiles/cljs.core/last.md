---
name: cljs.core/last
see also:
  - cljs.core/first
  - cljs.core/next
  - cljs.core/rest
  - cljs.core/butlast
  - cljs.core/take-last
---

## Summary

## Details

Returns the last item in `coll` in linear time.

`peek` is much faster than `last` for a vector.

## Examples

```clj
(last [1 2 3])
;;=> 3

(last [1 2])
;;=> 2

(last [1])
;;=> 1

(last [])
;;=> nil
```
