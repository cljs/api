---
name: syntax/character
display: "\\ character"
related:
  - syntax/string
  - cljs.core/str
---

## Description

A single character string.  Carried over from Clojure for
compatibility.  They are represented as single character JavaScript strings.

`\c` = `"c"`

| unicode characters  | constraints                                   |
|---------------------|-----------------------------------------------|
| `\uXXXX`            | XXXX must have 4 digits outside 0xD7FF-0xE000 |
| `\oXXX`             | XXX is octal between 0 and 0377               |

| special characters  | result   |
|---------------------|----------|
| `\newline`          | `"\n"`   |
| `\space`            | `" "`    |
| `\tab`              | `"\t"`   |
| `\formfeed`         | `"\f"`   |
| `\backspace`        | `"\b"`   |
| `\return`           | `"\r"`   |


## Examples

```clj
\c
;;=> "c"

\A
;;=> "A"

\newline
;;=> "\n"

\u00a1
;;=> "¡"

\o256
;;=> "®"
```