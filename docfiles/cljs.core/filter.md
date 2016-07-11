---
name: cljs.core/filter
see also:
  - cljs.core/remove
  - cljs.core/keep
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
