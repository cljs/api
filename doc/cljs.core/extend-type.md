## Name
cljs.core/extend-type

## Signature
[type-sym & impls]

## Description

Extend a [type] to implement one or more [protocols].

`type-sym` can be the result of a [doc:cljs.core/deftype] or any JS constructor
function (e.g. `js/Date`).  But when targetting JS base types (e.g.
`js/Number`, `js/String`), you must use special _type symbols_ instead.  These
type symbols are associated with type strings deduced by [`goog/typeOf`]:

| type symbol  | corresponding `goog/typeOf` value |
|--------------|-------------|
| `nil`        | `"null"` |
| `object`     | `"object"` |
| `string`     | `"string"` |
| `number`     | `"number"` |
| `array`      | `"array"` |
| `function`   | `"function"` |
| `boolean`    | `"boolean"` |

`type-sym` can also be specified as `default` in order to provide default
implementations for protocols.

[`goog/typeOf`]:http://google.github.io/closure-library/api/namespace_goog.html#typeOf

## Related
cljs.core/extend-protocol
