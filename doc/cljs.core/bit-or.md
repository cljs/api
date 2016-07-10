---
name: cljs.core/bit-or
see also:
  - cljs.core/bit-and
  - cljs.core/bit-xor
---

## Signature
[x y]
[x y & more]


## Details

Bitwise "or". Same as `x | y` in JavaScript.


## Examples

Bits can be entered using radix notation:

```clj
(bit-or 2r1100 2r1010)
;;=> 14
;; 14 = 2r1110
```

Same numbers in decimal:

```clj
(bit-or 12 10)
;;=> 14
```