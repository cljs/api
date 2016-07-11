---
name: cljs.core/min
see also:
  - cljs.core/max
  - cljs.core/min-key
---

## Summary

## Details

Returns the least number argument.

## Examples

```clj
(min 1 2 3 4)
;; => 1
```

Apply it to a collection:

```clj
(apply min [1 2 3 4])
;; => 1
```

## Signature
[x]
[x y]
[x y & more]
