---
name: cljs.core/comment
see also:
---

## Summary

## Details

Ignores all `body` forms (i.e. "commenting out"). Returns nil.

This is often used near the bottom of a file to hold expressions that test
different functions during development.  Specific expressions within the
`comment` can then be selected and evaluated from some editors.

You can also use `;` to "comment out" code until the end of a line.

## Examples

```clj
(comment 123)
;;=> nil

(comment
  (foo 1 2 3)
  (bar "hello"))
;;=> nil
```

Inner forms must still be syntactically correct:

```clj
(comment [1 2 3]])
;; Error: Unmatched delimiter ]

(comment a : b)
;; Error: Invalid token :
```

## Signature
[& body]
