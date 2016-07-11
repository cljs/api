---
name: cljs.core/*e
see also:
  - cljs.core/*1
  - cljs.core/*2
  - cljs.core/*3
---

## Summary

## Details

Only usable from a REPL.

Holds the result of the last exception.

## Examples

```clj
(defn cause-error []
  (throw "Error: something went wrong"))

(cause-error)
;; Error: something went wrong

*e
;;=> "Error: something went wrong"
```
