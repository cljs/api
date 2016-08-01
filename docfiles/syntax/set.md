---
name: syntax/set
display as: "#{} set"
see also:
  - cljs.core/hash-set
  - cljs.core/sorted-set
  - cljs.core/sorted-set-by
clojure doc: http://clojure.org/reference/reader#_sets
edn doc: https://github.com/edn-format/edn#sets
---

## Summary

An unordered set of values.  Values must be unique.

- `#{...}`
- `#{1 2 3}`

## Details

## Examples

```clj
#{1 2 3}
;;=> #{1 2 3}
```

Duplicate values will cause an error:

```clj
#{1 1 2 3}
;; Error: Duplicate key: 1
```
