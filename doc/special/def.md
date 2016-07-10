---
name: special/def
known as: define
see also:
  - cljs.core/defn
  - cljs.core/fn
  - cljs.core/defmacro
  - cljs.core/defmulti
---

## Signature
[symbol]
[symbol init]
[symbol doc-string init]


## Details

Creates a global variable with the name of `symbol` and a namespace of the
current namespace.

If `init` is supplied, it is evaluated and the result is assigned to `symbol`.

`doc-string` is an optional documentation string.

`def` is one of ClojureScript's [special forms](http://clojure.org/special_forms)
and is used by many macros to define common elements (ie: `defn`, `defmacro`,
etc).

Supported metadata:

- `^:private boolean` - make non-accessible from other namespaces
- `^:dynamic boolean` - make [dynamically bindable][doc:cljs.core/binding] (usually named with [doc:syntax/earmuffs])
- `^:const boolean` - prevents redef and allows it to be used in [doc:cljs.core/case].
- `^:jsdoc [""]` - vector of JSDoc Tags for [Google Closure][closure-jsdoc] or [standard][other-jsdoc].
- `^:test (fn [] (assert ...))` - allows function to be tested with [doc:cljs.core/test].
- `^:doc ""` - doc-string (prefer the use of the `(def symbol doc-string init)`)

[closure-jsdoc]:https://developers.google.com/closure/compiler/docs/js-for-compiler?hl=en#tags
[other-jsdoc]:http://usejsdoc.org/#block-tags

Compiler will also add metadata:

- `:ns`
- `:name`
- `:file`
- `:line`, `:end-line`
- `:column`, `:end-column`
- `:source`
- `:arglists`


## Examples

```clj
(def a)
a
;;=> nil

(def b 42)
b
;;=> 42

(def c "an optional docstring" 42)
c
;;=> 42
```


## TODO

Need to include something about metadata here?