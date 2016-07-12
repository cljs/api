---
name: cljs.core/and
see also:
  - cljs.core/or
  - special/if
---

## Summary

## Details

Evaluates arguments one at a time from left to right. If an argument returns
logical false (nil or false), `and` returns that value and doesn't evaluate any
of the other arguments, otherwise it returns the value of the last argument.

`(and)` returns true.

## Examples

```clj
(and)
;;=> true

(and false)
;;=> false

(and true)
;;=> true

(and true true)
;;=> true

(and true false)
;;=> false

(and false false)
;;=> false
```

`nil` and `false` are the only falsy values and everything else is truthy:

```clj
(and "foo" "bar")
;;=> "bar"

(and "foo" nil)
;;=> nil

(and "foo" false)
;;=> false

(and nil "foo")
;;=> nil

(and false "foo")
;;=> false
```
