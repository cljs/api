---
name: syntax/NaN
display as: "NaN"
see also:
  - syntax/Infinity
  - syntax/nil
---

## Summary

Floating point representation of `NaN` (not a number), an undefined or
unrepresentable number.

## Details

To test for NaN, use the native JavaScript [`js/isNaN`] or the safer [`js/Number.isNaN`].

[`js/isNaN`]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/isNaN
[`js/Number.isNaN`]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isNaN

## Examples

```clj
NaN
;;=> NaN
```

Testing for NaN:

```clj
(js/Number.isNaN (/ 0 0))
;;=> true

(js/Number.isNaN 1)
;;=> false
```

Equivalent to the JavaScript symbol:

```clj
js/NaN
;;=> NaN
```
