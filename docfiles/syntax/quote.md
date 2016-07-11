---
name: syntax/quote
display: "' quote"
see also:
  - special/quote
---

## Summary

## Details

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
