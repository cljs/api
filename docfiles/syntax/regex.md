---
name: syntax/regex
display as: "#\"\" regex"
see also:
  - cljs.core/re-pattern
  - cljs.core/re-find
  - cljs.core/re-seq
  - cljs.core/re-matches
---

## Summary

Regular expressions compile to native [JavaScript regular expressions].

[JavaScript regular expressions]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions

`#"..."` => js `/.../`
`#"(?i)..."` => js `/.../i` (case-insensitive)
`#"(?m)..."` => js `/.../m` (multi-line)

## Details

The concept of "global match" (i.e. `/.../g` in JavaScript) is not encoded
in ClojureScript regular expressions.  Instead, use a function like
[doc:cljs.core/re-seq] to perform global matches.

## Examples

```clj
#"foo"
;;=> #"foo"

(re-seq #"foo" "FOO BAR foo bar")
;;=> ("foo")
```

Case-insensitive matching:

```clj
#"(?i)foo"
;;=> #"foo"

(re-seq #"(?i)foo" "FOO BAR foo bar")
;;=> ("FOO" "foo")
```
