## Name
cljs.core/rest

## Signature
[coll]

## Description

Returns a possibly empty sequence of the items after the first item.

Calls `seq` on its argument.

## Related
cljs.core/next
cljs.core/first
cljs.core/drop
cljs.core/pop

## Example#0869af

```clj
(rest [1 2 3])
;;=> (2 3)

(rest [1 2])
;;=> (2)

(rest [1])
;;=> ()

(rest [])
;;=> ()
```
