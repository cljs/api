---
name: cljs.core/assoc-in
see also:
  - cljs.core/assoc
  - cljs.core/update-in
  - cljs.core/get-in
---

## Summary

## Details

Associates a value in a nested associative structure, where `ks` is a sequence
of keys and `v` is the new value. Returns a new nested structure.

If any levels do not exist, hash-maps will be created.

## Examples

```clj
(def users [{:name "James" :age 26}
            {:name "John" :age 43}])
```

Update the age of the second (index 1) user:

```clj
(assoc-in users [1 :age] 44)
;;=> [{:name "James", :age 26}
;;    {:name "John", :age 44}]
```

Insert the password of the second (index 1) user:

```clj
(assoc-in users [1 :password] "nhoJ")
;;=> [{:name "James", :age 26}
;;    {:password "nhoJ", :name "John", :age 43}]
```
