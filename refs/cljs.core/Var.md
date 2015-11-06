## cljs.core/Var



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Var</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Var.java)
</td>
</tr>
</table>


 <samp>
(__Var.__ val sym _meta)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L624-L628):

```clj
(deftype Var [val sym _meta]
  IDeref
  (-deref [_] val)
  IMeta
  (-meta [_] _meta))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2505
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:624-628](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L624-L628)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Var` @ clojuredocs](http://clojuredocs.org/clojure.lang/Var)<br>
[`clojure.lang/Var` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Var/)<br>
[`clojure.lang/Var` @ crossclj](http://crossclj.info/fun/clojure.lang/Var.html)<br>
[`cljs.core/Var` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Var.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Var.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Var",
 :signature ["[val sym _meta]"],
 :history [["+" "0.0-2496"]],
 :type "type",
 :full-name-encode "cljs.core/Var",
 :source {:code "(deftype Var [val sym _meta]\n  IDeref\n  (-deref [_] val)\n  IMeta\n  (-meta [_] _meta))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2505",
          :filename "src/cljs/cljs/core.cljs",
          :lines [624 628]},
 :full-name "cljs.core/Var",
 :clj-symbol "clojure.lang/Var"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Var"]))
```

-->
