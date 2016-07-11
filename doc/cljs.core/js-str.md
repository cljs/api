---
name: cljs.core/js-str
see also:
  - cljs.core/str
---

## Summary

## Details

Convert `s` to string using JavaScript's coercion behavior.

Equivalent to `''+s` in JavaScript.

## Examples

```clj
(js-str 23)
;;=> "23"

(js-str #js {:foo 1})
;;=> "[Object object]"
```

## Signature
[s]
