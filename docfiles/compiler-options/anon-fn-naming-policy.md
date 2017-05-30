---
name: compiler-options/anon-fn-naming-policy
see also:
---

## Summary

Determines how Closure Compiler assigns names to anonymous functions in
assignments and declarations.  Defaults to `:off`.

- `:off` - unnamed
- `:unmapped` - named based on left-hand of assignment (after possible renaming)
- `:mapped` - short unique name generated and mapped to left-hand of assignment

```clj
:anon-fn-naming-policy :unmapped ;; <-- use to assign names to anon functions
```

## Details

(It is unclear how short names from `:mapped` are mapped back to their original
names during debugging)

## Examples

```clj
(ns foo.core)
(def x (fn [] ...))
```

Compiles to the following when `:off`:

```js
foo.core.x = (function (){ ... });
```

Compiles to the following when `:unmapped`:

```js
foo.core.x = (function foo$core$x(){ ... });
```

`:mapped` seems to compile to the same as the above.
