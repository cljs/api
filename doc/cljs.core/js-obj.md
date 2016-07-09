## Name
cljs.core/js-obj

## Signature
[& keyvals]

## Description

Returns a new JavaScript object using the supplied mappings.

`keyvals` must be an even number of forms.

## Related
syntax/js-literal
cljs.core/array
cljs.core/clj->js

## Examples

```clj
(js-obj "foo" 1 "bar" 2)
;;=> #js {:foo 1, :bar 2}
```
