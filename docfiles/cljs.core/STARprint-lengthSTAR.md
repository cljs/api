---
name: cljs.core/*print-length*
see also:
---

## Summary

Limits the number of items in each collection to print.  Defaults to `nil` indicating
no limit.  A `...` is printed for items not shown.

## Details

## Examples

[doc:cljs.core/range] is an infinite sequence, but can be safely printed using `*print-length*`:

```clj
(binding [*print-length* 5]
  (println (range)))
;; Prints:
;; (0 1 2 3 4 ...)
;;
;;=> nil
```

All printed collections are abridged:

```clj
(binding [*print-length* 5]
  (println {:a (range) :b (range)}))
;; Prints:
;; {:a (0 1 2 3 4 ...) :b (0 1 2 3 4 ...)}
;;
;;=> nil
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/range]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/range.md
