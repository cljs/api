---
name: compiler-options/spec-skip-macros
see also:
---

## Summary

Skip spec checks against macro forms.  Defaults to false.

```clj
:spec-skip-macros true
```

## Details

See [CLJS-2728](https://dev.clojure.org/jira/browse/CLJS-2728) for additional context.

## Examples

An example using Planck from the issue linked above.

```
$ plk
ClojureScript 0.0.1403598667
cljs.user=> (require 'cljs.core.specs.alpha)
nil
cljs.user=> (let [1 2])
            ^
Call to cljs.core$macros/let did not conform to spec. at line 1
cljs.user=> (require '[cljs.env :as env])
nil
cljs.user=> (do (swap! env/*compiler* update :options assoc :spec-skip-macros true) nil)
nil
cljs.user=> (let [1 2])
            ^
Unsupported binding form: 1 at line 1
```
