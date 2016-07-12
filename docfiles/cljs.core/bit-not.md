---
name: cljs.core/bit-not
see also:
---

## Summary

## Details

Bitwise complement.  Same as `~x` in JavaScript.

## Examples

Bits can be entered using radix notation:

```clj
(bit-not 2r1100)
;;=> -13
```

Same numbers in decimal:

```clj
(bit-not 12)
;;=> -13
```
