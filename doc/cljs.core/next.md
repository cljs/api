---
name: cljs.core/next
related:
  - cljs.core/rest
  - cljs.core/first
  - cljs.core/fnext
---

## Signature
[coll]


## Description

Returns a sequence of the items after the first and calls `seq` on its argument.

Returns nil if `coll` is empty.


## Examples

```clj
(next [1 2 3])
;;=> (2 3)

(next [1 2])
;;=> (2)

(next [1])
;;=> nil

(next [])
;;=> nil
```