## cljs.core/print-map



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2120"><img valign="middle" alt="[+] 0.0-2120" title="Added in 0.0-2120" src="https://img.shields.io/badge/+-0.0--2120-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__print-map__ m print-one writer opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/core.cljs#L8203-L8211):

```clj
(defn print-map [m print-one writer opts]
  (pr-sequential-writer
    writer
    (fn [e w opts]
      (do (print-one (key e) w opts)
          (-write w \space)
          (print-one (val e) w opts)))
    "{" ", " "}"
    opts (seq m)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8203-8211](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/core.cljs#L8203-L8211)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/print-map` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/print-map.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/print-map.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "print-map",
 :type "function",
 :signature ["[m print-one writer opts]"],
 :source {:code "(defn print-map [m print-one writer opts]\n  (pr-sequential-writer\n    writer\n    (fn [e w opts]\n      (do (print-one (key e) w opts)\n          (-write w \\space)\n          (print-one (val e) w opts)))\n    \"{\" \", \" \"}\"\n    opts (seq m)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8203 8211]},
 :full-name "cljs.core/print-map",
 :full-name-encode "cljs.core/print-map",
 :history [["+" "0.0-2120"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/print-map"]))
```

-->
