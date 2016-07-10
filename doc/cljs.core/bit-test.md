---
name: cljs.core/bit-test
---

## Signature
[x n]


## Details

Test bit at index `n`. Returns `true` if 1, and `false` if 0. Same as `(x & (1 << y)) != 0` in JavaScript.


## Examples

Bits can be entered using radix notation:

```clj
(bit-test 2r0100 2)
;;=> true

(bit-test 2r0100 1)
;;=> false
```

Same numbers in decimal:

```clj
(bit-test 4 2)
;;=> true

(bit-test 4 1)
;;=> false
```