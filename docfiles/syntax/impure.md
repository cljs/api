---
name: syntax/impure
display as: "! impure"
see also:
  - syntax/predicate
---

## Summary

## Details

A naming convention for impure functions (unenforced).

Impure functions are those that have side-effects on some state.

Some impure functions which use this convention:

- [doc:special/set!]
- [doc:cljs.core/swap!]
- [doc:cljs.core/conj!]
- [doc:cljs.core/specify!]

## Examples

The following causes a side-effect in the state of `a`:

```clj
(def a (atom 1))
@a
;;=> 1

(reset! a 2)
@a
;;=> 2
```

## Usage
foo!

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/conj!]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/conjBANG.md
[doc:cljs.core/specify!]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/specifyBANG.md
[doc:cljs.core/swap!]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/swapBANG.md
[doc:special/set!]:https://github.com/cljs/api/blob/master/docfiles/special/setBANG.md
