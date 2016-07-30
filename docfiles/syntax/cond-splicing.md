---
name: syntax/cond-splicing
display as: "#?@ reader conditional splicing"
see also:
  - syntax/cond
---

## Summary

Like [doc:syntax/cond], except the result is spliced (i.e. `[a b]` => `a b`)

- `#?@(:clj [...] :cljs [...])`

## Details

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

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/cond]:https://github.com/cljs/api/blob/master/docfiles/syntax/cond.md
