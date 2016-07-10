---
name: cljs.core/sort-by
related:
  - cljs.core/sort
  - cljs.core/compare
---

## Signature
[keyfn coll]
[keyfn comp coll]


## Description

Returns a sorted sequence of the items in `coll`, where the sort order is
determined by comparing `(keyfn item)`.

`comp` can be boolean-valued comparison function, or a -/0/+ valued comparator.

`comp` defaults to `compare`.
