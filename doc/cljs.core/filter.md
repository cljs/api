---
name: cljs.core/filter
related:
  - cljs.core/remove
  - cljs.core/keep
---

## Signature
[f]
[f coll]


## Details

Returns a lazy sequence of the non-nil results of `(f item)`. Note, this means
false return values will be included.

`f` must be free of side-effects.

Returns a transducer when no collection is provided.
