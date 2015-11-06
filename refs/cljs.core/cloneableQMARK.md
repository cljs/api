## cljs.core/cloneable?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2156"><img valign="middle" alt="[+] 0.0-2156" title="Added in 0.0-2156" src="https://img.shields.io/badge/+-0.0--2156-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__cloneable?__ value)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L602-L603):

```clj
(defn cloneable? [value]
  (satisfies? ICloneable value))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2280
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:602-603](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L602-L603)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/cloneable?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/cloneable%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/cloneableQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "cloneable?",
 :type "function",
 :signature ["[value]"],
 :source {:code "(defn cloneable? [value]\n  (satisfies? ICloneable value))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/cljs/cljs/core.cljs",
          :lines [602 603]},
 :full-name "cljs.core/cloneable?",
 :full-name-encode "cljs.core/cloneableQMARK",
 :history [["+" "0.0-2156"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/cloneable?"]))
```

-->
