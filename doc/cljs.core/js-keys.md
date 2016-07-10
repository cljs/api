---
name: cljs.core/js-keys
related:
  - cljs.core/keys
---

## Signature
[obj]


## Description

Returns the keys for the JavaScript object `obj`.


## Examples

```clj
(js-keys #js {:foo 1 :bar 2})
;;=> #js ["foo" "bar"]
```