---
name: cljs.core/last
related:
  - cljs.core/first
  - cljs.core/next
  - cljs.core/rest
  - cljs.core/butlast
  - cljs.core/take-last
---

## Signature
[coll]


## Description

Returns the last item in `coll` in linear time.

`peek` is much faster than `last` for a vector.


## Examples

```clj
(last [1 2 3])
;;=> 3

(last [1 2])
;;=> 2

(last [1])
;;=> 1

(last [])
;;=> nil
```