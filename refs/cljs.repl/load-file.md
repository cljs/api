## cljs.repl/load-file



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__load-file__ repl-env f)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/repl.clj#L102-L107):

```clj
(defn load-file
  [repl-env f]
  (binding [comp/*cljs-ns* 'cljs.user]
    (let [res (if (= \/ (first f)) f (io/resource f))]
      (assert res (str "Can't find " f " in classpath"))
      (load-stream repl-env f res))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:102-107](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/repl.clj#L102-L107)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/load-file` @ crossclj](http://crossclj.info/fun/cljs.repl/load-file.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/load-file.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "load-file",
 :type "function",
 :signature ["[repl-env f]"],
 :source {:code "(defn load-file\n  [repl-env f]\n  (binding [comp/*cljs-ns* 'cljs.user]\n    (let [res (if (= \\/ (first f)) f (io/resource f))]\n      (assert res (str \"Can't find \" f \" in classpath\"))\n      (load-stream repl-env f res))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/clj/cljs/repl.clj",
          :lines [102 107]},
 :full-name "cljs.repl/load-file",
 :full-name-encode "cljs.repl/load-file",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/load-file"]))
```

-->
