## Name
cljs.core/*e

## Description

Only usable from a REPL.

Holds the result of the last exception.

## Related
cljs.core/*1
cljs.core/*2
cljs.core/*3

## Examples

```clj
(defn cause-error []
  (throw "Error: something went wrong"))

(cause-error)
;; Error: something went wrong

*e
;;=> "Error: something went wrong"
```
