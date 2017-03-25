---
name: compiler-options/optimizations
see also:
---

## Summary

The compiler will produce JS based on the optimization level:

- `:none` - multiple unminified files (fastest for development).
- `:whitespace` - single file w/ comments and whitespace removed
- `:simple` - single file w/ whitespace optimizations + minified local var names
- `:advanced` - single file w/ aggressive renaming, dead code removal, and inlining

```clj
:optimizations :none     ;; <-- recommended for development
:optimizations :advanced ;; <-- recommended for production
:optimizations :simple   ;; <-- recommended for Node
```

## Details

For a detailed explanation of the different optimization modes see
[Closure Compiler Compilation Levels](https://developers.google.com/closure/compiler/docs/compilation_levels)

## Examples
