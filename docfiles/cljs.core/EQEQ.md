---
name: cljs.core/==
see also:
  - cljs.core/=
  - cljs.core/identical?
---

## Summary

## Details

This is an equality check for numbers of different types that was carried over from Clojure,
to allow compatibility when converting code to ClojureScript.

Since there is only a single number type in JavaScript, 64-bit floating point, there is no
reason to use the `==` operator in ClojureScript.

Behavior on non-number arguments is undefined.

## Examples

```clj
(== 1 1)
;;=> true

(== 1 2)
;;=> false
```

## Signature
[x]
[x y]
[x y & more]
