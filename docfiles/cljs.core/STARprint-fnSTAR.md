---
name: cljs.core/*print-fn*
see also:
  - cljs.core/*print-err-fn*
  - cljs.core/enable-console-print!
---

## Summary

A var representing the function used to print output, which may differ
between runtime environments.  Use [doc:cljs.core/enable-console-print!] to
print to console.

```clj
(enable-console-print!)
(println "printed to stdout in Node, or to browser console")
```

## Details

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/enable-console-print!]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/enable-console-printBANG.md
