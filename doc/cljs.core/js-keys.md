## Name
cljs.core/js-keys

## Signature
[obj]

## Description

Returns the keys for the JavaScript object `obj`.

## Related
cljs.core/keys

## Examples

```clj
(js-keys #js {:foo 1 :bar 2})
;;=> #js ["foo" "bar"]
```
