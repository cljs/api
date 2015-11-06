## cljs.repl/read-source-map



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-source-map__ f)<br>
</samp>

---





Source docstring:

```
Return the source map for the JavaScript source file.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/repl.clj#L203-L208):

```clj
(defn read-source-map
  [f]
  (let [smf (io/file (str f ".map"))]
    (when (.exists smf)
      (sm/decode (json/read-str (slurp smf) :key-fn keyword)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3149
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:203-208](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/repl.clj#L203-L208)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/read-source-map` @ crossclj](http://crossclj.info/fun/cljs.repl/read-source-map.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/read-source-map.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "read-source-map",
 :signature ["[f]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl/read-source-map",
 :source {:code "(defn read-source-map\n  [f]\n  (let [smf (io/file (str f \".map\"))]\n    (when (.exists smf)\n      (sm/decode (json/read-str (slurp smf) :key-fn keyword)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/clj/cljs/repl.clj",
          :lines [203 208]},
 :full-name "cljs.repl/read-source-map",
 :docstring "Return the source map for the JavaScript source file."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/read-source-map"]))
```

-->
