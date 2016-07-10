---
name: cljs.core/=
related:
  - cljs.core/==
  - cljs.core/not=
  - cljs.core/identical?
---

## Signature
[x]
[x y]
[x y & more]


## Details

Returns true if the value of `x` equals the value of `y`, false otherwise.

`=` is a value comparison, not an identity comparison.

All collections can be tested for value, regardless of "depth".


## Examples

```clj
(= 1)
;;=> true

(= 1 1)
;;=> true

(= 1 2)
;;=> false

(= 1 1 1)
;;=> true

(= 1 1 2)
;;=> false
```

Sequences are considered equal in value if they have the same elements:

```clj
(= '(1 2) [1 2])
;;=> true
```

But you cannot compare JavaScript arrays until you convert them to sequences:

```clj
(def a #js [1 2])
(def b #js [1 2])
(= a b)
;;=> false

(= (seq a) (seq b))
;;=> true
```

It is natural to compare deeply nested collections since value equality checks
are cheap in ClojureScript:

```clj
(def a {:foo {:bar "baz"}})
(def b {:foo {:bar "baz"}})
(= a b)
;;=> true

(= [a b] [a b])
;=> true
```

JavaScript objects cannot be compared in this way until they are converted to
ClojureScript collections:

```clj
(def a #js {:foo #js {:bar "baz"}})
(def b #js {:foo #js {:bar "baz"}})
(= a b)
;;=> false

(= (js->clj a)
   (js->clj b))
;;=> true
```