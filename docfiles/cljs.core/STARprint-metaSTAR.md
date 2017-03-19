---
name: cljs.core/*print-meta*
see also:
---

## Summary

Determines if metadata should be included when printing an object. Defaults to false.

## Details

## Examples

```clj
(println ^:foo {:a 1})
;; Prints:
;; {:a 1}

(binding [*print-meta* true]
  (println ^:foo {:a 1}))
;; Prints:
;; ^{:foo true} {:a 1}
```
