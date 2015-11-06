## cljs.test/js-line-and-column



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__js-line-and-column__ stack-element)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/test.cljs#L347-L351):

```clj
(defn js-line-and-column [stack-element]
  (let [parts (.split stack-element ":")
        cnt   (count parts)]
    [(js/parseInt (nth parts (- cnt 2)))
     (js/parseInt (nth parts (dec cnt)))]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:347-351](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/test.cljs#L347-L351)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/js-line-and-column` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/js-line-and-column.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/js-line-and-column.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "js-line-and-column",
 :type "function",
 :signature ["[stack-element]"],
 :source {:code "(defn js-line-and-column [stack-element]\n  (let [parts (.split stack-element \":\")\n        cnt   (count parts)]\n    [(js/parseInt (nth parts (- cnt 2)))\n     (js/parseInt (nth parts (dec cnt)))]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/cljs/test.cljs",
          :lines [347 351]},
 :full-name "cljs.test/js-line-and-column",
 :full-name-encode "cljs.test/js-line-and-column",
 :history [["+" "0.0-2496"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/js-line-and-column"]))
```

-->
