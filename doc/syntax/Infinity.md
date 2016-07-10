---
name: syntax/Infinity
display: "Infinity"
see also:
  - syntax/number
  - syntax/NaN
---

## Usage
Infinity
-Infinity
+Infinity


## Details

The IEEE 754 Floating Point representations of infinity.

`Infinity` = `+Infinity` = positive infinity

`-Infinity` = negative infinity


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