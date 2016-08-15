---
name: syntax/deref
display as: "@ deref"
clojure doc: http://clojure.org/reference/reader#_deref
see also:
  - cljs.core/deref
  - cljs.core/atom
  - cljs.core/delay
---

## Summary

Get the value that a reference is currently referring to.  A "reference" can
be a [doc:cljs.core/atom], [doc:cljs.core/delay], or [doc:cljs.core/var].

- `@foo` - returns value at reference `foo`

## Details

`@foo` is sugar for [`(deref foo)`][doc:cljs.core/deref].

## Examples

An [doc:cljs.core/atom] is a mutable reference to an immutable value.

```clj
(def a (atom 1))
@a
;;=> 1

(reset! a 2)
@a
;;=> 2
```

A [doc:cljs.core/delay] will evaluate by executing the given expression
the first time it is dereferenced.

```clj
(def a (delay (do (println "delayed.") 1)))
@a
;; prints:
;;  delayed.
;;=> 1

@a
;;=> 1
```

Evaluating a symbol naturally dereferences the value of a [doc:cljs.core/var].
But a var reference can be dereferenced as a roundabout way to obtain its value.
(Var references are mainly used to retrieve metadata on that var).

```clj
(def ^{:doc "my var"} a 1)
(:doc (meta #'a))
;;=> "my var"

(deref (var a))
;;=> 1

;; combining shorthand forms instead
@#'a
;;=> 1
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/delay]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/delay.md
[doc:cljs.core/var]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/var.md
[doc:cljs.core/deref]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/deref.md
[doc:cljs.core/atom]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/atom.md
