---
name: syntax/list
display as: "() list"
clojure doc: http://clojure.org/reference/reader#_lists
edn doc: https://github.com/edn-format/edn#lists
see also:
  - syntax/vector
  - syntax/quote
---

## Summary

A list is interpreted as a _call_ when evaluated.

- `(...)`
- `(foo 1 2 3)` - call foo with arguments 1, 2, 3

## Details

In most languages, the parenthesis is on the right side of a function when
calling:

```js
// (not ClojureScript)
f(a, b)
```

In ClojureScript, the parenthesis simply starts on the left side:

```clj
;; ClojureScript (comma is optional)
(f a, b)
```

Thus, when `(f a b)` is evaluated, it calls `f` with two arguments `a` and `b`.

If `f` is a function, its arguments `a` and `b` will be evaluated before
the function receives them.

If `f` is a special form or macro, it will receive its arguments `a` and `b`
unevaluated, where they _may_ be evaluated internally.

(See [doc:cljs.core/List] for data structure details.)

## Examples

The following is a list that is evaluated to create var `a`:

```clj
(def a 1)
```

An empty list is unevaluated and left as an empty list:

```clj
()
;;=> ()
```

To signify an unevaluated list, precede it with a quote:

```clj
'(1 2 3)
;;=> (1 2 3)
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/List]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/List.md
