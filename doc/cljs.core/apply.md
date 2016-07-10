---
name: cljs.core/apply
related:
  - cljs.core/map
---

## Signature
[f args]
[f x args]
[f x y args]
[f x y z args]
[f a b c d & args]


## Description

Applies function `f` to the argument list formed by prepending intervening
arguments to `args`.


## Examples

```clj
(max 1 2 3)
;;=> 3

(apply max [1 2 3])
;;=> 3

(apply max 1 [2 3])
;;=> 3
```