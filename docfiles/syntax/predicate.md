---
name: syntax/predicate
display: "? predicate"
see also:
  - syntax/impure
---

## Summary

## Details

A naming convention for predicate functions (unenforced).

A predicate function is one that returns `true` or `false`, and is presumably
pure (not having any side-effects on state).

Some predicate functions which use this convention:

- [doc:cljs.core/even?]
- [doc:cljs.core/empty?]
- [doc:cljs.core/contains?]
- [doc:cljs.core/nil?]

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

## Usage
foo?

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/empty?]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/emptyQMARK.md
[doc:cljs.core/contains?]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/containsQMARK.md
[doc:cljs.core/even?]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/evenQMARK.md
[doc:cljs.core/nil?]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/nilQMARK.md
