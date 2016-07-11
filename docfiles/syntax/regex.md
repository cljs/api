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

## Details

Signifies a regular expression. Represented as native [JavaScript regular expressions].

[JavaScript regular expressions]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions

An inline modifier can be included at the beginning of the regex:

|  modifier          | ClojureScript | JavaScript |
|--------------------|---------------|------------|
|  global match      | N/A           | `/foo/g`   |
|  case-insensitive  | `#"(?i)foo"`  | `/foo/i`   |
|  multi-line        | `#"(?m)f.*o"` | `/f.*o/m`  |

Global matches (i.e. multiple matches per line) can be achieved using `re-seq`.

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

## Usage
#"..."
