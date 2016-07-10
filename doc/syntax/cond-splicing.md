---
name: syntax/cond-splicing
display: "#?@ reader conditional splicing"
related:
  - syntax/cond
---

## Usage
#?@(...)


## Description

(Only allowed in `.cljc` files or the REPL)

Like [doc:syntax/cond], except:

- each conditional value must be a sequence,
- the selected sequence is spliced into the parent form,
- and it must have a parent form to be spliced into (not top level).

`(def #?@(:cljs [foo 1])` is read as `(def foo 1)`.


## Examples

```clj
'(def #?@(:cljs [a 1]
          :clj  [b 2]))
;;=> (def a 1)
```