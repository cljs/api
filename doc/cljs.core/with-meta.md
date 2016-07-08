## Name
cljs.core/with-meta

## Signature
[obj m]

## Description

Returns an object of the same type and value as `obj`, with map `m` as its
metadata.

## Related
cljs.core/alter-meta!
cljs.core/vary-meta

## Example#f189d4

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
