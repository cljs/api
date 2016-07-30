---
name: syntax/var
display as: "#' var"
see also:
  - special/var
---

## Summary

To retrieve metadata like where a var was defined, we need to refer to the var
itself.  It is therefore helpful to be aware of the following subtle differences:

`foo` => returns value bound to foo
`'foo` => returns the symbol foo (which is just a name)
`#'foo` => returns the foo var itself (for retrieving metadata like where it was defined)

## Details

`#'foo` is sugar for [`(var foo)`][doc:special/var].

Mainly used in conjunction with [doc:cljs.core/meta].

## Examples

Access the metadata of a var:

```clj
(def x 123)
(meta #'x)
;;=> {:arglists (), :test nil, :name x, :column 1, :line 1, :file "<cljs repl>", :doc nil, :ns cljs.user}
```

Deref a var for a roundabout way to retrieve its value:

```clj
(def x 123)
@#'x
;;=> 123

;; same as above
(deref (var x))
;;=> 123
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:special/var]:https://github.com/cljs/api/blob/master/docfiles/special/var.md
