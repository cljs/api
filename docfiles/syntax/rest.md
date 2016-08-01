---
name: syntax/rest
display as: "& rest"
see also:
clojure doc: http://clojure.github.io/clojure/clojure.core-api.html#clojure.core/&
---

## Summary

A concept shared between [doc:syntax/destructure-vector] and [doc:cljs.core/fn]
for binding the rest of the values of a sequence to a name.

- `(fn [... & rest])` - for function arguments
- `(let [[... & rest] ...])` - for sequences

## Details

## Examples

Binding `c` to the rest of the function arguments:

```clj
(defn foo
  [a b & c]
  c)
(foo 1 2 3 4)
;;=> (3 4)
```

Binding `c` to the rest of the destructured values:

```clj
(let [[a b & c]
      [1 2 3 4]]
  c)
;;=> (3 4)
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/fn]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/fn.md
[doc:syntax/destructure-vector]:https://github.com/cljs/api/blob/master/docfiles/syntax/destructure-vector.md
