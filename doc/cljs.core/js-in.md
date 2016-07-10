---
name: cljs.core/js-in
related:
  - cljs.core/contains?
---

## Signature
[key obj]


## Description

Determines if property `key` is in JavaScript object `obj`.

Equivalent to `key in obj` in JavaScript.


## Examples

```clj
(def a #js {:foo 1 :bar 2})

(js-in "foo" a)
;;=> true

(js-in "hello" a)
;;=> false
```

Properties inherited from prototype chain are also detected:

```clj
(js-in "toString" a)
;;=> true
```