---
name: syntax/comma
display as: ", comma"
see also:
---

## Summary

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
