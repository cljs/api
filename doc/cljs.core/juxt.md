---
name: cljs.core/juxt
see also:
  - cljs.core/partial
  - cljs.core/comp
---

## Summary

## Details

Takes a set of functions and returns a function that is the juxtaposition of
those functions.

The returned function takes a variable number of arguments, and returns a vector
containing the result of applying each function to the arguments (left-to-
right).

`((juxt a b c) x)` => `[(a x) (b x) (c x)]`

## Examples

## Signature
[f]
[f g]
[f g h]
[f g h & fs]
