---
name: syntax/symbol
display as: "symbol literal"
see also:
  - cljs.core/symbol
  - cljs.core/symbol?
---

## Summary

A symbol is intended as a name for a value.  When evaluated, its result will be
the value bound to the symbol.

- `foo` - evaluates to the value bound to `foo`

## Details

Some naming rules:

- must not begin with a number
- can contain special characters `. * + ! - _ ? $ % & = < > : #`, as long as:
  - if starting with `-`, `+`, or `.`, next character cannot be numeric (would be interpreted as number)
  - cannot start with `:` and `#`
- symbols starting or ending with a decimal are reserved for interop purposes (see [doc:syntax/dot])

Symbols can use a single `/` for an optional namespace. See [doc:syntax/namespace]:

- `foo/bar` => value of `bar` in the `foo` namespace

To access symbols in the global JavaScript context, use the [doc:syntax/js-namespace]:

- `js/document` => global `document` JavaScript object

Dots can also be included in symbols for direct JS property access, see [doc:syntax/dot]:

- `js/console.log` => the `console.log` JavaScript function

## Examples

The following has two symbols, `def` and `a`:

```clj
(def a 1)
```

The evaluation of the symbols is controlled by the evaluation of the list `(def
a 1)`.  `def` evaluates to a special form, which suppresses the evaluation of
`a` since it is just being used as a name for the bound value `1`.

When a symbol is by itself, it will evaluated to 1:

```clj
a
;;=> 1
```

To signify an unevaluated symbol, precede it with a quote:

```clj
'a
;;=> a
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/js-namespace]:https://github.com/cljs/api/blob/master/docfiles/syntax/js-namespace.md
[doc:syntax/namespace]:https://github.com/cljs/api/blob/master/docfiles/syntax/namespace.md
[doc:syntax/dot]:https://github.com/cljs/api/blob/master/docfiles/syntax/dot.md
