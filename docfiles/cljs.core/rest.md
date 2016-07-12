---
name: cljs.core/rest
see also:
  - cljs.core/next
  - cljs.core/first
  - cljs.core/drop
  - cljs.core/pop
---

## Summary

## Details

Returns a possibly empty sequence of the items after the first item.

Calls `seq` on its argument.

## Examples

```clj
(rest [1 2 3])
;;=> (2 3)

(rest [1 2])
;;=> (2)

(rest [1])
;;=> ()

(rest [])
;;=> ()
```
