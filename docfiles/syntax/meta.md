---
name: syntax/meta
display as: "^ meta"
see also:
  - cljs.core/meta
  - cljs.core/with-meta
  - cljs.core/vary-meta
  - cljs.core/alter-meta!
---

## Summary

Attach metadata to the following symbol or collection.  Use a map to specify
the metadata, or use shorthand:

`^:foo` => `^{:foo true}`
`^"foo"` => `^{:tag "foo"}`
`^foo` => `^{:tag <value of foo>}`

## Details

## Examples

Attach metadata to a collection:

```clj
^:foo [1 2 3]
;;=> [1 2 3]
```

View the resulting metadata:

```clj
(meta ^:foo [1 2 3])
;;=> {:foo true}

(meta ^{:foo "bar"} [1 2 3])
;;=> {:foo "bar"}

(meta ^"foo" [1 2 3])
;;=> {:tag "foo"}

(def foo 1)
(meta ^foo [1 2 3])
;;=> {:tag 1}
```

Chain metadata:

```clj
(meta ^:foo ^"foo" [1 2 3])
;;=> {:foo true, :tag "foo"}
```
