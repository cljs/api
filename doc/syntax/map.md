---
name: syntax/map
display: "{} map"
related:
  - cljs.core/hash-map
  - cljs.core/array-map
  - cljs.core/sorted-map
  - cljs.core/sorted-map-by
---

## Usage
{...}


## Details

Creates a map.  Must contain pairs of key-values.  Keys and values can be any type.


## Examples

```clj
{:foo 1 :bar 2}
;;=> {:foo 1, :bar 2}
```

Use any value as a key:

```clj
(def m {[1 2] 3})
(get m [1 2])
;;=> 3
```