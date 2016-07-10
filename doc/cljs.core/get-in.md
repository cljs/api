---
name: cljs.core/get-in
related:
  - cljs.core/assoc-in
  - cljs.core/update-in
  - cljs.core/find
  - cljs.core/get
---

## Signature
[m ks]
[m ks not-found]


## Description

Returns the value in a nested associative structure, where `ks` is a sequence of
keys.

Returns nil if the key is not found, or `not-found` if supplied.
