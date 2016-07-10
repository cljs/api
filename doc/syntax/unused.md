---
name: syntax/unused
display: "_ unused"
---

## Details

`_` is a valid symbol name that indicates an unused or disregarded value.
This is not enforced by the compiler.

For example, create a function whose first two arguments are ignored:

```clj
(fn [_ _ a]
  (println a))
```

Ignore the first and third value of a [destructured][doc:syntax/destructure-vector] sequence:

```clj
(let [ [_ a b _ c]
       [1 2 3 4 5] ]
  (println a b c))
;; 2 3 5
```

Ignore return values of debug statements in a [doc:cljs.core/let] block:

```clj
(let [a 1
      _ (println a)
      b (+ a 2)
      _ (println b)
      c (+ b 3)]
  ...)
```

Multiple `_`'s can be used in each of the previous examples because duplicate
names will shadow those previously occurring.  Thus, `_` actually holds the
value of its last binding, but using it should be strictly avoided to prevent
confusion.  This is the only encouraged use-case for duplicating parameter
names.


## Examples

It is common to use `_` to ignore all but the latest value of a changing atom
inside an [doc:cljs.core/add-watch] callback:

```clj
(def a (atom 1))

(add-watch a :foo
  (fn [_ _ _ s]
    (println s)))

(reset! a 2)
;; 2
```