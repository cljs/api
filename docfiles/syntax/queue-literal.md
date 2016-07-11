---
name: syntax/queue-literal
display: "#queue literal"
see also:
  - syntax/list
  - syntax/vector
  - syntax/map
  - syntax/set
---

## Summary

## Details

Create a persistent queue. The form following `#queue` must be a vector.

Queues are the only core collection type that requires a tagged literal to
create, while the other collections have built-in delimiters `()` `[]` `{}` `#{}`.

See [doc:cljs.core/PersistentQueue] for data structure details.

## Examples

```clj
#queue []
;;=> #queue []

#queue [1 2 3]
;;=> #queue [1 2 3]
```

Some operations:

```clj
(def q #queue [1 2 3])
;;=> #queue [1 2 3]

(conj q 4)
;;=> #queue [1 2 3 4]

(pop q)
;;=> #queue [2 3]

(peek q)
;;=> 1
```

## Usage
#queue [...]

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/PersistentQueue]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/PersistentQueue.md
