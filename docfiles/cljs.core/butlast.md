---
name: cljs.core/butlast
see also:
  - cljs.core/first
  - cljs.core/rest
  - cljs.core/last
  - cljs.core/next
  - cljs.core/drop-last
  - cljs.core/take-last
---

## Summary

## Details

Returns a sequence of all but the last item in `s`.

`butlast` runs in linear time.

## Examples

```clj
(butlast [1 2 3])
;;=> (1 2)

(butlast [1 2])
;;=> (1)

(butlast [1])
;;=> nil

(butlast [])
;;=> nil
```
