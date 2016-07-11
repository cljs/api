---
name: syntax/vector
display as: "[] vector"
see also:
  - cljs.core/vector
  - cljs.core/vec
---

## Summary

## Details

Creates a vector.  A vector is the most commonly used form for creating literal
sequences, and supports random-access and inserting at the end via [doc:cljs.core/conj]:

```clj
(def a [1 2 3 4 5])
```

Vectors also serve an important language role as the convention for signaling a
_binding form_, that is, when local names are created and bound to values.
Examples:

- `[a b]` as function arg bindings in [`(fn [a b] ...)`][doc:cljs.core/fn]
- `[a 1 b 2]` as let bindings in [`(let [a 1 b 2] ...)`][doc:cljs.core/let]

This helps differentiate binding forms from the parentheses of [callable forms][doc:syntax/list].

See [doc:cljs.core/PersistentVector] for data structure details.

## Examples

```clj
[1 2 3]
;;=> [1 2 3]
```

## Usage
[...]

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/let]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/let.md
[doc:cljs.core/conj]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/conj.md
[doc:cljs.core/PersistentVector]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/PersistentVector.md
[doc:cljs.core/fn]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/fn.md
[doc:syntax/list]:https://github.com/cljs/api/blob/master/docfiles/syntax/list.md
