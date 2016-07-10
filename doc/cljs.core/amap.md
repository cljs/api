---
name: cljs.core/amap
see also:
  - cljs.core/map
---

## Signature
[a idx ret expr]


## Details

For quickly creating a new JavaScript array by mapping an expression `expr`
across a JavaScript array `a`.  The expression can use `ret` as the current
result, which is initialized to `a`.  It can also use `idx` to get the current
index.


## Examples

```clj
(def a #js [1 2 3])
(amap a i ret (* 10 (aget a i)))
;;=> #js [10 20 30]
```

You can also use `ret` inside the mapped expression if you want to use the
current result:

```clj
(def a #js [1 2 3])
(amap a i ret (+ (if (pos? i)
                   (aget ret (dec i))
                   0)
                 (* 10 (aget a i))))
;;=> #js [10 30 60]
```