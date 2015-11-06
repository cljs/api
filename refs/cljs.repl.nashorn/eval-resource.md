## cljs.repl.nashorn/eval-resource



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__eval-resource__ engine path debug)<br>
</samp>

---





Source docstring:

```
Evaluate a file on the classpath in the engine.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/repl/nashorn.clj#L47-L52):

```clj
(defn eval-resource
      [engine path debug]
      (let [r (io/resource path)]
        (eval-str engine (slurp r))
        (when debug (println "loaded: " path))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[nashorn.clj:47-52](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/repl/nashorn.clj#L47-L52)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.nashorn/eval-resource` @ crossclj](http://crossclj.info/fun/cljs.repl.nashorn/eval-resource.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn/eval-resource.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.nashorn",
 :name "eval-resource",
 :signature ["[engine path debug]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl.nashorn/eval-resource",
 :source {:code "(defn eval-resource\n      [engine path debug]\n      (let [r (io/resource path)]\n        (eval-str engine (slurp r))\n        (when debug (println \"loaded: \" path))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/clojure/cljs/repl/nashorn.clj",
          :lines [47 52]},
 :full-name "cljs.repl.nashorn/eval-resource",
 :docstring "Evaluate a file on the classpath in the engine."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/eval-resource"]))
```

-->
