---
name: cljs.core/boolean
see also:
  - cljs.core/if
---

## Summary

## Details

Return `false` if `x` is false or nil.  Otherwise return `true`.  This is the
truthiness condition used by `if` expressions.

## Examples

```clj
(boolean 1)
;;=> true

(boolean 0)
;;=> true

(boolean nil)
;;=> false
```
