---
name: cljs.core/loop
related:
  - special/recur
---

## Signature
[[& bindings] & body-exprs]


## Details

Evaluates the `body-exprs` in a lexical context in which the symbols in
the binding-forms are bound to their respective init-exprs, just like a `let` form.
Acts as a `recur` target, which will allow tail-call optimization.


## Examples

```clj
(loop [x 0]
  (when (< x 10)
    (println x)
    (recur (+ x 2))))
;; Prints:
;; 0
;; 2
;; 4
;; 6
;; 8
;;
;;=> nil
```
