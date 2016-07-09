## Name
syntax/quote

## Display
' quote

## Description

`'foo` is sugar for [`(quote foo)`][doc:special/quote].

Prevent the evaluation of the following form.

## Related
special/quote

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
