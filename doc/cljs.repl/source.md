---
name: cljs.repl/source
related:
  - cljs.repl/doc
---

## Signature
[name]


## Description

Prints the source code for the given symbol `name`, if it can find it.  This
requires that the symbol resolve to a Var defined in a namespace for which the
.cljs is in the classpath.


## Examples

```clj
(source comment)
;; Prints:
;; (defmacro comment
;;   "Ignores body, yields nil"
;;   {:added "1.0"}
;;   [& body])
;;
;;=> nil
```