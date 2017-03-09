---
name: cljs.core/*ns*
see also:
---

## Summary

Var bound to a [doc:cljs.core/Namespace] object representing the current namespace.
Only used for bootstrapping.

## Details

Only accessible at runtime from a bootstrapped REPL.  Nil otherwise.

## Examples

Example below in a bootstrapped REPL:

```
(in-ns 'cljs.user)
*ns*
;;=> #object[cljs.core.Namespace]

(str *ns*)
;;=> "cljs.user"
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/Namespace]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/Namespace.md
