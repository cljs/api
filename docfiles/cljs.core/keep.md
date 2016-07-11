---
name: cljs.core/keep
see also:
  - cljs.core/keep-indexed
  - cljs.core/map
  - cljs.core/filter
---

## Summary

## Details

Returns a lazy sequence of the non-nil results of `(f item)`. Note, this means
false return values will be included.

`f` must be free of side-effects.

Returns a transducer when no collection is provided.

## Examples

## Signature
[f]
[f coll]
