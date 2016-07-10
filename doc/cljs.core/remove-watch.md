---
name: cljs.core/remove-watch
see also:
  - cljs.core/add-watch
---

## Signature
[a key]


## Details

Removes a watch function identified by `key` from atom `a`.  The function must
have originally been set by `add-watch`.


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

(remove-watch a :logger)

(swap! a assoc :foo 3)
;;=> nothing will be printed...
```