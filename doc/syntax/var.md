---
name: syntax/var
display: "#' var"
see also:
  - special/var
---

## Usage
#'foo
#'foo/bar


## Details

`#'foo` is sugar for [`(var foo)`][doc:special/var].

Accesses the var attached to the given symbol.


## Examples

Access the metadata of a var:

```clj
(def x 123)
(meta #'x)
;;=> {:arglists (), :test nil, :name x, :column 1, :line 1, :file "<cljs repl>", :doc nil, :ns cljs.user}
```