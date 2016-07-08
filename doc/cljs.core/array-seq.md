## Name
cljs.core/array-seq

## Signature
[array]
[array i]

## Description

Creates a `seq` from a JavaScript array, starting at index `i` if given.

## Example#9ef6de

```clj
(array-seq #js [1 2 3])
;;=> (1 2 3)

(array-seq #js [1 2 3] 1)
;;=> (2 3)
```
