---
name: syntax/quote
display: "' quote"
related:
  - special/quote
---

## Description

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