---
name: cljs.core/some
see also:
  - cljs.core/every?
  - cljs.core/not-any?
  - cljs.core/keep
  - cljs.core/keep-indexed
  - cljs.core/some-fn
---

## Signature
[pred coll]


## Details

Returns the first logical true value of `(pred x)` for any `x` in `coll`, else
nil.

A common idiom is to use a set as pred, for example this will return `:fred` if
`:fred` is in the sequence, otherwise nil: `(some #{:fred} coll)`
