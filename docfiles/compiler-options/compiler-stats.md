---
name: compiler-options/compiler-stats
see also:
---

## Summary

Report basic timing measurements on compiler activity.  Defaults to false.

```clj
:compiler-stats true
```

## Details

## Examples

```
Compile cljs.core, elapsed time: 1862.865119 msecs
...
Compile foo.core, elapsed time: 14.719621 msecs
Compile sources, elapsed time: 1879.519163 msecs
...
Optimizing with Google Closure Compiler, elapsed time: 5007.791604 msecs
Optimizing 14 sources, elapsed time: 5123.47005 msecs
```
