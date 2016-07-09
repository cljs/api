## Name
cljs.core/bit-shift-left

## Signature
[x n]

## Description

Bitwise shift left `n` bits.  Same as `x << n` in JavaScript.

## Related
cljs.core/bit-shift-right

## Examples

Bits can be entered using radix notation:

```clj
(bit-shift-left 2r0101 1)
;;=> 10
;; 10 = 2r1010
```

Same numbers in decimal:

```clj
(bit-shift-left 5 1)
;;=> 10
```
