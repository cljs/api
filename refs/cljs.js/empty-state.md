## cljs.js/empty-state



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__empty-state__)<br>
</samp>
 <samp>
(__empty-state__ init)<br>
</samp>

---





Source docstring:

```
Construct an empty compiler state. Required to invoke analyze, compile,
eval and eval-str.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/js.cljs#L109-L119):

```clj
(defn empty-state
  ([]
   (doto (env/default-compiler-env)
     (swap!
       (fn [state]
         (-> state
           (assoc-in [::ana/namespaces 'cljs.core] (dump-core)))))))
  ([init]
   (doto (empty-state) (swap! init))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.cljs:109-119](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/js.cljs#L109-L119)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/empty-state` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/empty-state.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/empty-state.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "empty-state",
 :signature ["[]" "[init]"],
 :history [["+" "1.7.10"]],
 :type "function",
 :full-name-encode "cljs.js/empty-state",
 :source {:code "(defn empty-state\n  ([]\n   (doto (env/default-compiler-env)\n     (swap!\n       (fn [state]\n         (-> state\n           (assoc-in [::ana/namespaces 'cljs.core] (dump-core)))))))\n  ([init]\n   (doto (empty-state) (swap! init))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [109 119]},
 :full-name "cljs.js/empty-state",
 :docstring "Construct an empty compiler state. Required to invoke analyze, compile,\neval and eval-str."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/empty-state"]))
```

-->
