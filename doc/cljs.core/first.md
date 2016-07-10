---
name: cljs.core/first
related:
  - cljs.core/rest
  - cljs.core/next
  - cljs.core/nth
  - cljs.core/second
  - cljs.core/take
  - cljs.core/ffirst
---

## Signature
[coll]


## Description

Returns the first item in `coll` and calls `seq` on its argument.

Returns nil when `coll` is nil.


## Examples

```clj
(first [1 2 3])
;;=> 1

(first [])
;;=> nil
```