---
name: cljs.core/take-last
see also:
  - cljs.core/last
  - cljs.core/butlast
  - cljs.core/drop-last
---

## Signature
[n coll]


## Details

Returns a sequence of the last `n` items in `coll`.

Depending on the type of collection, `take-last` may be no faster than linear
time. For vectors, please use `subvec`.


## TODO

Would be nice to list the O(n) time for all the collection types here instead of
just saying "it depends".