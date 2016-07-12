---
name: cljs.core/aset
see also:
  - cljs.core/aget
  - special/set!
  - cljs.core/assoc-in
---

## Summary

## Details

Sets `val` at index `i` in a JavaScript array.

```clj
(def a #js [1 2 3])
(aset a 0 "foo")
a
;;=> #js ["foo" 2 3]
```

Set nested elements with the additional `idxs` arguments.

```clj
(def a #js [1 2 #js [3 4]])
(aset a 2 0 "foo")
a
;;=> #js [1 2 #js ["foo" 4]]
```

For JavaScript objects, use [`goog.object/set`].

[`goog.object/set`]:http://google.github.io/closure-library/api/namespace_goog_object.html#set

```clj
(require 'goog.object)
(def obj #js {:foo 1})

(goog.object/set obj "foo" "bar")
obj
;;=> #js {:foo "bar"}
```

## Examples
