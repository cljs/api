## cljs.core/clone



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2134"><img valign="middle" alt="[+] 0.0-2134" title="Added in 0.0-2134" src="https://img.shields.io/badge/+-0.0--2134-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__clone__ value)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L700-L701):

```clj
(defn clone [value]
  (-clone value))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:700-701](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L700-L701)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/clone` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/clone.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/clone.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "clone",
 :type "function",
 :signature ["[value]"],
 :source {:code "(defn clone [value]\n  (-clone value))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/cljs/core.cljs",
          :lines [700 701]},
 :full-name "cljs.core/clone",
 :full-name-encode "cljs.core/clone",
 :history [["+" "0.0-2134"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/clone"]))
```

-->
