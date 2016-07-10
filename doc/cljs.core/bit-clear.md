---
name: cljs.core/bit-clear
see also:
  - cljs.core/bit-set
  - cljs.core/bit-flip
---

## Signature
[x n]


## Details

Clear bit at index `n`.  Same as `x & ~(1 << y)` in JavaScript.


## Examples

Bits can be entered using radix notation:

```clj
(bit-clear 2r1111 2)
;;=> 11
;; 11 = 2r1011
```

Same numbers in decimal:

```clj
(bit-clear 15 2)
;;=> 11
```