---
name: cljs.core/keep-indexed
see also:
  - cljs.core/map-indexed
  - cljs.core/keep
---

## Signature
[f]
[f coll]


## Details

Returns a lazy sequence of the non-nil results of `(f index item)`. Note, this
means false return values will be included.

`f` must be free of side-effects.

Returns a stateful transducer when no collection is provided.
