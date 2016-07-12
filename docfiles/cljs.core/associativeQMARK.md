---
name: cljs.core/associative?
see also:
---

## Summary

Determines if the given collection implements [doc:cljs.core/IAssociative]
(e.g. maps and vectors).

## Details

## Examples

```clj
(associative? [1 2 3])
;;=> true

(associative? {:a 1 :b 2})
;;=> true

(associative? #{1 2 3})
;;=> false

(associative? '(1 2 3))
;;=> false
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/IAssociative]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/IAssociative.md
