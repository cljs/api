---
name: cljs.core/bit-flip
related:
  - cljs.core/bit-set
  - cljs.core/bit-clear
---

## Signature
[x n]


## Details

Flip bit at index `n`.  Same as `x ^ (1 << y)` in JavaScript.


## Examples

Bits can be entered using radix notation:

```clj
(bit-flip 2r1111 2)
;;=> 11
;; 11 = 2r1011
```

Same numbers in decimal:

```clj
(bit-flip 15 2)
;;=> 11
```