---
name: cljs.core/distinct?
related:
  - cljs.core/distinct
---

## Signature
[x]
[x y]
[x y & more]


## Description

Returns true if no two of the arguments are `=`


## Examples

```clj
(distinct? 1)
;;=> true

(distinct? 1 2)
;;=> true

(distinct? 1 1)
;;=> false

(distinct? 1 2 3)
;;=> true

(distinct? 1 2 1)
;;=> false
```

Apply it a collection:

```clj
(apply distinct? [1 2 3])
;;=> true

(apply distinct? [1 2 1])
;;=> false
```
