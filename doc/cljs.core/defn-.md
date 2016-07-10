---
name: cljs.core/defn-
see also:
  - cljs.core/defn
---

## Signature
[name & decls]


## Details

Same as `defn`, but adds `{:private true}` metadata to the definition.

Note: `:private` metadata is not currently enforced by the ClojureScript
compiler.
