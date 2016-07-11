---
name: cljs.core/contains?
see also:
  - cljs.core/some
  - cljs.core/get
---

## Summary

## Details

Returns true if the `coll` contains the lookup key `k`, otherwise returns false.

Note that for numerically indexed collections like vectors and arrays, this
tests if the numeric key is within the range of indexes.

`contains?` operates in constant or logarithmic time, using `get` to perform
the lookup. It will not perform a linear search for a value.  `some` is
used for this purpose:

```clj
(some #{value} coll)
```

## Examples

Sets and Maps provide key lookups, so `contains?` works as expected:

```clj
(contains? #{:a :b} :a)
;;=> true

(contains? {:a 1, :b 2} :a)
;;=> true

(contains? {:a 1, :b 2} 1)
;;=> false
```

Vectors provide integer index lookups, so `contains?` works appropriately:

```clj
(contains? [:a :b] :b)
;;=> false

(contains? [:a :b] 1)
;;=> true
```

Lists and Sequences do not provide lookups, so `contains?` will not work:

```clj
(contains? '(:a :b) :a)
;;=> false

(contains? '(:a :b) 1)
;;=> false

(contains? (range 3) 1)
;;=> false
```

## Signature
[coll k]
