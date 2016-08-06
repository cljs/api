---
name: syntax/ns-map
display as: "#: namespaced map"
clojure doc: http://clojure.org/reference/reader#_map_namespace_syntax
see also:
---

## Summary

Provide a default namespace for keyword keys in a map.

```clj
#:a {1 nil, :b nil, :b/c nil, :_/d nil}
;;=> {1 nil, :a/b nil, :b/c nil, :d nil}
```

## Details

## Examples
