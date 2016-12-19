---
name: syntax/js-literal
display as: "#js literal"
see also:
  - cljs.core/js-obj
  - cljs.core/array
  - cljs.core/clj->js
---

## Summary

Create a JavaScript object or array.

- `#js [...]` - JS Array
- `#js {...}` - JS Object (with stringified keys)

## Details

Data in the form of a map `{}` or vector `[]` must follow the `#js` tag, which
will be converted at compile-time to a JavaScript object or array, respectively.

This will not implicitly convert nested data into JavaScript objects or arrays.

## Examples

```clj
#js {:foo 1 :bar 2}
;;=> #js {:foo 1, :bar 2}

#js [1 2 3]
;;=> #js [1 2 3]
```

For readability, it is sometimes preferable to use `clj->js` rather than nested
`#js` tags.

```clj
#js {:foo #js {:bar 1}}
;;=> #js {:foo #js {:bar 1}}

(clj->js {:foo {:bar 1}})
;;=> #js {:foo #js {:bar 1}}
```
