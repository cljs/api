---
name: cljs.core/bit-count
---

## Signature
[x]


## Details

Counts the number of bits set in `x`.


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