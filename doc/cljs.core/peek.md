---
name: cljs.core/peek
related:
  - cljs.core/first
  - cljs.core/pop
  - cljs.core/conj
---

## Signature
[coll]


## Description

Returns the first element of a list; same as `first`.

Returns the last element of a vector, and much more efficient than using `last`.

Returns nil if `coll` is empty.


## Examples

With vectors:

```clj
(peek [1 2 3])
;;=> 3

(peek [1 2])
;;=> 2

(peek [1])
;;=> 1

(peek [])
;;=> nil
```

With lists:

```clj
(peek '(1 2 3))
;;=> 1

(peek '(1 2))
;;=> 1

(peek '(1))
;;=> 1

(peek '())
;;=> nil
```