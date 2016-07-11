---
name: cljs.core/coll?
see also:
  - cljs.core/seq?
  - cljs.core/list?
  - cljs.core/sequential?
---

## Summary

## Details

Returns true if `x` is a collection, false otherwise.

Lists, maps, sets, and vectors are collections.

## Examples

```clj
(coll? [1 2 3])
;;=> true

(coll? '(1 2 3))
;;=> true

(coll? #{1 2 3})
;;=> true

(coll? {:foo 1 :bar 2})
;;=> true
```

Not collections:

```clj
(coll? "foo")
;;=> false

(coll? 123)
;;=> false

(coll? nil)
;;=> false
```

## Signature
[x]
