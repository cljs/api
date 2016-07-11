---
name: cljs.core/aget
see also:
  - cljs.core/..
  - cljs.core/aset
  - cljs.core/get
  - cljs.core/nth
---

## Summary

## Details

Returns the value at index `i` of a JavaScript array.

```clj
(def a #js [1 2 3])
(aget a 0)
;;=> 1
```

Retrieve nested elements with the additional `idxs` arguments.

```clj
(def a #js [1 2 #js [3 4]])
(aget a 2 0)
;;=> 3
```

For JavaScript objects, use [`goog.object/get`] or the multi-arity [`goog.object/getValueByKeys`].

```clj
(require 'goog.object)
(def obj #js {:foo #js {:bar 2}})

(goog.object/get obj "foo")
;;=> #js {:bar 2} 

(goog.object/getValueByKeys obj "foo" "bar")
;;=> 2
```

[`goog.object/get`]:http://google.github.io/closure-library/api/namespace_goog_object.html#get
[`goog.object/getValueByKeys`]:http://google.github.io/closure-library/api/namespace_goog_object.html#getValueByKeys

## Examples

## Signature
[array i]
[array i & idxs]
