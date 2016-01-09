## cljs.core/ITransientVector



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ITransientVector</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ITransientVector.java)
</td>
</tr>
</table>







Source docstring:

```
Protocol for adding vector functionality to transient collections.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/cljs/core.cljs#L690-L695):

```clj
(defprotocol ITransientVector
  "Protocol for adding vector functionality to transient collections."
  (^clj -assoc-n! [tcoll n val]
    "Returns tcoll with value val added at position n.")
  (^clj -pop! [tcoll]
    "Returns tcoll with the last item removed from it."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.228
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:690-695](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/cljs/core.cljs#L690-L695)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/ITransientVector` @ clojuredocs](http://clojuredocs.org/clojure.lang/ITransientVector)<br>
[`clojure.lang/ITransientVector` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/ITransientVector/)<br>
[`clojure.lang/ITransientVector` @ crossclj](http://crossclj.info/fun/clojure.lang/ITransientVector.html)<br>
[`cljs.core/ITransientVector` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ITransientVector.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ITransientVector.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ITransientVector",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core/ITransientVector",
 :source {:code "(defprotocol ITransientVector\n  \"Protocol for adding vector functionality to transient collections.\"\n  (^clj -assoc-n! [tcoll n val]\n    \"Returns tcoll with value val added at position n.\")\n  (^clj -pop! [tcoll]\n    \"Returns tcoll with the last item removed from it.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.228",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [690 695]},
 :methods [{:name "-assoc-n!",
            :signature ["[tcoll n val]"],
            :docstring "Returns tcoll with value val added at position n."}
           {:name "-pop!",
            :signature ["[tcoll]"],
            :docstring "Returns tcoll with the last item removed from it."}],
 :full-name "cljs.core/ITransientVector",
 :clj-symbol "clojure.lang/ITransientVector",
 :docstring "Protocol for adding vector functionality to transient collections."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ITransientVector"]))
```

-->
