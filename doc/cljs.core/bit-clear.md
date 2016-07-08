## Name
cljs.core/bit-clear

## Signature
[x n]

## Description

Clear bit at index `n`.  Same as `x & ~(1 << y)` in JavaScript.

## Related
cljs.core/bit-set
cljs.core/bit-flip

## Example#0f6748

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
