---
name: cljs.core/*print-namespace-maps*
see also:
---

## Summary

Determines if maps are printed as namespace maps when all keys
have the same namespace.  Defaults to false.

## Details

## Examples

```clj
(println {:user/a 1, :user/b 2})
;; Prints:
;; {:user/a 1, :user/b 2}

(binding [*print-namespace-maps* true]
  (println {:user/a 1, :user/b 2}))
;; Prints:
;; #:user{:a 1, :b 2}
```
