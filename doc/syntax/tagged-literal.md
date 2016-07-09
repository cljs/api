## Name
syntax/tagged-literal

## Display
# tagged literal

## Usage
#foo ...

## Description

A tagged literal is a way to tag another core syntax literal to represent a
single, new literal.

- `#foo []`
- `#foo {}`
- `#foo "bar"`
- `#foo 123`
- ...

If a [symbol][doc:syntax/symbol] is prefixed by `#`, that symbol is considered a
__tag__ for the following form.  Together they represent a new value.  Real
examples:

- `#js {:foo 1}`, map -> JavaScript object
- `#inst "2015-01-12"` string -> Date

In these examples, the values `{:foo 1}` and `"2015-01-12"` are read normally,
but are further interpretted by their registered tag handlers to produce new
values: a JavaScript object and Date, respectively.

These tagged literals are the "extensible" part of extensible data notation
([edn]), with ClojureScript being a superset of edn.

[edn]:https://github.com/edn-format/edn#tagged-elements

ClojureScript supports the following tagged literals:

- [doc:syntax/inst-literal]
- [doc:syntax/uuid-literal]
- [doc:syntax/js-literal]
- [doc:syntax/queue-literal]

## Related
syntax/dispatch

## Examples

(Tagged literals are printed as themselves, just like core syntax literals.)

literal JavaScript object:

```clj
#js {:foo 1}
;;=> #js {:foo 1}

(def foo 1)
#js {:foo foo}
;;=> #js {:foo 1}
```

literal queue:

```clj
#queue [1 2 3]
;;=> #queue [1 2 3]

(conj #queue [1 2 3] 4)
;;=> #queue [1 2 3 4]
```

literal instant of time (date):

```clj
#inst "2014-10-13"
;;=> #inst "2014-10-13T00:00:00.000-00:00"
```

literal UUID:

```clj
#uuid "97bda55b-6175-4c39-9e04-7c0205c709dc"
;;=> #uuid "97bda55b-6175-4c39-9e04-7c0205c709dc"
```
