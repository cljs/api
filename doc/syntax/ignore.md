---
name: syntax/ignore
display: "#_ ignore"
see also:
  - syntax/comment
  - cljs.core/comment
---

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