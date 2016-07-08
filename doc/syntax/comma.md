## Name
syntax/comma

## Display
, comma

## Description

A comma is treated as whitespace when appearing outside a string.

This is mainly used to help delineate elements in a collection when necessary.

Commas are used when printing maps in the REPL:

```clj
{:foo 1, :bar 2, :bar 3}
```

## Example#68e4a0

```clj
[1, 2, 3, 4]
;;=> [1 2 3 4]

{:foo :bar :baz :quux}
;;=> {:foo :bar, :baz :quux}
```
