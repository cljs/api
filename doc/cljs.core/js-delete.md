## Name
cljs.core/js-delete

## Signature
[obj key]

## Description

Deletes property `key` in JavaScript object `obj`.

Equivalent to `delete obj[key]` in JavaScript.

## Related
cljs.core/dissoc

## Examples

```clj
(def a #js {:foo 1 :bar 2})
(js-delete a "foo")

a
;;=> #js {:bar 2}
```
