---
name: syntax/impure
display: "! impure"
related:
  - syntax/predicate
---

## Usage
foo!


## Description

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