---
name: syntax/queue-literal
display: "#queue literal"
see also:
  - syntax/list
  - syntax/vector
  - syntax/map
  - syntax/set
---

## Usage
#queue [...]


## Details

Create a persistent queue. The form following `#queue` must be a vector.

Queues are the only core collection type that requires a tagged literal to
create, while the other collections have built-in delimiters `()` `[]` `{}` `#{}`.

See [doc:cljs.core/PersistentQueue] for data structure details.


## Notes

Some pending-related Clojure issues:

[CLJ-976] adds #queue literal to Clojure
[CLJ-1078] adds clojure.core/queue and clojure.core/queue? functions (cljs will add if clojure does)

[CLJ-976]:http://dev.clojure.org/jira/browse/CLJ-976
[CLJ-1078]:http://dev.clojure.org/jira/browse/CLJ-1078


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