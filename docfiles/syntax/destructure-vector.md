---
name: syntax/destructure-vector
display as: "destructure []"
see also:
  - syntax/destructure-map
search terms:
  - ":as"
  - "&"
clojure doc: http://clojure.org/reference/special_forms#_vector_binding_destructuring
---

## Summary

Shorthand for destructuring a sequence into multiple names. Allows you to use a
`[...]` pattern instead of a usual `name` in the following examples:

- `(defn [name])` -> `(defn [[...]])`
- `(let [name a-sequence])` -> `(let [[...] a-sequence])`
- `(for [name a-sequence-of-sequences])` -> `(for [[...] a-sequence-of-sequences])`

Quick pattern reference:

- `[...]` - names are bound by order (e.g. `[a b]`)
- `[... & name]` - name is bound to the rest of the values
- `[:as name]` - name is bound to whole value

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

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/destructure-map]:https://github.com/cljs/api/blob/master/docfiles/syntax/destructure-map.md
