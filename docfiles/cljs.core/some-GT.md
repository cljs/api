---
name: cljs.core/some->
see also:
  - cljs.core/->
  - cljs.core/->>
  - cljs.core/some->>
  - cljs.core/some
---

## Summary

When `expr` is not nil, threads it into the first form (via `->`), and when that
result is not nil, through the next, etc.

## Details

This is a [safe navigation operator](https://en.wikipedia.org/wiki/Safe_navigation_operator).

## Examples

Useful for interop chaining where nulls might appear ([seen here](https://github.com/oakes/Nightcode/blob/2.5.10/src/clj/nightcode/editors.clj#L62)):

```
(some-> pane .getParent .getChildren (.remove pane)))
```
