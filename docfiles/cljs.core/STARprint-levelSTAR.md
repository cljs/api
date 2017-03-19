---
name: cljs.core/*print-level*
see also:
---

## Summary

Descend only `n` levels deep when printing a nested object. Defaults to `nil`
indicating no limit.  A `#` is printed for objects at level `n`.

## Details

## Examples

```clj
(binding [*print-level* 2]
  (println {:a {:b {:c nil}}}))
;; Prints:
;; {:a {:b #}}
;;
;;=> nil

(binding [*print-level* 1]
  (println {:a {:b {:c nil}}}))
;; Prints:
;; {:a #}
;;
;;=> nil
```
