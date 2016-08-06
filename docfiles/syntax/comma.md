---
name: syntax/comma
display as: ", comma"
clojure doc: http://clojure.org/reference/reader#_maps
edn doc: https://github.com/edn-format/edn#general-considerations
see also:
---

## Summary

Commas are ignored and can be used for assisting readability.

- `[1, 2, 3]` => `[1 2 3]`
- `{:a 1, :b 2}` => `{:a 1 :b 2}`

## Details

A comma is treated as whitespace when appearing outside a string.

This is mainly used to help delineate elements in a collection when necessary.

Commas are used when printing maps in the REPL:

```clj
{:foo 1, :bar 2, :bar 3}
```

## Examples

```clj
[1, 2, 3, 4]
;;=> [1 2 3 4]

{:foo :bar :baz :quux}
;;=> {:foo :bar, :baz :quux}
```
