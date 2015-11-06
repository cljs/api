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
 <samp>
(__create-engine__ {:keys \[code-cache\], :or {code-cache true}})<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl/nashorn.clj#L67-L81):

```clj
(defn create-engine
  ([] (create-engine nil))
  ([{:keys [code-cache] :or {code-cache true}}]
   (let [args (when code-cache ["-pcc"])
         factories (.getEngineFactories (ScriptEngineManager.))
         factory (get (zipmap (map #(.getEngineName %) factories) factories) "Oracle Nashorn")]
     (if-let [engine (if-not (empty? args)
                       (.getScriptEngine ^ScriptEngineFactory factory (into-array args))
                       (.getScriptEngine ^ScriptEngineFactory factory))]
       (let [context (.getContext engine)]
         (.setWriter context *out*)
         (.setErrorWriter context *err*)
         engine)
       (throw (IllegalArgumentException.
                "Cannot find the Nashorn script engine, use a JDK version 8 or higher."))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:67-81](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl/nashorn.clj#L67-L81)</ins>
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
 :signature ["[]" "[{:keys [code-cache], :or {code-cache true}}]"],
 :source {:code "(defn create-engine\n  ([] (create-engine nil))\n  ([{:keys [code-cache] :or {code-cache true}}]\n   (let [args (when code-cache [\"-pcc\"])\n         factories (.getEngineFactories (ScriptEngineManager.))\n         factory (get (zipmap (map #(.getEngineName %) factories) factories) \"Oracle Nashorn\")]\n     (if-let [engine (if-not (empty? args)\n                       (.getScriptEngine ^ScriptEngineFactory factory (into-array args))\n                       (.getScriptEngine ^ScriptEngineFactory factory))]\n       (let [context (.getContext engine)]\n         (.setWriter context *out*)\n         (.setErrorWriter context *err*)\n         engine)\n       (throw (IllegalArgumentException.\n                \"Cannot find the Nashorn script engine, use a JDK version 8 or higher.\"))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [67 81]},
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
