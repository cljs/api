---
name: cljs.repl/dir
related:
  - cljs.repl/find-doc
  - cljs.repl/apropos
---

## Signature
[ns]


## Description

Prints a sorted directory of public vars in a namespace `ns`.


## Examples

```clj
(require 'clojure.set)

(dir clojure.set)
;; Prints:
;;  difference
;;  index
;;  intersection
;;  join
;;  map-invert
;;  project
;;  rename
;;  rename-keys
;;  select
;;  subset?
;;  superset?
;;  union
;;
;;=> nil
```