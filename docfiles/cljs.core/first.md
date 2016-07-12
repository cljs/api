---
name: cljs.core/first
see also:
  - cljs.core/rest
  - cljs.core/next
  - cljs.core/nth
  - cljs.core/second
  - cljs.core/take
  - cljs.core/ffirst
---

## Summary

## Details

Returns the first item in `coll` and calls `seq` on its argument.

Returns nil when `coll` is nil.

## Examples

```clj
(first [1 2 3])
;;=> 1

(first [])
;;=> nil
```
