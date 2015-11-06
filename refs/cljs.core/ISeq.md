## cljs.core/ISeq



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ISeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ISeq.java)
</td>
</tr>
</table>







Source docstring:

```
Protocol for collections to provide access to their items as sequences.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.107/src/main/cljs/cljs/core.cljs#L473-L481):

```clj
(defprotocol ISeq
  "Protocol for collections to provide access to their items as sequences."
  (-first [coll]
    "Returns the first item in the collection coll. Used by cljs.core/first.")
  (^clj -rest [coll]
    "Returns a new collection of coll without the first item. It should
     always return a seq, e.g.
     (rest []) => ()
     (rest nil) => ()"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.107
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:473-481](https://github.com/clojure/clojurescript/blob/r1.7.107/src/main/cljs/cljs/core.cljs#L473-L481)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/ISeq` @ clojuredocs](http://clojuredocs.org/clojure.lang/ISeq)<br>
[`clojure.lang/ISeq` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/ISeq/)<br>
[`clojure.lang/ISeq` @ crossclj](http://crossclj.info/fun/clojure.lang/ISeq.html)<br>
[`cljs.core/ISeq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ISeq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ISeq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ISeq",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/ISeq",
 :source {:code "(defprotocol ISeq\n  \"Protocol for collections to provide access to their items as sequences.\"\n  (-first [coll]\n    \"Returns the first item in the collection coll. Used by cljs.core/first.\")\n  (^clj -rest [coll]\n    \"Returns a new collection of coll without the first item. It should\n     always return a seq, e.g.\n     (rest []) => ()\n     (rest nil) => ()\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.107",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [473 481]},
 :methods [{:name "-first",
            :signature ["[coll]"],
            :docstring "Returns the first item in the collection coll. Used by cljs.core/first."}
           {:name "-rest",
            :signature ["[coll]"],
            :docstring "Returns a new collection of coll without the first item. It should\n     always return a seq, e.g.\n     (rest []) => ()\n     (rest nil) => ()"}],
 :full-name "cljs.core/ISeq",
 :clj-symbol "clojure.lang/ISeq",
 :docstring "Protocol for collections to provide access to their items as sequences."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISeq"]))
```

-->
