---
name: syntax/NaN
display: "NaN"
related:
  - syntax/Infinity
  - syntax/nil
---

## Description

The IEEE 754 Floating Point representation of NaN (not a number), an undefined
or unrepresentable value.

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