---
name: cljs.core/bit-not
---

## Signature
[x]


## Description

Bitwise complement.  Same as `~x` in JavaScript.


## Examples

Bits can be entered using radix notation:

```clj
(bit-not 2r1100)
;;=> -13
```

Same numbers in decimal:

```clj
(bit-not 12)
;;=> -13
```


## TODO

look into how negative numbers are represented in binary (two's complement, but how does this work in JavaScript with floats)
- http://stackoverflow.com/questions/9939760/how-do-i-convert-an-integer-to-binary-in-javascript
- http://stackoverflow.com/questions/16155592/negative-numbers-to-binary-string