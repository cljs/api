---
name: syntax/earmuffs
display: "*earmuffs*"
see also:
  - cljs.core/binding
---

## Summary

## Details

A naming convention for dynamic vars (unenforced).

`(def ^:dynamic *foo* 1)`

Dynamic vars are global vars that you intend to temporarily rebind with
[doc:cljs.core/binding].

NOTE: Sometimes, the core library uses the earmuffs convention for non-dynamic
special global vars (e.g. [doc:cljs.core/*clojurescript-version*],
[doc:cljs.core/*main-cli-fn*]).

## Examples

```clj
(def ^:dynamic *foo* 1)

(def print-foo []
  (println *foo*))

(print-foo)
;; 1

(binding [*foo* 2]
  (print-foo))
;; 2

(print-foo)
;; 1
```

## Usage
*foo*
