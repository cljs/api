---
name: syntax/number
display as: "number literal"
see also:
  - syntax/Infinity
  - syntax/NaN
  - cljs.core/number?
  - cljs.core/integer?
  - cljs.core/int
---

## Summary

ClojureScript numbers are the same as [JavaScript numbers] (floats).
Available formats:

decimal `123` `1.23`
exponent `12e3` `1.2e3` `1.2e-3`
hexadecimal `0x123`
octal `0123`
binary `2r0110`
arbitrary `NrXXX` where `(<= 2 N 36)` and `X` is in `[0-9,A-Z]`

[JavaScript numbers]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Numbers_and_dates#Numbers

## Details

Numbers are double-precision 64-bit format IEEE 754.

Decimal points are not allowed when specifying a custom base.

## Examples

```clj
123
;;=> 123

123.45
;;=> 123.45
```

Scientific notation;

```clj
12e3
;;=> 12000

1.2e-3
;;=> 0.0012
```

Standard hex and octal notations:

```clj
0x1f
;;=> 31

010
;;=> 8
```

Radix notation for using up to base 36.

```clj
2r10111
;;=> 23

8r32
;;=> 26

16rFF
;;=> 255

36rZ
;;=> 35
```
