---
name: cljs.core/char
---

## Signature
[x]


## Description

Converts a number `x` to a character using `String.fromCharCode(x)` from
JavaScript.


## Examples

```clj
(char 81)
;;=> "Q"

(char "Q")
;;=> "Q"

(char "foo")
;; Error: Argument to char must be a character or number
```