---
name: cljs.core/bit-shift-right
related:
  - cljs.core/bit-shift-left
  - cljs.core/unsigned-bit-shift-right
---

## Signature
[x n]


## Details

Bitwise shift right `n` bits.  Same as `x >> n` in JavaScript.


## Examples

Bits can be entered using radix notation:

```clj
(bit-shift-right 2r1010 1)
;;=> 5
;; 5 = 2r0101
```

Same numbers in decimal:

```clj
(bit-shift-right 10 1)
;;=> 5
```