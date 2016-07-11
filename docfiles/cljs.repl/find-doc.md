---
name: cljs.repl/find-doc
see also:
  - cljs.repl/doc
---

## Summary

## Details

Prints documentation for any var whose documentation or name
contains a match for `re-string-or-pattern`.

## Examples

```clj
(find-doc "some")
;; Prints: (docs truncated)
;; - IPrintWriter (docstring match)
;; - contains? (docstring match)
;; - gensym (docstring match)
;; - cljs.core/if-some
;; - some
;; - cljs.core/some->
;; - cljs.core/some->>
;; - some-fn
;; - some?
;; - trampoline (docstring match)
;; - cljs.core/when-some
;; - cljs.core/while (docstring match)
;;
;;=> nil
```

## Signature
[re-string-or-pattern]
