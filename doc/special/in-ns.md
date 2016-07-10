---
name: special/in-ns
---

## Signature
[name]


## Details

Only usable from a REPL.

Changes to the namespace `name`, creating it if needed.

Sets `*cljs-ns*` to the namespace `name`.


## TODO

The docstring at `repl-special-doc-map` says I can use `*cljs-ns*` but it
doesn't seem to be working:

```clj
*cljs-ns*
;; WARNING: Use of undeclared Var cljs.user/*cljs-ns* at line 1 <cljs repl>
;; nil
```


## Examples

```clj
(in-ns 'foo.core)
```