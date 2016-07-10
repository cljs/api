---
name: syntax/list
display: "() list"
related:
  - syntax/vector
  - syntax/quote
---

## Usage
(...)


## Details

Creates a list.  The most salient feature of a list is that, when evaluated, it
is interpreted as a _call_.

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