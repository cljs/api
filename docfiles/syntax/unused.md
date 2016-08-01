---
name: syntax/unused
display as: "_ unused"
see also:
clojure doc: http://clojure.org/guides/faq#underscore
---

## Summary

When unused values require a name, it is common to use `_`.

- `(fn [_ _ a]))` - ignore first two function arguments
- `(let [[_ a _ b] ...])` - only bind names to 2nd and 4th values of a sequence

## Details

The compiler does not specially treat `_`.  It is a valid symbol, thus it can
serve as a name for a value.  It is just convention to reserve this name for
values that are not to be referenced.

Multiple `_`'s can be used since duplicate names shadow those that come before.
Thus, `_` actually holds the value of its last binding.

## Examples

Create a function whose first two arguments are ignored:

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

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/add-watch]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/add-watch.md
[doc:cljs.core/let]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/let.md
[doc:syntax/destructure-vector]:https://github.com/cljs/api/blob/master/docfiles/syntax/destructure-vector.md
