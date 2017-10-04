---
name: syntax/-Inf
display as: "##-Inf"
known as: Negative Infinity
see also:
  - syntax/Inf
  - syntax/NaN
  - syntax/number
---

## Summary

Floating point representation of Negative Infinity `-∞`.

## Details

## Examples

```clj
##-Inf
;;=> ##-Inf
```

Math with infinities:

```clj
(/ -1 0)
;;=> ##-Inf

(Math/log 0)
;;=> ##-Inf

(* 0 ##-Inf)
;;=> ##NaN
```

Equivalent to the JavaScript symbol `-Infinity`:

```clj
js/-Infinity
;;=> ##-Inf
```
