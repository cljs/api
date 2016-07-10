---
name: cljs.repl/doc
related:
  - cljs.repl/find-doc
  - cljs.core/meta
  - special/var
---

## Signature
[name]


## Details

Prints documentation for the var or special form with the name `name`.


## Examples

```clj
(doc map)
;; Prints:
;;  -------------------------
;;  cljs.core/map
;;  [f coll]
;;    Returns a lazy sequence consisting of the result of applying f to
;;    the set of first items of each coll, followed by applying f to the
;;    set of second items in each coll, until any one of the colls is
;;    exhausted.  Any remaining items in other colls are ignored. Function
;;    f should accept number-of-colls arguments. Returns a transducer when
;;    no collection is provided.
;;
;;=> nil
```