---
name: syntax/Infinity
display as: "Infinity"
see also:
  - syntax/number
  - syntax/NaN
---

## Summary

Floating point representation of Infinity.

`Infinity` = `+Infinity`
`-Infinity`

## Details

## Examples

```clj
Infinity
;;=> Infinity

+Infinity
;;=> Infinity

-Infinity
;;=> -Infinity
```

Math with infinities:

```clj
(/ 1 0)
;;=> Infinity

(Math/log 0)
;;=> -Infinity

(* 0 Infinity)
;;=> NaN
```

They are equivalent to the JavaScript symbols:

```clj
js/Infinity
;;=> Infinity

js/-Infinity
;;=> -Infinity
```
