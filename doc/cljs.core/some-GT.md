---
name: cljs.core/some->
related:
  - cljs.core/->
  - cljs.core/->>
  - cljs.core/some->>
  - cljs.core/some
---

## Signature
[expr & forms]


## Details

When `expr` is not nil, threads it into the first form (via `->`), and when that
result is not nil, through the next, etc.
