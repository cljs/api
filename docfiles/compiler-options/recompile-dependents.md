---
name: compiler-options/recompile-dependents
see also:
---

## Summary

For correctness, this defaults to `true` in order to recompile dependent
namespaces when a parent namespace changes. This prevents corrupted builds and
swallowed warnings. However, this can impact compile times depending on the
structure of the application.

```clj
:recompile-dependents false
```

## Details

## Examples
