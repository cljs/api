---
name: cljs.core/with-meta
see also:
  - cljs.core/alter-meta!
  - cljs.core/vary-meta
---

## Summary

## Details

Returns an object of the same type and value as `obj`, with map `m` as its
metadata.

## Examples

```clj
(def a ^:foo [1 2 3])
(def b (with-meta a {:bar true}))

(= a b)
;;=> true

(meta a)
;;=> {:foo true}

(meta b)
;;=> {:bar true}
```

## Signature
[obj m]
