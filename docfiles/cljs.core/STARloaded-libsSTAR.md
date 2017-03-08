---
name: cljs.core/*loaded-libs*
see also:
---

## Summary

A set of strings indicating the namespaces currently loaded in the REPL.

## Details

Only usable from a REPL.

Updated anytime a namespace is required.

## Examples

```clj
*loaded-libs*
;;=> #{"cljs.spec" "clojure.walk" "goog.object" "clojure.string"
;;     "cljs.repl" "goog.string" "cljs.spec.impl.gen" "cljs.core"
;;     "cljs.pprint" "goog.string.StringBuffer"}

(require 'clojure.set)
*loaded-libs*
;;=> #{"clojure.set" ...other libs shown above...}
```
