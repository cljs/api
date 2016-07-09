## Name
special/load-namespace

## Signature
[name]

## Description

Only usable from a REPL.

Load a namespace and all of its dependencies into the evaluation environment.
The environment is responsible for ensuring that each namespace is loaded once
and only once.

## TODO

This example doesn't work.  Why?

```clj
(load-namespace 'clojure.set)
(clojure.set/intersection #{2 3} #{3 4})
```

## Examples

```clj
(load-namespace 'clojure.set)
```
