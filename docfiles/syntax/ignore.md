---
name: syntax/ignore
display as: "#_ ignore"
see also:
  - syntax/comment
  - cljs.core/comment
---

## Summary

Ignore the next well-formed expression.

`[1 #_foo 2 3]` => `[1 2 3]`

Also useful for commenting out a multi-line expression:

```
#_(defn foo [a b]
    (+ a b))
```

## Details

Causes the following form to be completely skipped by the reader.  This is a
more complete removal than the `comment` macro which yields nil.

## Examples

```clj
{:foo #_bar 2}
;;=> {:foo 2}
```

To comment out the last line of a function without worrying about commenting out
the trailing parentheses:

```clj
(defn foo []
  (println "hello")
  #_(println "world"))
```

Whitespace is optional:

```clj
[1 2 #_ foo 3]
;;=> [1 2 3]
```
