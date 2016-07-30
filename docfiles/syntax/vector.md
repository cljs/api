---
name: syntax/vector
display as: "[] vector"
see also:
  - cljs.core/vector
  - cljs.core/vec
---

## Summary

A vector is the most commonly used form for creating literal sequences.

`[...]`
`[1 2 3]`

Vectors also serve an important language role to prevent you from interpreting
sequences as function calls.  Whether it's for literal data or for _binding forms_
inside [doc:cljs.core/let] and [doc:cljs.core/fn], vectors provide an
important syntax cue not found in other Lisps.

## Details

Elements are inserted at the end via [doc:cljs.core/conj], and can be looked up
via index. See [doc:cljs.core/PersistentVector] for data structure details.

Vectors are the conventional form for representing _binding forms_, that is,
when local names are created and bound to values. Examples:

- `[a b]` as function arg bindings in [`(fn [a b] ...)`][doc:cljs.core/fn]
- `[a 1 b 2]` as let bindings in [`(let [a 1 b 2] ...)`][doc:cljs.core/let]

## Examples

```clj
[1 2 3]
;;=> [1 2 3]
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/let]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/let.md
[doc:cljs.core/conj]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/conj.md
[doc:cljs.core/PersistentVector]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/PersistentVector.md
[doc:cljs.core/fn]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/fn.md
[doc:syntax/list]:https://github.com/cljs/api/blob/master/docfiles/syntax/list.md
