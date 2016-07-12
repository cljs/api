---
name: cljs.core/bit-count
see also:
---

## Summary

`(bit-count x)`

Counts the number of bits set in `x`.

## Details

## Examples

Bits can be entered using radix notation:

```clj
(bit-count 2r1011)
;;=> 3
```

Same number in decimal:

```clj
(bit-count 11)
;;=> 3
```
