## cljs.core/ns-name



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns-name</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-name)
</td>
</tr>
</table>


 <samp>
(__ns-name__ ns-obj)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L10446-L10447):

```clj
(defn ns-name [ns-obj]
  (.-name ns-obj))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:10446-10447](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L10446-L10447)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/ns-name` @ clojuredocs](http://clojuredocs.org/clojure.core/ns-name)<br>
[`clojure.core/ns-name` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/ns-name/)<br>
[`clojure.core/ns-name` @ crossclj](http://crossclj.info/fun/clojure.core/ns-name.html)<br>
[`cljs.core/ns-name` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ns-name.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ns-name.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ns-name",
 :signature ["[ns-obj]"],
 :history [["+" "1.7.10"]],
 :type "function",
 :full-name-encode "cljs.core/ns-name",
 :source {:code "(defn ns-name [ns-obj]\n  (.-name ns-obj))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [10446 10447]},
 :full-name "cljs.core/ns-name",
 :clj-symbol "clojure.core/ns-name"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ns-name"]))
```

-->
