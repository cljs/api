---
name: cljs.core/*clojurescript-version*
see also:
---

## Summary

A string indicating the current ClojureScript version.

## Details

The ClojureScript compiler sets the var at compile time, allowing compiled code
to know the version of the compiler that produced it.

As a plain string, it follows a different format from Clojure's `*clojure-version*`,
which contains separate keys for `major`, `minor`, `incremental`, and `qualifier`.

## Examples

```clj
*clojurescript-version*
;;=> "1.9.456"
```
