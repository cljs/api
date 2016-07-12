---
name: cljs.core/vary-meta
see also:
  - cljs.core/alter-meta!
  - cljs.core/with-meta
---

## Summary

## Details

Returns an object of the same type and value as `obj`, with
`(apply f (meta obj) args)` as its metadata.

## Examples

```clj
(def a ^:foo [1 2 3])
(def b (vary-meta a assoc :bar true))

(= a b)
;;=> true

(meta a)
;;=> {:foo true}

(meta b)
;;=> {:foo true, :bar true}
```
