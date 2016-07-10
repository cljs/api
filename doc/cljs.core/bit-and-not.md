---
name: cljs.core/bit-and-not
related:
  - cljs.core/bit-and
  - cljs.core/bit-not
---

## Signature
[x y]
[x y & more]


## Description

Bitwise "and" `x` with bitwise "not" `y`.  Same as `x & ~y` in JavaScript.


## Examples

Bits can be entered using radix notation:

```clj
(bit-and-not 2r1100 2r1010)
;;=> 4
;; 4 = 2r0100
```

Same numbers in decimal:

```clj
(bit-and-not 12 10)
;;=> 4
```

Same result using `bit-and` and `bit-not`:

```clj
(bit-and 12 (bit-not 10))
;;=> 4
```