---
name: cljs.core/pop
see also:
  - cljs.core/peek
  - cljs.core/rest
  - cljs.core/conj
---

## Summary

## Details

For a list, returns a new list without the first item.

For a vector, returns a new vector without the last item.

## Examples

With vectors:

```clj
(pop [1 2 3])
;;=> [1 2]

(pop [1 2])
;;=> [1]

(pop [1])
;;=> []

(pop [])
;; Error: Can't pop empty vector
```

With lists:

```clj
(pop '(1 2 3))
;;=> (2 3)

(pop '(1 2))
;;=> (2)

(pop '(1))
;;=> ()

(pop '())
;; Error: Can't pop empty list
```
