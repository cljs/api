## #queue literal



 <table border="1">
<tr>
<td>tagged literal</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>#queue \[...\]</samp><br>

---


Create a persistent queue. The form following `#queue` must be a vector.

Queues are the only core collection type that requires a tagged literal to
create, while the other collections have built-in delimiters `()` `[]` `{}` `#{}`.

See [`PersistentQueue`][doc:cljs.core/PersistentQueue] for data structure details.

[doc:cljs.core/PersistentQueue]:../cljs.core/PersistentQueue.md

---

###### Examples:

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



---

###### See Also:

[`() list`](../syntax/list.md)<br>
[`[] vector`](../syntax/vector.md)<br>
[`{} map`](../syntax/map.md)<br>
[`#{} set`](../syntax/set.md)<br>

---





Reader code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/clojure/cljs/tagged_literals.cljc#L5-L13):

```clj
(defn read-queue
  [form]
  (when-not (vector? form)
    (throw
      #?(:clj  (RuntimeException.
                 "Queue literal expects a vector for its elements.")
         :cljs (js/Error.
                 "Queue literal expects a vector for its elements."))))
  (list 'cljs.core/into 'cljs.core.PersistentQueue.EMPTY form))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[tagged_literals.cljc:5-13](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/clojure/cljs/tagged_literals.cljc#L5-L13)</ins>
</pre>
-->

---
Reader table @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/clojure/cljs/tagged_literals.cljc#L79-L83):

```clj
(def ^:dynamic *cljs-data-readers*
  {'queue read-queue
   'uuid  read-uuid
   'inst  read-inst
   'js    read-js})
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[tagged_literals.cljc:79-83](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/clojure/cljs/tagged_literals.cljc#L79-L83)</ins>
</pre>
-->

---



 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/queue-literal.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Create a persistent queue. The form following `#queue` must be a vector.\n\nQueues are the only core collection type that requires a tagged literal to\ncreate, while the other collections have built-in delimiters `()` `[]` `{}` `#{}`.\n\nSee [doc:cljs.core/PersistentQueue] for data structure details.",
 :ns "syntax",
 :name "queue-literal",
 :history [["+" "0.0-1424"]],
 :type "tagged literal",
 :related ["syntax/list" "syntax/vector" "syntax/map" "syntax/set"],
 :full-name-encode "syntax/queue-literal",
 :extra-sources ({:code "(defn read-queue\n  [form]\n  (when-not (vector? form)\n    (throw\n      #?(:clj  (RuntimeException.\n                 \"Queue literal expects a vector for its elements.\")\n         :cljs (js/Error.\n                 \"Queue literal expects a vector for its elements.\"))))\n  (list 'cljs.core/into 'cljs.core.PersistentQueue.EMPTY form))",
                  :title "Reader code",
                  :repo "clojurescript",
                  :tag "r1.7.145",
                  :filename "src/main/clojure/cljs/tagged_literals.cljc",
                  :lines [5 13]}
                 {:code "(def ^:dynamic *cljs-data-readers*\n  {'queue read-queue\n   'uuid  read-uuid\n   'inst  read-inst\n   'js    read-js})",
                  :title "Reader table",
                  :repo "clojurescript",
                  :tag "r1.7.145",
                  :filename "src/main/clojure/cljs/tagged_literals.cljc",
                  :lines [79 83]}),
 :usage ["#queue [...]"],
 :examples [{:id "f81c50",
             :content "```clj\n#queue []\n;;=> #queue []\n\n#queue [1 2 3]\n;;=> #queue [1 2 3]\n```\n\nSome operations:\n\n```clj\n(def q #queue [1 2 3])\n;;=> #queue [1 2 3]\n\n(conj q 4)\n;;=> #queue [1 2 3 4]\n\n(pop q)\n;;=> #queue [2 3]\n\n(peek q)\n;;=> 1\n```"}],
 :full-name "syntax/queue-literal",
 :display "#queue literal"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/queue-literal"]))
```

-->
