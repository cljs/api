---
name: cljs.core/distinct?
see also:
  - cljs.core/distinct
---

## Summary

## Details

Returns true if no two of the arguments are `=`

## Examples

```clj
(distinct? 1)
;;=> true

(distinct? 1 2)
;;=> true

(distinct? 1 1)
;;=> false

(distinct? 1 2 3)
;;=> true

(distinct? 1 2 1)
;;=> false
```

Apply it a collection:

```clj
(apply distinct? [1 2 3])
;;=> true

(apply distinct? [1 2 1])
;;=> false
```
