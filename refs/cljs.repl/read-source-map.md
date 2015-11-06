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


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3196/src/clj/cljs/repl.clj#L217-L234):

```clj
(defn read-source-map
  [f]
  (when-let [smf (util/file-or-resource (str f ".map"))]
    (let [ns (if (= f "cljs/core.aot.js")
               'cljs.core
               (:ns (ana/parse-ns (js-src->cljs-src f))))]
      (as-> @env/*compiler* compiler-env
        (let [t (util/last-modified smf)]
          (if (or (and (= ns 'cljs.core)
                       (nil? (get-in compiler-env [::source-maps ns])))
                  (and (not= ns 'cljs.core)
                       (> t (get-in compiler-env [::source-maps ns :last-modified] 0))))
            (swap! env/*compiler* assoc-in [::source-maps ns]
              {:last-modified t
               :source-map (sm/decode (json/read-str (slurp smf) :key-fn keyword))})
            compiler-env))
        (get-in compiler-env [::source-maps ns :source-map])))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3196
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:217-234](https://github.com/clojure/clojurescript/blob/r3196/src/clj/cljs/repl.clj#L217-L234)</ins>
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
 :source {:code "(defn read-source-map\n  [f]\n  (when-let [smf (util/file-or-resource (str f \".map\"))]\n    (let [ns (if (= f \"cljs/core.aot.js\")\n               'cljs.core\n               (:ns (ana/parse-ns (js-src->cljs-src f))))]\n      (as-> @env/*compiler* compiler-env\n        (let [t (util/last-modified smf)]\n          (if (or (and (= ns 'cljs.core)\n                       (nil? (get-in compiler-env [::source-maps ns])))\n                  (and (not= ns 'cljs.core)\n                       (> t (get-in compiler-env [::source-maps ns :last-modified] 0))))\n            (swap! env/*compiler* assoc-in [::source-maps ns]\n              {:last-modified t\n               :source-map (sm/decode (json/read-str (slurp smf) :key-fn keyword))})\n            compiler-env))\n        (get-in compiler-env [::source-maps ns :source-map])))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/clj/cljs/repl.clj",
          :lines [217 234]},
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
