---
name: cljs.core/doall
see also:
  - cljs.core/dorun
  - cljs.core/doseq
---

## Summary

## Details

Forces evaluation of a lazy sequence. Often used to see the effects of a
sequence produced via functions that have side effects.

`doall` walks through the successive `next`s of the sequence, returning the head
and causing the entire sequence to reside in memory at one time.

## Examples
