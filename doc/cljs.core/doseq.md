---
name: cljs.core/doseq
related:
  - cljs.core/doall
  - cljs.core/dorun
  - cljs.core/for
  - cljs.core/dotimes
---

## Signature
[seq-exprs & body]


## Details

Repeatedly executes `body` (presumably for side-effects) with bindings and
filtering as provided by `for`. Does not retain the head of the sequence.

Returns nil.


## TODO

This needs a better explanation and example.