## Name
cljs.core/<

## Signature
[x]
[x y]
[x y & more]

## Description

Returns true if each successive number argument is greater than the previous
one, false otherwise.

## Related
cljs.core/<=

## Examples

```clj
(< 1 2)
;;=> true

(< 2 1)
;;=> false

(< 1 1)
;;=> false

(< 2 3 4 5 6)
;;=> true
```
