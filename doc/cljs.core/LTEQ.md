---
name: cljs.core/<=
related:
  - cljs.core/<
---

## Signature
[x]
[x y]
[x y & more]


## Details

Returns true if each successive number argument is greater than or equal to the
previous one, false otherwise.


## Examples

```clj
(<= 1 2)
;;=> true

(<= 2 2)
;;=> true

(<= 3 2)
;;=> false

(<= 2 3 4 5 6)
;;=> true
```