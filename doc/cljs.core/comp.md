## Name
cljs.core/comp

## Signature
[& fns]

## Description

Takes a set of functions and returns a function that is the composition
of those functions.

The returned function takes a variable number of arguments, applies the
rightmost of `fns` to the arguments, whose result is subsequently applied to
the next left function, and so on.

`((comp a b c) x y)` = `(a (b (c x y)))`

## Related
cljs.core/partial
cljs.core/juxt

## Example#5d3250

```clj
(def f (comp str inc +))
(f 1 2 3)
;;=> "7"
```
