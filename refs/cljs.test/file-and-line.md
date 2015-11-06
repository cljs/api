## cljs.test/file-and-line



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__file-and-line__ exception depth)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/test.cljs#L374-L386):

```clj
(defn file-and-line [exception depth]
  ;; TODO: flesh out
  (if-let [stack-element (and (string? (.-stack exception))
                              (some-> (.-stack exception)
                                      string/split-lines
                                      (get depth)
                                      string/trim))]
    (let [fname (js-filename stack-element)
          [line column] (js-line-and-column stack-element)
          [fname line column] (mapped-line-and-column fname line column)]
      {:file fname :line line :column column})
    {:file (.-fileName exception)
     :line (.-lineNumber exception)}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3148
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:374-386](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/test.cljs#L374-L386)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/file-and-line` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/file-and-line.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/file-and-line.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "file-and-line",
 :type "function",
 :signature ["[exception depth]"],
 :source {:code "(defn file-and-line [exception depth]\n  ;; TODO: flesh out\n  (if-let [stack-element (and (string? (.-stack exception))\n                              (some-> (.-stack exception)\n                                      string/split-lines\n                                      (get depth)\n                                      string/trim))]\n    (let [fname (js-filename stack-element)\n          [line column] (js-line-and-column stack-element)\n          [fname line column] (mapped-line-and-column fname line column)]\n      {:file fname :line line :column column})\n    {:file (.-fileName exception)\n     :line (.-lineNumber exception)}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/cljs/cljs/test.cljs",
          :lines [374 386]},
 :full-name "cljs.test/file-and-line",
 :full-name-encode "cljs.test/file-and-line",
 :history [["+" "0.0-2496"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/file-and-line"]))
```

-->
