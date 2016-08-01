---
name: syntax/nil
display as: "nil"
see also:
clojure doc: http://clojure.org/reference/reader#_literals
edn doc: https://github.com/edn-format/edn#nil
---

## Summary

`nil` is a representation of nothing.

## Details

It is common for operations to safely handle `nil` without
causing exceptions.

Expressions evaluate to `nil` if there is no value to return.

## Examples

```clj
nil
;;=> nil
```

`nil` can sometimes mean "not found":

```clj
(:foo {})
;;=> nil
```

`nil` can also mean that the operation didn't make sense:

```clj
(:foo nil)
;;=> nil
```
