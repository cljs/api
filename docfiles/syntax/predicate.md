---
name: syntax/predicate
display as: "? predicate"
clojure doc: http://dev.clojure.org/display/community/Library+Coding+Standards
see also:
  - syntax/impure
---

## Summary

A naming convention for functions returning true or false (unenforced).
Examples:

- [doc:cljs.core/even?]
- [doc:cljs.core/empty?]
- [doc:cljs.core/contains?]
- [doc:cljs.core/nil?]

## Details

Predicate functions are presumably pure (not having any side-effects on state).

It is sometimes used to name boolean values as well, not just predicate functions.

## Examples

Create a `divisible?` predicate:

```clj
(defn divisible? [n factor]
  (zero? (mod n factor)))

(divisible? 15 3)
;;=> true

(divisible? 15 2)
;;=> false

(filter #(divisible? 15 %) (range 15))
;;=> (1 3 5)
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/empty?]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/emptyQMARK.md
[doc:cljs.core/contains?]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/containsQMARK.md
[doc:cljs.core/even?]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/evenQMARK.md
[doc:cljs.core/nil?]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/nilQMARK.md
