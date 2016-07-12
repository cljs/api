---
name: cljs.core/name
see also:
  - cljs.core/namespace
---

## Summary

## Details

Returns the name string of a possibly namespace-qualified keyword or symbol.

Equivalent to [doc:cljs.core/identity] for strings.

## Examples

With namespaces:

```clj
(name :foo/bar)
;;=> "bar"

(name 'foo/bar)
;;=> "bar"
```

Without namespaces:

```clj
(name :foo)
;;=> "foo"

(name 'foo)
;;=> "foo"
```

Strings have no concept of a namespace:

```clj
(name "foo/bar")
;;=> "foo/bar"

(name "foo")
;;=> "foo"
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/identity]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/identity.md
