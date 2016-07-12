---
name: cljs.core/count
see also:
---

## Summary

## Details

Returns the number of items in `coll`.

`count` works on arrays, lists, maps, sets, strings, and vectors.

`(count nil)` returns 0.

## Examples

```clj
(count [1 2 3])
;;=> 3

(count [])
;;=> 0

(count nil)
;;=> 0

(count #{:a :b})
;;=> 2

(count {:key "value" :key2 "value2"})
;;=> 2
```
