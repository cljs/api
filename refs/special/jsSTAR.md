## js\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/clojure/cljs/analyzer.cljc#L2196-L2213):

```clj
(defmethod parse 'js*
  [op env [_ jsform & args :as form] _ _]
  (when-not (string? jsform)
    (throw (error env "Invalid js* form")))
  (if-not (nil? args)
    (analyze-js-star env jsform args form)
    (let [code      (apply str (js-star-interp env jsform))
          tag       (get-js-tag form)
          form-meta (meta form)
          js-op     (:js-op form-meta)
          numeric   (:numeric form-meta)]
      {:op :js
       :env env
       :form form
       :code code
       :tag tag
       :js-op js-op
       :numeric numeric})))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.228
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[analyzer.cljc:2196-2213](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/clojure/cljs/analyzer.cljc#L2196-L2213)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/jsSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "js*",
 :type "special form",
 :source {:code "(defmethod parse 'js*\n  [op env [_ jsform & args :as form] _ _]\n  (when-not (string? jsform)\n    (throw (error env \"Invalid js* form\")))\n  (if-not (nil? args)\n    (analyze-js-star env jsform args form)\n    (let [code      (apply str (js-star-interp env jsform))\n          tag       (get-js-tag form)\n          form-meta (meta form)\n          js-op     (:js-op form-meta)\n          numeric   (:numeric form-meta)]\n      {:op :js\n       :env env\n       :form form\n       :code code\n       :tag tag\n       :js-op js-op\n       :numeric numeric})))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1.7.228",
          :filename "src/main/clojure/cljs/analyzer.cljc",
          :lines [2196 2213]},
 :full-name "special/js*",
 :full-name-encode "special/jsSTAR",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/js*"]))
```

-->
