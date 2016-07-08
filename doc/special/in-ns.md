## Name
special/in-ns

## Type
special form (repl)

## Signature
[name]

## Description

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

## Example#e81eb3

```clj
(in-ns 'foo.core)
```
