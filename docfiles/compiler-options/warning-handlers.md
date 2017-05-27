---
name: compiler-options/warning-handlers
see also:
  - compiler-options/warnings
---

## Summary

A list of functions that are called when a compiler warning occurs.  Defaults to
a single function which prints to stderr.

```clj
:warning-handlers [...]
```

## Details

A warning handler function receives three args:

- `warning-type` - a keyword id (one of [doc:compiler-options/warnings])
- `env` - compiler environment map
- `extra` - map containing extra data specific to the warning

## Examples

To make warnings fail the build:

```clj
:warning-handlers
[(fn [warning-type env extra]
   (when-let [s (cljs.analyzer/error-message warning-type extra)]
     (binding [*out* *err*]
       (println "WARNING:" (cljs.analyzer/message env s)))
     (System/exit 1)))]
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/warnings]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/warnings.md
