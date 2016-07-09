## Name
syntax/earmuffs

## Display
*earmuffs*

## Usage
*foo*

## Description

A naming convention for dynamic vars (unenforced).

`(def ^:dynamic *foo* 1)`

Dynamic vars are global vars that you intend to temporarily rebind with
[doc:cljs.core/binding].

NOTE: Sometimes, the core library uses the earmuffs convention for non-dynamic
special global vars (e.g. [doc:cljs.core/*clojurescript-version*],
[doc:cljs.core/*main-cli-fn*]).

## Related
cljs.core/binding

## TODO
The following emits a warning in Clojure.  We should provide the same in ClojureScript:

```clj
(def *foo* 1)
;; Warning: *foo* not declared dynamic and thus is not dynamically rebindable,
;;     but its name suggests otherwise. Please either indicate ^:dynamic *foo* or
;;     change the name.
```

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

