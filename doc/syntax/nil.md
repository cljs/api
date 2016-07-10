---
name: syntax/nil
display: "nil"
---

## Details

`nil` is a representation of nothing.

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