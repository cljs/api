---
name: compiler-options/preloads
see also:
---

## Summary

A list of namespaces to load before [doc:compiler-options/main],
allowing you to preload extra code for specific builds.  For example, a
development build can use it to setup logging or connecting REPLs.
Only applies when [doc:compiler-options/optimizations] is `:none`.

```clj
:preloads '[foo.dev]
```

## Details

## Examples

If you have the following namespace:

```clj
(ns foo.dev)

(enable-console-print!)
```

You can configure your development build to load this side effect prior to your
main namespace with `:preloads '[foo.dev]`.

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/optimizations]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/optimizations.md
[doc:compiler-options/main]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/main.md
