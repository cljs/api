## cljs.core/IMeta



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IMeta</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IMeta.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/core.cljs#L251-L252):

```clj
(defprotocol IMeta
  (-meta [o]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1847
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:251-252](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/core.cljs#L251-L252)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/IMeta` @ clojuredocs](http://clojuredocs.org/clojure.lang/IMeta)<br>
[`clojure.lang/IMeta` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/IMeta/)<br>
[`clojure.lang/IMeta` @ crossclj](http://crossclj.info/fun/clojure.lang/IMeta.html)<br>
[`cljs.core/IMeta` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IMeta.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IMeta.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IMeta",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/IMeta",
 :source {:code "(defprotocol IMeta\n  (-meta [o]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1847",
          :filename "src/cljs/cljs/core.cljs",
          :lines [251 252]},
 :methods [{:name "-meta", :signature ["[o]"], :docstring nil}],
 :full-name "cljs.core/IMeta",
 :clj-symbol "clojure.lang/IMeta"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IMeta"]))
```

-->
