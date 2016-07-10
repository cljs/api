---
name: cljs.core/binding
related:
  - cljs.core/let
---

## Signature
[bindings & body]


## Details

binding => var-symbol init-expr

Creates new bindings for the (already-existing) vars, with the
supplied initial values, executes the exprs in an implicit `do`, then
re-establishes the bindings that existed before.

The new bindings are made in parallel (unlike `let`); all init-exprs are
evaluated before the vars are bound to their new values.


## Examples

```clj
(def ^:dynamic *foo* 1)

(defn do-something []
  (println *foo*))

(binding [*foo* 2]
  (do-something))
;;=> prints 2

*foo*
;;=> 1
```