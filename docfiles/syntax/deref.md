---
name: syntax/deref
display as: "@ deref"
see also:
  - cljs.core/deref
  - cljs.core/atom
  - cljs.core/delay
---

## Summary

## Details

`@foo` is sugar for [`(deref foo)`][doc:cljs.core/deref].

Retrieve the underlying value of a reference.  References can be created by
[doc:cljs.core/atom] or [doc:cljs.core/delay].

## Examples

```clj
(def a (atom 1))
@a
;;=> 1

(deref a)
;;=> 1
```

## Usage
@foo

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/delay]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/delay.md
[doc:cljs.core/deref]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/deref.md
[doc:cljs.core/atom]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/atom.md
