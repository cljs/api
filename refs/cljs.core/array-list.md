## cljs.core/array-list



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__array-list__)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L8036-L8037):

```clj
(defn array-list []
  (ArrayList. (array)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:8036-8037](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L8036-L8037)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/array-list` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/array-list.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/array-list.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "array-list",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn array-list []\n  (ArrayList. (array)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8036 8037]},
 :full-name "cljs.core/array-list",
 :full-name-encode "cljs.core/array-list",
 :history [["+" "0.0-2301"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array-list"]))
```

-->
