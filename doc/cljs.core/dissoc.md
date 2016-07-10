---
name: cljs.core/dissoc
see also:
  - cljs.core/assoc
  - cljs.core/disj
  - cljs.core/select-keys
---

## Signature
[coll]
[coll k]
[coll k & ks]


## Details

dissoc(iate)

Returns a new map that does not contain a mapping for key(s).

Has no effect on the map type (hashed/sorted).



## Examples

```clj
(dissoc {:key "value" :key2 "value2"} :key)
;;=> {:key2 "value2"}
```
