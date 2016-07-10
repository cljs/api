---
name: cljs.core/name
related:
  - cljs.core/namespace
---

## Signature
[x]


## Description

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