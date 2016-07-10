---
name: cljs.core/dorun
related:
  - cljs.core/doall
---

## Signature
[coll]
[n coll]


## Details

Forces evaluation of a lazy sequence. Often used to see the effects of a
sequence produced via functions that have side effects.

`dorun` walks through the successive `next`s of the sequence and returns nil.
