---
name: syntax/whitespace
display as: "whitespace"
see also:
  - syntax/comma
---

## Summary

## Details

The amount of whitespace between syntax forms does not affect syntax
correctness.  Elements are free to be aligned as desired.

Indentation is conventionally two spaces, no tab characters.
[More indentation conventions here](https://github.com/bbatsov/clojure-style-guide#source-code-layout--organization)

Whitespace around collection delimiters is not required:

```clj
(a(b(c)))
```

```clj
#js[1 2 3]
#inst"2015-10-12"
```

A [comma][doc:syntax/comma] is considered whitespace:

```clj
[1, 2, 3]
{:foo 1, :bar 2}
```

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/comma]:https://github.com/cljs/api/blob/master/docfiles/syntax/comma.md
