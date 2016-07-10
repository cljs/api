---
name: syntax/destructure-vector
display: "destructure []"
see also:
  - syntax/destructure-map
---

## Usage
[arg1 arg2 & args :as name]


## Details

A helpful shorthand for destructuring a sequence into multiple names.

```clj
(let [ [a b c]   ;; <-- destructure vector
       [1 2 3] ]
  (println a b c))
;; 1 2 3
```

Use `& foo` to name the rest of the items in the sequence:

```clj
(let [ [a b c & d]
       [1 2 3 4 5] ]
  (println a b c d))
;; 1 2 3 (4 5)
```

Use `:as foo` to name the original value:

```clj
(let [ [a b c & d :as whole]
       [1 2 3 4 5] ]
  whole)
;;=> [1 2 3 4 5]
```

Use the special destructure vector in place of any local name binding in the
following forms:

- `(let [...])`
- `(fn [...])`
- `(loop [...])`

Destructure vectors can be nested, even in place of names in [destructure
maps][doc:syntax/destructure-map].


## Examples

Use destructure vectors in function parameters:

```clj
(defn foo [[a b] c]
  (+ a b c))

(foo [1 2] 3)
;;=> 6
```

Destructure vectors can be nested:

```clj
(let [ [[a b] c]
       [[1 2] 3] ]
  (println a b c))
;; 1 2 3
```