## deftype\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github]():

```clj
(defmethod parse 'deftype*
  [_ env form _ _]
  (parse-type :deftype* env form))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---




 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/deftypeSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "deftype*",
 :name-encode "deftypeSTAR",
 :history [["+" "0.0-927"]],
 :type "special form",
 :full-name-encode "special/deftypeSTAR",
 :source {:code "(defmethod parse 'deftype*\n  [_ env form _ _]\n  (parse-type :deftype* env form))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/clojure/cljs/analyzer.cljc",
          :lines [2019 2021],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/clojure/cljs/analyzer.cljc#L2019-L2021"},
 :full-name "special/deftype*",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/deftypeSTAR.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/deftype*"]))
```

-->
