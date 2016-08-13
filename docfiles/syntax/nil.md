---
name: syntax/nil
display as: "nil"
clojure doc: http://clojure.org/reference/reader#_literals
edn doc: https://github.com/edn-format/edn#nil
see also:
---

## Summary

`nil` is a representation of nothing.  It's underlying representation is
JavaScript's `null`, and is equal JavaScript's `undefined` when compared.

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
