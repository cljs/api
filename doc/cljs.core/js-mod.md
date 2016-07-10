---
name: cljs.core/js-mod
related:
  - cljs.core/mod
---

## Description

Returns the modulus of dividing numerator `n` by denominator `d`, with JavaScript's
original behavior for negative numbers.

Returns `NaN` when `d` is 0 (divide by 0 error).

Equivalent to `x % y` in JavaScript.


## Examples

```clj
(js-mod -5 3)
;;=> -2

(js-mod 5 3)
;;=> 2

(js-mod 5 0)
;;=> NaN
```