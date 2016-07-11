---
name: cljs.core/clj->js
see also:
  - cljs.core/js->clj
---

## Summary

## Details

Recursively transforms ClojureScript values to JavaScript.

| ClojureScript |        | JavaScript |         |
|---------------|--------|------------|---------|
| Set           | `#{}`  | Array      | `[]`    |
| Vector        | `[]`   | Array      | `[]`    |
| List          | `()`   | Array      | `[]`    |
| Keyword       | `:foo` | String     | `"foo"` |
| Symbol        | `bar`  | String     | `"bar"` |
| Map           | `{}`   | Object     | `{}`    |

## Examples

```clj
(clj->js {:foo 1 :bar 2})
;;=> #js {:foo 1, :bar 2}

(clj->js [:foo "bar" 'baz])
;;=> #js ["foo" "bar" "baz"]

(clj->js [1 {:foo "bar"} 4])
;;=> #js [1 #js {:foo "bar"} 4]
```

## Signature
[x]
