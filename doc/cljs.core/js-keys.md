---
name: cljs.core/js-keys
see also:
  - cljs.core/keys
---

## Signature
[obj]


## Details

Returns the keys for the JavaScript object `obj`.


## Examples

```clj
(js-keys #js {:foo 1 :bar 2})
;;=> #js ["foo" "bar"]
```