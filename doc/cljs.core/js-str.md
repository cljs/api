## Name
cljs.core/js-str

## Signature
[s]

## Description

Convert `s` to string using JavaScript's coercion behavior.

Equivalent to `''+s` in JavaScript.

## Related
cljs.core/str

## Examples

```clj
(js-str 23)
;;=> "23"

(js-str #js {:foo 1})
;;=> "[Object object]"
```
