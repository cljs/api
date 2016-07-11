---
name: syntax/keyword
display as: ": keyword"
see also:
  - syntax/keyword-qualify
  - cljs.core/keyword
  - cljs.core/keyword?
---

## Summary

## Details

A keyword is a string-like datatype that evaluates to itself.  Keywords are often used
as enums or keys for maps.  Keywords should not start with a number.

Keywords can have an optional namespace. For example, `:foo/bar`. This is useful
for functions in a namespace to prevent key collisions on a globally accessible
map.

## Examples

```clj
:foo
;;=> :foo

:a/foo
;;=> :a/foo
```

A keyword is also callable for retrieving values from a map:

```clj
(def m {:foo 1})
(:foo m)
;;=> 1

(def things [{:foo 1 :bar 2}
             {:foo 3 :bar 4}
             {:foo 5 :bar 6}])
(map :foo things)
;;=> (1 3 5)
```

## Usage
:foo
:foo/bar
