## clojure.zip/rights



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/rights</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/rights)
</td>
</tr>
</table>


 <samp>
(__rights__ loc)<br>
</samp>

---





Source docstring:

```
Returns a seq of the right siblings of this loc
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/clojure/zip.cljs#L92-L95):

```clj
(defn rights
  [loc]
    (:r (loc 1)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1847
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:92-95](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/clojure/zip.cljs#L92-L95)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/rights` @ clojuredocs](http://clojuredocs.org/clojure.zip/rights)<br>
[`clojure.zip/rights` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/rights/)<br>
[`clojure.zip/rights` @ crossclj](http://crossclj.info/fun/clojure.zip/rights.html)<br>
[`clojure.zip/rights` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/rights.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/rights.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "rights",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/rights",
 :source {:code "(defn rights\n  [loc]\n    (:r (loc 1)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1847",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [92 95]},
 :full-name "clojure.zip/rights",
 :clj-symbol "clojure.zip/rights",
 :docstring "Returns a seq of the right siblings of this loc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/rights"]))
```

-->
