---
name: special/load-namespace
see also:
---

## Summary

## Details

Only usable from a REPL.

Load a namespace and all of its dependencies into the evaluation environment.
The environment is responsible for ensuring that each namespace is loaded once
and only once.

## Examples

```clj
(load-namespace 'clojure.set)
```
