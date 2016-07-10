---
name: cljs.core/doall
related:
  - cljs.core/dorun
  - cljs.core/doseq
---

## Signature
[coll]
[n coll]


## Description

Forces evaluation of a lazy sequence. Often used to see the effects of a
sequence produced via functions that have side effects.

`doall` walks through the successive `next`s of the sequence, returning the head
and causing the entire sequence to reside in memory at one time.


## TODO

What does `n` do here? This description needs work and probably an example.