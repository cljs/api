## Name
cljs.core/clj->js

## Signature
[x]

## Description

Recursively transforms ClojureScript values to JavaScript.

| ClojureScript |        | JavaScript |         |
|---------------|--------|------------|---------|
| Set           | `#{}`  | Array      | `[]`    |
| Vector        | `[]`   | Array      | `[]`    |
| List          | `()`   | Array      | `[]`    |
| Keyword       | `:foo` | String     | `"foo"` |
| Symbol        | `bar`  | String     | `"bar"` |
| Map           | `{}`   | Object     | `{}`    |

## Related
cljs.core/js->clj

## Examples

```clj
(clj->js {:foo 1 :bar 2})
;;=> #js {:foo 1, :bar 2}

(clj->js [:foo "bar" 'baz])
;;=> #js ["foo" "bar" "baz"]

(clj->js [1 {:foo "bar"} 4])
;;=> #js [1 #js {:foo "bar"} 4]
```
