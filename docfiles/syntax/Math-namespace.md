---
name: syntax/Math-namespace
display as: "Math/ namespace"
see also:
  - syntax/js-namespace
---

## Summary

## Details

A special namespace for direct access to the native JavaScript [Math library].

`Math/foo` => `js/Math.foo`

[Math library]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math

## Examples

Math constants:

```clj
Math/E
;;=> 2.718281828459045

Math/PI
;;=> 3.141592653589793

Math/SQRT2
;;=> 1.4142135623730951
```

Math functions:

```clj
(Math/cos 0)
;;=> 1

(Math/atan2 1 0)
;;=> 1.5707963267948966

(Math/log Math/E)
;;=> 1

(Math/pow 2 5)
;;=> 32

(Math/pow Math/E (Math/log 1))
;;=> 1
```

## Usage
Math/foo
