---
name: cljs.core/dorun
see also:
  - cljs.core/doall
---

## Summary

## Details

Forces evaluation of a lazy sequence. Often used to see the effects of a
sequence produced via functions that have side effects.

`dorun` walks through the successive `next`s of the sequence and returns nil.

## Examples

## Signature
[coll]
[n coll]
