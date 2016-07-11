---
name: cljs.core/..
see also:
  - special/.
  - cljs.core/->
  - cljs.core/doto
---

## Summary

## Details

For interop, the `..` macro allows method/property chaining on the given JavaScript object `o`.

It essentially combines the thread-first `->` macro with the `.` operator.

## Examples

```js
// JavaScript
"a b c d".toUpperCase().replace("A", "X")
//=> "X B C D"
```

```clj
;; ClojureScript
(.. "a b c d"
    toUpperCase
    (replace "A" "X"))
;;=> "X B C D"
```

This is expanded to:

```clj
(. (. "a b c d" toUpperCase) (replace "A" "X"))
```


which is equivalent to:

```clj
(.replace (.toUpperCase "a b c d") "A" "X")
;;=> "X B C D"
```

Compare to the equivalent form using the thread-first `->` macro:

```clj
(-> "a b c d"
    .toUpperCase
    (.replace "A" "X"))
;;=> "X B C D"
```

## Signature
[o form]
[o form & more]
