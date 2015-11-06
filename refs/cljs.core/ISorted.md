## cljs.core/ISorted



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Sorted</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Sorted.java)
</td>
</tr>
</table>







Source docstring:

```
Protocol for a collection which can represent their items
  in a sorted manner. 
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L501-L516):

```clj
(defprotocol ISorted
  "Protocol for a collection which can represent their items
  in a sorted manner. "
  (^clj -sorted-seq [coll ascending?]
    "Returns a sorted seq from coll in either ascending or descending order.")
  (^clj -sorted-seq-from [coll k ascending?]
    "Returns a sorted seq from coll in either ascending or descending order.
     If ascending is true, the result should contain all items which are > or >=
     than k. If ascending is false, the result should contain all items which
     are < or <= than k, e.g.
     (-sorted-seq-from (sorted-set 1 2 3 4 5) 3 true) => (3 4 5)
     (-sorted-seq-from (sorted-set 1 2 3 4 5) 3 false) => (3 2 1)")
  (-entry-key [coll entry]
    "Returns the key for entry.")
  (-comparator [coll]
    "Returns the comparator for coll."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:501-516](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L501-L516)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Sorted` @ clojuredocs](http://clojuredocs.org/clojure.lang/Sorted)<br>
[`clojure.lang/Sorted` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Sorted/)<br>
[`clojure.lang/Sorted` @ crossclj](http://crossclj.info/fun/clojure.lang/Sorted.html)<br>
[`cljs.core/ISorted` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ISorted.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ISorted.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ISorted",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core/ISorted",
 :source {:code "(defprotocol ISorted\n  \"Protocol for a collection which can represent their items\n  in a sorted manner. \"\n  (^clj -sorted-seq [coll ascending?]\n    \"Returns a sorted seq from coll in either ascending or descending order.\")\n  (^clj -sorted-seq-from [coll k ascending?]\n    \"Returns a sorted seq from coll in either ascending or descending order.\n     If ascending is true, the result should contain all items which are > or >=\n     than k. If ascending is false, the result should contain all items which\n     are < or <= than k, e.g.\n     (-sorted-seq-from (sorted-set 1 2 3 4 5) 3 true) => (3 4 5)\n     (-sorted-seq-from (sorted-set 1 2 3 4 5) 3 false) => (3 2 1)\")\n  (-entry-key [coll entry]\n    \"Returns the key for entry.\")\n  (-comparator [coll]\n    \"Returns the comparator for coll.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [501 516]},
 :methods [{:name "-sorted-seq",
            :signature ["[coll ascending?]"],
            :docstring "Returns a sorted seq from coll in either ascending or descending order."}
           {:name "-sorted-seq-from",
            :signature ["[coll k ascending?]"],
            :docstring "Returns a sorted seq from coll in either ascending or descending order.\n     If ascending is true, the result should contain all items which are > or >=\n     than k. If ascending is false, the result should contain all items which\n     are < or <= than k, e.g.\n     (-sorted-seq-from (sorted-set 1 2 3 4 5) 3 true) => (3 4 5)\n     (-sorted-seq-from (sorted-set 1 2 3 4 5) 3 false) => (3 2 1)"}
           {:name "-entry-key",
            :signature ["[coll entry]"],
            :docstring "Returns the key for entry."}
           {:name "-comparator",
            :signature ["[coll]"],
            :docstring "Returns the comparator for coll."}],
 :full-name "cljs.core/ISorted",
 :clj-symbol "clojure.lang/Sorted",
 :docstring "Protocol for a collection which can represent their items\n  in a sorted manner. "}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISorted"]))
```

-->
