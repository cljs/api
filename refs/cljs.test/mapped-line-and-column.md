## cljs.test/mapped-line-and-column



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__mapped-line-and-column__ filename line column)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/test.cljs#L375-L391):

```clj
(defn mapped-line-and-column [filename line column]
  (let [default [filename line column]]
    (if-let [source-map (:source-map (get-current-env))]
      ;; source maps are 0 indexed for lines
      (if-let [columns (get-in source-map [filename (dec line)])]
        (vec
          (map
            ;; source maps are 0 indexed for columns
            ;; multiple segments may exist at column
            ;; just take first
            (first
              (if-let [mapping (get columns (dec column))]
                mapping
                (second (first columns))))
            [:source :line :col]))
        default)
      default)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.58
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:375-391](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/test.cljs#L375-L391)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/mapped-line-and-column` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/mapped-line-and-column.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/mapped-line-and-column.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "mapped-line-and-column",
 :type "function",
 :signature ["[filename line column]"],
 :source {:code "(defn mapped-line-and-column [filename line column]\n  (let [default [filename line column]]\n    (if-let [source-map (:source-map (get-current-env))]\n      ;; source maps are 0 indexed for lines\n      (if-let [columns (get-in source-map [filename (dec line)])]\n        (vec\n          (map\n            ;; source maps are 0 indexed for columns\n            ;; multiple segments may exist at column\n            ;; just take first\n            (first\n              (if-let [mapping (get columns (dec column))]\n                mapping\n                (second (first columns))))\n            [:source :line :col]))\n        default)\n      default)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.58",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [375 391]},
 :full-name "cljs.test/mapped-line-and-column",
 :full-name-encode "cljs.test/mapped-line-and-column",
 :history [["+" "0.0-2496"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/mapped-line-and-column"]))
```

-->
