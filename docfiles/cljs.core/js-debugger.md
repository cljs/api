---
name: cljs.core/js-debugger
see also:
---

## Summary

## Details

Creates breakpoint that will stop the debugger if the browser's devtools are
open.  Equivalent to `debugger;` in JavaScript.

## Examples

```clj
(defn foo []
  (println "HI")
  (js-debugger)
  (println "WORLD"))

(foo)
;; will print "HI" then pause JS inside this function
;; if browser devtools are open.
```
