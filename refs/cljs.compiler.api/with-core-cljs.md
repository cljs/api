## cljs.compiler.api/with-core-cljs



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__with-core-cljs__)<br>
</samp>
 <samp>
(__with-core-cljs__ opts)<br>
</samp>
 <samp>
(__with-core-cljs__ opts body)<br>
</samp>

---





Source docstring:

```
Ensure that core.cljs has been loaded.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3291/src/main/clojure/cljs/compiler/api.clj#L29-L33):

```clj
(defn with-core-cljs
  ([] (comp/with-core-cljs nil))
  ([opts] (comp/with-core-cljs opts (fn [])))
  ([opts body] (comp/with-core-cljs opts body)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── clojure
            └── cljs
                └── compiler
                    └── <ins>[api.clj:29-33](https://github.com/clojure/clojurescript/blob/r3291/src/main/clojure/cljs/compiler/api.clj#L29-L33)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.compiler.api/with-core-cljs` @ crossclj](http://crossclj.info/fun/cljs.compiler.api/with-core-cljs.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.compiler.api/with-core-cljs.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.compiler.api",
 :name "with-core-cljs",
 :signature ["[]" "[opts]" "[opts body]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.compiler.api/with-core-cljs",
 :source {:code "(defn with-core-cljs\n  ([] (comp/with-core-cljs nil))\n  ([opts] (comp/with-core-cljs opts (fn [])))\n  ([opts body] (comp/with-core-cljs opts body)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/clojure/cljs/compiler/api.clj",
          :lines [29 33]},
 :full-name "cljs.compiler.api/with-core-cljs",
 :docstring "Ensure that core.cljs has been loaded."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.compiler.api/with-core-cljs"]))
```

-->
