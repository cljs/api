---
name: syntax/destructure-map
display: "destructure {}"
related:
  - syntax/destructure-vector
---

## Usage
{:keys [] :strs [] :syms [] :or {} :as name}


## Description

A helpful shorthand for binding names to values inside a map.

The destructure map can be a map from a symbol to a lookup value:

```clj
(let [ {a :foo}   ;; <-- destructure map
       {:foo 1} ]
  a)
;;=> 1
```

The destructure map can bind multiple names:

```clj
(let [ {a :foo, b :bar}   ;; <-- destructure map
       {:foo 1, :bar 2} ]
  (println a b))
;; 1 2
```

Use this convenient alternative if names match the keys:

```clj
(let [ {:keys [foo bar]}   ;; <-- destructure map
       {:foo 1, :bar 2} ]
  (println foo bar))
;; 1 2
```

Different key types are supported using `:keys`, `:strs`, or `:syms`, which
map to the manual destructuring forms below:

- `{:keys [foo]}` -> `{foo :foo }`
- `{:strs [foo]}` -> `{foo "foo"}`
- `{:syms [foo]}` -> `{foo 'foo }`

Use `:as foo` to name the original value:

```clj
(let [ {:keys [foo bar] :as whole}
       {:foo 1, :bar 2} ]
  whole)
;;=> {:foo 1, :bar 2}
```

Use `:or {}` to provide default values if missing:

```clj
(let [ {:keys [foo bar] :or {bar 0} }
       {:foo 1} ]
  (println foo bar))
;; 1 0
```

Use the special destructuring map in place of any local name binding in the
following forms:

- `(let [...])`
- `(fn [...])`
- `(loop [...])`

Destructure maps can be nested, even in place of names in [destructure
vectors][doc:syntax/destructure-vector].


## Examples

Use in place of function arguments:

```clj
(defn print-point
  [{:keys [x y z]}]
  (println x y z))

(print-point {:x 1, :y 2, :z 3})
;; 1 2 3
```

A non-vector sequence can be destructured as a map:

```clj
(let [{:keys [a b]} '(:a 1 :b 2)]
  (println a b))
;; 1 2
```