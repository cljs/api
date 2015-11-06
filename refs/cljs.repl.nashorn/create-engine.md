## cljs.repl.nashorn/create-engine



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__create-engine__)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2911/src/clj/cljs/repl/nashorn.clj#L66-L73):

```clj
(defn create-engine []
  (if-let [engine (.getEngineByName (ScriptEngineManager.) "nashorn")]
    (let [context (.getContext engine)]
      (.setWriter context *out*)
      (.setErrorWriter context *err*)
      engine)
    (throw (IllegalArgumentException.
            "Cannot find the Nashorn script engine, use a JDK version 8 or higher."))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2911
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:66-73](https://github.com/clojure/clojurescript/blob/r2911/src/clj/cljs/repl/nashorn.clj#L66-L73)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.nashorn/create-engine` @ crossclj](http://crossclj.info/fun/cljs.repl.nashorn/create-engine.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn/create-engine.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.nashorn",
 :name "create-engine",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn create-engine []\n  (if-let [engine (.getEngineByName (ScriptEngineManager.) \"nashorn\")]\n    (let [context (.getContext engine)]\n      (.setWriter context *out*)\n      (.setErrorWriter context *err*)\n      engine)\n    (throw (IllegalArgumentException.\n            \"Cannot find the Nashorn script engine, use a JDK version 8 or higher.\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [66 73]},
 :full-name "cljs.repl.nashorn/create-engine",
 :full-name-encode "cljs.repl.nashorn/create-engine",
 :history [["+" "0.0-2814"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/create-engine"]))
```

-->
