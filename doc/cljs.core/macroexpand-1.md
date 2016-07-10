---
name: cljs.core/macroexpand-1
see also:
  - cljs.core/macroexpand
  - cljs.core/defmacro
---

## Details

(only intended as a REPL utility)

If the given quoted form is a macro call, expand it once. NOTE: subforms are
_not_ expanded.

See [doc:cljs.core/macroexpand] if you wish to repeatedly expand a form.


## Examples

See how `(-> 2 inc)` is progressively expanded:

```clj
(macroexpand-1 '(-> 2 inc))
;;=> (inc 2)

(macroexpand-1 '(inc 2))
;;=> (cljs.core/+ 2 1)

(macroexpand-1 '(cljs.core/+ 2 1))
;;=> (js* "(~{} + ~{})" 2 1)
```

Notice how the nested `inc` form is not expanded:

```clj
(macroexpand-1 '(inc (inc 2)))
;;=> (cljs.core/+ (inc 2) 1)
```
