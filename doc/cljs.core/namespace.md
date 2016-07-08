## Name
cljs.core/namespace

## Description

Returns the namespace string of a possibly namespace-qualified keyword or symbol.

Returns [doc:syntax/nil] if not present.

## Related
cljs.core/name

## Example#5bd3b4

With namespaces:

```clj
(namespace :foo/bar)
;;=> "foo"

(namespace 'foo/bar)
;;=> "foo"
```

Without namespaces:

```clj
(namespace :foo)
;;=> nil

(namespace 'foo)
;;=> nil
```

Strings have no concept of a namespace:

```clj
(name "foo/bar")
;;=> nil
```
