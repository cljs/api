---
name: syntax/map
display as: "{} map"
clojure doc: http://clojure.org/reference/reader#_maps
edn doc: https://github.com/edn-format/edn#maps
see also:
  - cljs.core/hash-map
  - cljs.core/array-map
  - cljs.core/sorted-map
  - cljs.core/sorted-map-by
---

## Summary

A map associates keys with values.

- `{...}`
- `{:foo 1}`
- `{:foo 1, :bar 2}` - comma is optional
- `{[1 2] "foo"}` - keys and values can be any type (even collections)

## Details

Creates a map.  Must contain pairs of key-values.  Keys and values can be any type.

## Examples

```clj
{:foo 1 :bar 2}
;;=> {:foo 1, :bar 2}
```

Use any value as a key:

```clj
(def m {[1 2] 3})
(get m [1 2])
;;=> 3
```
