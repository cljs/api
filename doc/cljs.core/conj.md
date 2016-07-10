---
name: cljs.core/conj
known as: conjoin
related:
  - cljs.core/cons
  - cljs.core/into
  - cljs.core/peek
  - cljs.core/pop
---

## Signature
[]
[coll]
[coll x]
[coll x & xs]


## Details

conj(oin)

Returns a new collection with the `x`s "added" to `coll`.

The "addition" may happen at different "places" depending on the collection
type.

`(conj nil item)` returns `(item)`.


## Examples

Append a vector:

```clj
(conj [1 2 3] 4)
;;=> [1 2 3 4]
```

Prepend a list:

```clj
(conj (list 1 2 3) 0)
;;=> (0 1 2 3)
```

Prepend a sequence:

```clj
(def x (range 1 4))
;;=> (1 2 3)

(conj x 0)
;;=> (0 1 2 3)
```

Add to set:

```clj
(conj #{"a" "b" "c"} "d")
;;=> #{"a" "b" "c" "d"}
```


## TODO
should add a table here of how things are "added" to different collection types