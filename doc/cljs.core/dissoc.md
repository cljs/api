## Name
cljs.core/dissoc

## Signature
[coll]
[coll k]
[coll k & ks]

## Description

dissoc(iate)

Returns a new map that does not contain a mapping for key(s).

Has no effect on the map type (hashed/sorted).


## Example#fd6ae9

```clj
(dissoc {:key "value" :key2 "value2"} :key)
;;=> {:key2 "value2"}
```

## Related
cljs.core/assoc
cljs.core/disj
cljs.core/select-keys
