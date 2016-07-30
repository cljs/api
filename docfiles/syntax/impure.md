---
name: syntax/impure
display as: "! impure"
see also:
  - syntax/predicate
---

## Summary

A naming convention sometimes applied to functions that perform mutations.  Examples:

- [doc:special/set!]
- [doc:cljs.core/swap!]
- [doc:cljs.core/conj!]
- [doc:cljs.core/specify!]

## Details

In Clojure, it is used only for things not safe in an STM transaction ([source][stm]),
which does not apply to ClojureScript because its compilation target, JavaScript,
is single-threaded.

[stm]:http://dev.clojure.org/display/community/Library+Coding+Standards

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

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/conj!]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/conjBANG.md
[doc:cljs.core/specify!]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/specifyBANG.md
[doc:cljs.core/swap!]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/swapBANG.md
[doc:special/set!]:https://github.com/cljs/api/blob/master/docfiles/special/setBANG.md
