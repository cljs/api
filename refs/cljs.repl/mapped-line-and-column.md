## cljs.repl/mapped-line-and-column



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__mapped-line-and-column__ source-map line column)<br>
</samp>

---





Source docstring:

```
Given a cljs.source-map source map data structure map a generated line
and column back to the original line and column.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/repl.clj#L197-L215):

```clj
(defn mapped-line-and-column
  [source-map line column]
  (let [default [line column]]
    ;; source maps are 0 indexed for lines
    (if-let [columns (get source-map (dec line))]
      (vec
        (map inc
          (map
            ;; source maps are 0 indexed for columns
            ;; multiple segments may exist at column
            ;; the last segment seems most accurate
            (last
              (if-let [mapping (get columns (dec column))]
                mapping
                (second (first columns))))
            [:line :col])))
      default)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2913
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:197-215](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/repl.clj#L197-L215)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/mapped-line-and-column` @ crossclj](http://crossclj.info/fun/cljs.repl/mapped-line-and-column.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/mapped-line-and-column.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "mapped-line-and-column",
 :signature ["[source-map line column]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl/mapped-line-and-column",
 :source {:code "(defn mapped-line-and-column\n  [source-map line column]\n  (let [default [line column]]\n    ;; source maps are 0 indexed for lines\n    (if-let [columns (get source-map (dec line))]\n      (vec\n        (map inc\n          (map\n            ;; source maps are 0 indexed for columns\n            ;; multiple segments may exist at column\n            ;; the last segment seems most accurate\n            (last\n              (if-let [mapping (get columns (dec column))]\n                mapping\n                (second (first columns))))\n            [:line :col])))\n      default)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/clj/cljs/repl.clj",
          :lines [197 215]},
 :full-name "cljs.repl/mapped-line-and-column",
 :docstring "Given a cljs.source-map source map data structure map a generated line\nand column back to the original line and column."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/mapped-line-and-column"]))
```

-->
