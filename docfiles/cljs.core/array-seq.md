---
name: cljs.core/array-seq
see also:
  - cljs.core/prim-seq
---

## Summary

Creates a `seq` from a JavaScript array or array-like object, starting at index `i` if given.

## Details

## Examples

```clj
(array-seq #js [1 2 3])
;;=> (1 2 3)

(array-seq #js [1 2 3] 1)
;;=> (2 3)
```

Also works on Array-like objects, like NodeList.

```clj
(array-seq (js/document.querySelectorAll "div"))
;;=> ...
```
