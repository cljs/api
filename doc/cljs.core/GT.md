---
name: cljs.core/>
see also:
  - cljs.core/>=
---

## Summary

## Details

Returns true if each successive number argument is less than the previous
one, false otherwise.

## Examples

```clj
(> 1 2)
;;=> false

(> 2 1)
;;=> true

(> 2 2)
;;=> false

(> 6 5 4 3 2)
;;=> true
```

## Signature
[x]
[x y]
[x y & more]
