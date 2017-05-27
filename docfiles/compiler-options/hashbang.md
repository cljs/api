---
name: compiler-options/hashbang
see also:
---

## Summary

When using [doc:compiler-options/target] `:nodejs` the compiler will emit a
[shebang] as the first line of the compiled source, making it executable. When
your intention is to build a node.js module, instead of executable, use this
option to remove the shebang.

[shebang]:https://en.wikipedia.org/wiki/Shebang_(Unix)

```clj
:hashbang "/usr/bin/env node" ;; <-- default
:hashbang false               ;; <-- disable
```

## Details

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/target]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/target.md
