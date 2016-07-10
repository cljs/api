---
name: cljs.core/or
related:
  - cljs.core/and
  - special/if
---

## Signature
[]
[x]
[x & next]


## Details

Evaluates arguments one at a time from left to right. If an argument returns
logical true, `or` returns that value and doesn't evaluate any of the other
arguments, otherwise it returns the value of the last argument.

`(or)` returns nil.


## Examples

```clj
(or)
;;=> nil

(or false)
;;=> false

(or true)
;;=> true

(or true true)
;;=> true

(or true false)
;;=> true

(or false false)
;;=> false
```

`nil` and `false` are the only falsy values and everything else is truthy:

```clj
(or "foo" "bar")
;;=> "bar"

(or "foo" nil)
;;=> "foo"

(or "foo" false)
;;=> "foo"

(or nil "foo")
;;=> "foo"

(or false "foo")
;;=> "foo"
```