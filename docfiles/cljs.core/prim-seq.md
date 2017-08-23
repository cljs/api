---
name: cljs.core/prim-seq
see also:
  - cljs.core/array-seq
---

## Summary

Creates a `seq` from a JavaScript array or array-like object.

## Details

## Examples

```clj
(prim-seq #js [1 2 3])
;;=> (1 2 3)
```

Also works on Array-like objects, like NodeList.

```clj
(prim-seq (js/document.querySelectorAll "div"))
;;=> ...
```
