---
name: compiler-options/source-map
see also:
---

## Summary

Enable source maps for stack traces in Node.js and for debugging in the browser.
Option is a boolean, or a string path if optimizations are enabled.

```clj
:source-map true              ;; <-- when :optimizations :none
:source-map "out/main.js.map" ;; <-- otherwise
```

## Details

See [ClojureScript Source Maps](https://clojurescript.org/reference/source-maps)
for details.

## Examples
