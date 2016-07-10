---
name: cljs.core/compare-and-set!
see also:
  - cljs.core/atom
  - cljs.core/reset!
  - cljs.core/swap!
---

## Signature
[a oldval newval]


## Details

Atomically sets the value of atom `a` to `newval` if and only if the current
value of the atom is identical to `oldval`.

Returns true if set happened, false otherwise.


## Examples

```clj
(def a (atom "abc"))

(compare-and-set! a "abc" "def")
;;=> true

@a
;;=> "def"

(compare-and-set! a "abc" "def")
;;=> false

@a
;;=> "def"
```
