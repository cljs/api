---
name: cljs.core/bit-set
related:
  - cljs.core/bit-clear
---

## Signature
[x n]


## Description

Set bit at index `n`.  Same as `x | (1 << y)` in JavaScript.


## Examples

Bits can be entered using radix notation:

```clj
(bit-set 2r1100 1)
;;=> 14
;; 14 = 2r1110
```

Same number in decimal:

```clj
(bit-set 12 1)
;;=> 14
```