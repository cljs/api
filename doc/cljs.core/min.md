---
name: cljs.core/min
related:
  - cljs.core/max
  - cljs.core/min-key
---

## Signature
[x]
[x y]
[x y & more]


## Details

Returns the least number argument.


## Examples

```clj
(min 1 2 3 4)
;; => 1
```

Apply it to a collection:

```clj
(apply min [1 2 3 4])
;; => 1
```
