---
name: syntax/meta
display as: "^ meta"
clojure doc: http://clojure.org/reference/reader#_metadata
see also:
  - syntax/js-tag
  - cljs.core/meta
  - cljs.core/with-meta
  - cljs.core/vary-meta
  - cljs.core/alter-meta!
---

## Summary

Attach metadata to the following symbol or collection.  Use a map to specify
the metadata, or use shorthand:

- `^:foo` => `^{:foo true}`
- `^"foo"` => `^{:tag "foo"}`
- `^foo` => `^{:tag foo}`

## Details

## Examples

Attach metadata to a collection:

```clj
^:foo [1 2 3]
;;=> [1 2 3]
```

View the resulting metadata:

```clj
(meta ^:foo [1 2 3])
;;=> {:foo true}

(meta ^{:foo "bar"} [1 2 3])
;;=> {:foo "bar"}

(meta ^"foo" [1 2 3])
;;=> {:tag "foo"}

(def foo 1)
(meta ^foo [1 2 3])
;;=> {:tag 1}
```

Chain metadata:

```clj
(meta ^:foo ^"foo" [1 2 3])
;;=> {:foo true, :tag "foo"}
```

Generally, metadata maps used purely by the compiler are not evaluated and should be read literally:

```clj
(defn foo [^js x]   ;; ^js => ^{:tag js}   (literal map not evaluated)
  ^js (.-bar x))    ;; ^js => ^{:tag js}   (literal map not evaluated)
```

But here’s one exception— metadata maps are evaluated when placed behind literal collections created at runtime:

```clj
(def foo (+ 1 2 3))
(meta ^foo {})                ;;=> {:tag 6}   not {:tag foo}
(meta ^{:foo (+ 1 2 3)} [])   ;;=> {:foo 6}   not {:foo (+ 1 2 3)}
```
