## cljs.core/find-macros-ns



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__find-macros-ns__ ns)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L10171-L10185):

```clj
(defn find-macros-ns [ns]
  (when (nil? NS_CACHE)
    (set! NS_CACHE (atom {})))
  (let [the-ns (get @NS_CACHE ns)]
    (if-not (nil? the-ns)
      the-ns
      (let [ns-str (str ns)
           ns (if (not ^boolean (gstring/contains ns-str "$macros"))
                (symbol (str ns-str "$macros"))
                ns)
           ns-obj (find-ns-obj ns)]
       (when-not (nil? ns-obj)
         (let [new-ns (create-ns ns ns-obj)]
           (swap! NS_CACHE assoc ns new-ns)
           new-ns))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:10171-10185](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L10171-L10185)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/find-macros-ns` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/find-macros-ns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/find-macros-ns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "find-macros-ns",
 :type "function",
 :signature ["[ns]"],
 :source {:code "(defn find-macros-ns [ns]\n  (when (nil? NS_CACHE)\n    (set! NS_CACHE (atom {})))\n  (let [the-ns (get @NS_CACHE ns)]\n    (if-not (nil? the-ns)\n      the-ns\n      (let [ns-str (str ns)\n           ns (if (not ^boolean (gstring/contains ns-str \"$macros\"))\n                (symbol (str ns-str \"$macros\"))\n                ns)\n           ns-obj (find-ns-obj ns)]\n       (when-not (nil? ns-obj)\n         (let [new-ns (create-ns ns ns-obj)]\n           (swap! NS_CACHE assoc ns new-ns)\n           new-ns))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [10171 10185]},
 :full-name "cljs.core/find-macros-ns",
 :full-name-encode "cljs.core/find-macros-ns",
 :history [["+" "1.7.10"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/find-macros-ns"]))
```

-->
