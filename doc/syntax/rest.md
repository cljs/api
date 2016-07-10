---
name: syntax/rest
display: "& rest"
---

## Usage
[... & foo]


## Details

A concept for binding the rest of the values of some sequence to a name.  See
[doc:syntax/destructure-vector] or [doc:cljs.core/fn] for exact usage details in their
respective contexts.


## Examples

Binding `c` to the rest of the function arguments:

```clj
(defn foo
  [a b & c]
  c)
(foo 1 2 3 4)
;;=> (3 4)
```

Binding `c` to the rest of the destructured values:

```clj
(let [[a b & c]
      [1 2 3 4]]
  c)
;;=> (3 4)
```