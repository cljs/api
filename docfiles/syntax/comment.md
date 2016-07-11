---
name: syntax/comment
display: "; comment"
see also:
  - syntax/ignore
  - cljs.core/comment
  - syntax/shebang
---

## Summary

## Details

"Comments out" everything after `;` on the current line.

## Examples

Add comments to code:

```clj
(def a 1) ; this is a comment
```

It is common to use `;;` for comments that have their own line:

```clj
;; this comment is on its own line
```
