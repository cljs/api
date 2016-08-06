---
name: syntax/string
display as: "\"\" string"
clojure doc: http://clojure.org/reference/reader#_literals
edn doc: https://github.com/edn-format/edn#strings
see also:
  - cljs.core/str
---

## Summary

A string of characters.

- `"..."`
- `"single line string"`

```
"multi
line
string"
```

## Details

ClojureScript strings compile to [JavaScript strings].

[JavaScript strings]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String

Standard escape characters such as `\"` are supported, as well as unicode
escape characters:

| unicode characters  | constraints                                   |
|---------------------|-----------------------------------------------|
| `\uXXXX`            | XXXX must have 4 digits outside 0xD7FF-0xE000 |
| `\oXXX`             | XXX is octal between 0 and 0377               |

## Examples

```clj
"foo"
;;=> "foo"

"hello
     world"
;;=> "hello\n     world"
```

Characters can be escaped:

```clj
(println "foo\nbar")
;; prints:
;;   foo
;;   bar
```
