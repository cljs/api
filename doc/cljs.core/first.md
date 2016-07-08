## Name
cljs.core/first

## Signature
[coll]

## Description

Returns the first item in `coll` and calls `seq` on its argument.

Returns nil when `coll` is nil.

## Related
cljs.core/rest
cljs.core/next
cljs.core/nth
cljs.core/second
cljs.core/take
cljs.core/ffirst

## Example#40e413

```clj
(first [1 2 3])
;;=> 1

(first [])
;;=> nil
```
