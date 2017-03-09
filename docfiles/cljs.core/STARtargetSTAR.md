---
name: cljs.core/*target*
see also:
---

## Summary

A string indicating the current ClojureScript target (e.g. `"default"` for browsers,
`"nodejs"` for Node)

## Details

Allows you to know the value of the `:target` compiler option at runtime.

## Examples

```clj
*target*
;;=> "nodejs"
```
