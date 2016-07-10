---
name: clojure.string/split
see also:
  - cljs.core/subs
  - clojure.string/replace
  - clojure.string/split-lines
---

## Signature
[s re]
[s re limit]


## Details

Splits string on a regular expression. Optional argument limit is the maximum
number of splits. Not lazy. Returns vector of the splits.
