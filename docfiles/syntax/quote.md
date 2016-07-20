---
name: syntax/quote
display as: "' quote"
see also:
  - special/quote
---

## Summary

Return the following form without evaluation, especially for symbols and lists.

`'foo` => `foo`
`'(foo)` => `(foo)`

## Details

Quote a form to get its literal value after reading, rather than
the value created after evaluation.

`'foo` is sugar for [`(quote foo)`][doc:special/quote].

Prevent the evaluation of the following form.

## Examples

```clj
'foo
;;=> foo

'(a b c)
;;=> (a b c)

'[a b c]
;;=> [a b c]

'(a b (c d))
;;=> (a b (c d))
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:special/quote]:https://github.com/cljs/api/blob/master/docfiles/special/quote.md
