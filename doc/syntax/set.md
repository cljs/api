---
name: syntax/set
display: "#{} set"
related:
  - cljs.core/hash-set
  - cljs.core/sorted-set
  - cljs.core/sorted-set-by
---

## Usage
#{...}


## Details

Create a literal set.  Values must be unique.


## Examples

```clj
#{1 2 3}
;;=> #{1 2 3}
```

Duplicate values will cause an error:

```clj
#{1 1 2 3}
;; Error: Duplicate key: 1
```