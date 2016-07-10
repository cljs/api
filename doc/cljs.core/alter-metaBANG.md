---
name: cljs.core/alter-meta!
related:
  - cljs.core/with-meta
  - cljs.core/vary-meta
---

## Signature
[data f & args]


## Description

Alter the metadata of `data` to be `(apply f its-current-meta args)`.

Metadata of vars cannot be altered since they are statically determined at compile-time.


## Examples

Metadata of symbols and collections can be altered:

```clj
(def a ^:foo [1 2 3])
(meta a)
;;=> {:foo true}

(alter-meta! a assoc :bar true)
(meta a)
;;=> {:foo true, :bar true}
```

Metadata of vars cannot be altered:

```clj
(def a [1 2 3])
(meta #'a)
;;=> {:arglists (), :test nil, :name a, :column 1, :line 1, :file "<cljs repl>", :doc nil, :ns cljs.user}

(alter-meta! #'a assoc :bar true)
(:bar (meta #'a))
;;=> nil
```