---
name: cljs.core/mod
see also:
  - cljs.core/rem
---

## Summary

## Details

Returns the modulus of dividing numerator `n` by denominator `d`.

Returns `NaN` when `d` is 0 (divide by 0 error).

Truncates toward negative infinity.

## Examples

```clj
(mod -5 3)
;;=> 1

(mod 5 3)
;;=> 2

(mod 5 0)
;;=> NaN
```

## Signature
[n d]
