---
name: compiler-options/closure-generate-exports
see also:
---

## Summary

If you are using a Closure-compatible JS library that uses [`@export`] JSDoc tags,
you will need to enable this option so the appropriate `goog.export()` calls
are generated to allow their usage.

[`@export`]:https://github.com/google/closure-compiler/wiki/Annotating-JavaScript-for-the-Closure-Compiler#export-export-sometype

```clj
:closure-generate-exports true
```

## Details

## Examples
