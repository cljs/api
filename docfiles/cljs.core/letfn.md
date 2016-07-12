---
name: cljs.core/letfn
see also:
  - cljs.core/let
---

## Summary

## Details

Takes a vector of function definitions `fnspecs` and binds the functions to
their names. All of the names are available in all of the definitions of the
functions as well as `body`.

`fnspecs` must be a vector with an even number of forms. See `let`.

`letfn` is a wrapper over one of ClojureScript's [special forms].

[special forms]:http://clojure.org/special_forms

## Examples
