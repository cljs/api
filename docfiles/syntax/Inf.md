---
name: syntax/Inf
display as: "##Inf"
known as: Infinity
see also:
  - syntax/-Inf
  - syntax/NaN
  - syntax/number
---

## Summary

Floating point representation of Infinity `∞`.

## Details

## Examples

```clj
##Inf
;;=> ##Inf
```

Math with infinities:

```clj
(/ 1 0)
;;=> ##Inf

(* 0 ##Inf)
;;=> ##NaN
```

Equivalent to the JavaScript symbol `Infinity`:

```clj
js/Infinity
;;=> ##Inf
```
