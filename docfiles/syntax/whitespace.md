---
name: syntax/whitespace
display as: "whitespace"
clojure doc: https://github.com/edn-format/edn#general-considerations
edn doc: https://github.com/edn-format/edn#general-considerations
see also:
  - syntax/comma
---

## Summary

Any number of whitespace characters can be used between forms, but is
optional around delimiters. Commas are considered whitespace.
The following are equivalent:

- `#js [ 1 2 3 ]`
- `#js [1 2 3]`
- `#js [1, 2, 3]`
- `#js[1 2 3]`
- `#js[1,2,3]`

Indentation is two-spaces, not tabs, by convention.

## Details

See indentation conventions [here](https://github.com/bbatsov/clojure-style-guide#source-code-layout--organization).

See [Parinfer] if you want the structure of your code to change based on
indentation.

[Parinfer]:http://shaunlebron.github.io/parinfer

## Examples
