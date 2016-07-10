---
name: cljs.core/js-delete
related:
  - cljs.core/dissoc
---

## Signature
[obj key]


## Details

Deletes property `key` in JavaScript object `obj`.

Equivalent to `delete obj[key]` in JavaScript.


## Examples

```clj
(def a #js {:foo 1 :bar 2})
(js-delete a "foo")

a
;;=> #js {:bar 2}
```