## cljs.core/keyword?



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keyword?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keyword?)
</td>
</tr>
</table>


 <samp>
(__keyword?__ x)<br>
</samp>

---







Function code @ [github](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L2340-L2341):

```clj
(defn ^boolean keyword? [x]
  (instance? Keyword x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2307
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2340-2341](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L2340-L2341)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2307/src/clj/cljs/core.clj#L351-L352):

```clj
(defmacro keyword? [x]
  (bool-expr `(instance? Keyword ~x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2307
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:351-352](https://github.com/clojure/clojurescript/blob/r2307/src/clj/cljs/core.clj#L351-L352)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/keyword?` @ clojuredocs](http://clojuredocs.org/clojure.core/keyword_q)<br>
[`clojure.core/keyword?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/keyword%3F/)<br>
[`clojure.core/keyword?` @ crossclj](http://crossclj.info/fun/clojure.core/keyword%3F.html)<br>
[`cljs.core/keyword?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/keyword%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/keywordQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "keyword?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :full-name-encode "cljs.core/keywordQMARK",
 :source {:code "(defn ^boolean keyword? [x]\n  (instance? Keyword x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2340 2341]},
 :extra-sources [{:code "(defmacro keyword? [x]\n  (bool-expr `(instance? Keyword ~x)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2307",
                  :filename "src/clj/cljs/core.clj",
                  :lines [351 352]}],
 :full-name "cljs.core/keyword?",
 :clj-symbol "clojure.core/keyword?"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/keyword?"]))
```

-->
