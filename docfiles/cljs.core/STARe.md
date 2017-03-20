---
name: cljs.core/*e
see also:
  - cljs.core/*1
  - cljs.core/*2
  - cljs.core/*3
---

## Summary

Holds the result of the last exception.  REPL only

## Details

## Examples

```clj
(defn cause-error []
  (throw "Error: something went wrong"))

(cause-error)
;; Error: something went wrong

*e
;;=> "Error: something went wrong"
```
