---
name: syntax/whitespace
display as: "whitespace"
see also:
  - syntax/comma
---

## Summary

Any number of whitespace characters can be used between forms.
Whitespace is optional around delimiters. Commas are considered whitespace.
The following are equivalent:

`#js [ 1 2 3 ]`
`#js [1 2 3]`
`#js [1, 2, 3]`
`#js[1 2 3]`
`#js[1,2,3]`

Indentation is two-spaces, not tabs, by convention.

## Details

See indentation conventions [here](https://github.com/bbatsov/clojure-style-guide#source-code-layout--organization).

See [Parinfer] if you want the structure of your code to change based on
indentation.

[Parinfer]:http://shaunlebron.github.io/parinfer

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/comma]:https://github.com/cljs/api/blob/master/docfiles/syntax/comma.md
