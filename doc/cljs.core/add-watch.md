---
name: cljs.core/add-watch
see also:
  - cljs.core/remove-watch
---

## Signature
[a key f]


## Details

Adds a watch function `f` to atom `a` that will execute when the value of `a`
changes.

The watch function takes 4 arguments: a key, the atom, its old state, and its
new state.

`key` should be a keyword and can be used with `remove-watch` to remove the
watch function.


## Examples

```clj
(def a (atom {}))

(add-watch a :logger
  (fn [_key _atom old-state new-state]
    (println "old:" old-state)
    (println "new:" new-state)))

(swap! a assoc :foo "bar")
;;=> will print the following:
;; old: {}
;; new: {:foo "bar"}
```