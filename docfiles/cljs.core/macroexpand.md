---
name: cljs.core/macroexpand
see also:
  - cljs.core/macroexpand-1
  - cljs.core/defmacro
---

## Summary

## Details

(only intended as a REPL utility)

If the given quoted form is a macro call, expand it once, then repeat until a
subsequent result is _not_ a macro call.  NOTE: nested forms are _not_ expanded.

See [doc:cljs.core/macroexpand-1] if you only wish to expand a form once.

## Examples

See how [doc:cljs.core/when] expands to [doc:special/if]:

```clj
(macroexpand '(when true :foo))
;;=> (if true (do :foo))
```

The following goes through three expansion steps, but you can use
[doc:cljs.core/macroexpand-1] to do one at a time instead.

```clj
(macroexpand '(-> 2 inc))
;;=> (js* "(~{} + ~{})" 2 1)
```

Notice how the nested `inc` form is not expanded:

```clj
(macroexpand '(inc (inc 2)))
;;=> (js* "(~{} + ~{})" (inc 2) 1)
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/when]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/when.md
[doc:cljs.core/macroexpand-1]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/macroexpand-1.md
[doc:special/if]:https://github.com/cljs/api/blob/master/docfiles/special/if.md
