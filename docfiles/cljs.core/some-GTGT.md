---
name: cljs.core/some->>
see also:
  - cljs.core/->
  - cljs.core/->>
  - cljs.core/some->
  - cljs.core/some
---

## Summary

When `expr` is not nil, threads it into the first form (via `->>`), and when
that result is not nil, through the next, etc.

## Details

This is a [safe navigation operator](https://en.wikipedia.org/wiki/Safe_navigation_operator).

## Examples
