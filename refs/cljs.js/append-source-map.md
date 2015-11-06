## cljs.js/append-source-map



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__append-source-map__ state name source sb sm-data {:keys \[output-dir asset-path\], :as opts})<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.cljs#L131-L152):

```clj
(defn append-source-map
  [state name source sb sm-data {:keys [output-dir asset-path] :as opts}]
   (let [t    (.valueOf (js/Date.))
         smn  (if name
                (string/replace (munge (str name)) "." "/")
                (str "cljs-" t))
         ts   (.valueOf (js/Date.))
         out  (or output-dir asset-path)
         src  (cond-> (str smn ".cljs?rel=" ts)
                out (prefix (str out "/")))
         file (cond-> (str smn ".js?rel=" ts)
                out (prefix (str out "/")))
         json (sm/encode {src (:source-map sm-data)}
                {:lines (+ (:gen-line sm-data) 3)
                 :file  file :sources-content [source]})]
     (when (:verbose opts) (debug-prn json))
     (swap! state assoc-in
       [:source-maps name] (sm/invert-reverse-map (:source-map sm-data)))
     (.append sb
       (str "\n//# sourceURL=" file
            "\n//# sourceMappingURL=data:application/json;base64,"
            (base64/encodeString json)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.cljs:131-152](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.cljs#L131-L152)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/append-source-map` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/append-source-map.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/append-source-map.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "append-source-map",
 :type "function",
 :signature ["[state name source sb sm-data {:keys [output-dir asset-path], :as opts}]"],
 :source {:code "(defn append-source-map\n  [state name source sb sm-data {:keys [output-dir asset-path] :as opts}]\n   (let [t    (.valueOf (js/Date.))\n         smn  (if name\n                (string/replace (munge (str name)) \".\" \"/\")\n                (str \"cljs-\" t))\n         ts   (.valueOf (js/Date.))\n         out  (or output-dir asset-path)\n         src  (cond-> (str smn \".cljs?rel=\" ts)\n                out (prefix (str out \"/\")))\n         file (cond-> (str smn \".js?rel=\" ts)\n                out (prefix (str out \"/\")))\n         json (sm/encode {src (:source-map sm-data)}\n                {:lines (+ (:gen-line sm-data) 3)\n                 :file  file :sources-content [source]})]\n     (when (:verbose opts) (debug-prn json))\n     (swap! state assoc-in\n       [:source-maps name] (sm/invert-reverse-map (:source-map sm-data)))\n     (.append sb\n       (str \"\\n//# sourceURL=\" file\n            \"\\n//# sourceMappingURL=data:application/json;base64,\"\n            (base64/encodeString json)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [131 152]},
 :full-name "cljs.js/append-source-map",
 :full-name-encode "cljs.js/append-source-map",
 :history [["+" "1.7.10"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/append-source-map"]))
```

-->
