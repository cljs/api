---
name: cljs.core/sort
related:
  - cljs.core/sort-by
---

## Signature
[coll]
[comp coll]


## Details

Returns a sorted sequence of the items in `coll`.

`comp` can be a boolean-valued comparison funcion, or a -/0/+ valued comparator.

`comp` defaults to `compare`.
