---
name: syntax/dot
display as: ". dot"
see also:
  - syntax/symbol
  - syntax/namespace
---

## Summary

Dots can be used inside symbols for JS interop.

`(.foo bar)` => `bar.foo()`
`(-.foo bar)` => `bar.foo`
`(foo.)` => `new foo()`

The following are also supported (though not valid in Clojure)

`foo.bar.baz` => `foo.bar.baz`
`(foo.bar.baz)` => `foo.bar.baz()`

## Details

A dot's meaning depends on its position in the symbol:

- `.` (by itself), `.-foo`, `.foo` all refer to the interop [`. (special form)`][doc:special/.].
- `foo.` is constructor sugar, meaning [`(new foo)`][doc:special/new].
- `(ns foo.bar)` and `foo.bar/baz` means that `foo.bar` is a nested namespace.
- `foo/bar.baz` or `bar.baz` means `bar.baz` is nested JS property access (__not allowed in clojure__).

## Examples

For interop:

```clj
(def obj #js {:age 28, :greet #(str "Hi " %)})

(. obj greet "Bob")
;;=> "Hi Bob"

(.greet obj "Bob")
;;=> "Hi Bob"

(. obj -age)
;;=> 28

(.-age obj)
;;=> 28
```

For constructor:

```clj
(deftype Foo [x]
   Object
   (toString [_] (str "Foo:" x)))

(Foo. 1)
;;=> #<Foo: 1>

(new Foo 1)
;;=> #<Foo: 1>
```

For nested namespaces:

```clj
(ns example.nested.core)
(def foo 1)
example.nested.core/foo
;;=> 1
```

For nested JS properties.  The following pairs are equivalent:

```clj
(js/console.log "HELLO")
;; "HELLO"

(.log js/console "HELLO")
;; "HELLO"
```

```clj
cljs.core/PersistentQueue.EMPTY
;;=> #queue []

(.-EMPTY cljs.core/PersistentQueue)
;;=> #queue []
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:special/.]:https://github.com/cljs/api/blob/master/docfiles/special/DOT.md
[doc:special/new]:https://github.com/cljs/api/blob/master/docfiles/special/new.md
