## cljs.core/type



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-971"><img valign="middle" alt="[+] 0.0-971" title="Added in 0.0-971" src="https://img.shields.io/badge/+-0.0--971-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/type</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/type)
</td>
</tr>
</table>


 <samp>
(__type__ x)<br>
</samp>

---





Source docstring:

```
Return x's constructor.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/core.cljs#L244-L248):

```clj
(defn type
  [x]
  (when-not (nil? x)
    (.-constructor x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.48
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:244-248](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/core.cljs#L244-L248)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/type` @ clojuredocs](http://clojuredocs.org/clojure.core/type)<br>
[`clojure.core/type` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/type/)<br>
[`clojure.core/type` @ crossclj](http://crossclj.info/fun/clojure.core/type.html)<br>
[`cljs.core/type` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/type.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/type.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "type",
 :signature ["[x]"],
 :history [["+" "0.0-971"]],
 :type "function",
 :full-name-encode "cljs.core/type",
 :source {:code "(defn type\n  [x]\n  (when-not (nil? x)\n    (.-constructor x)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.48",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [244 248]},
 :full-name "cljs.core/type",
 :clj-symbol "clojure.core/type",
 :docstring "Return x's constructor."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/type"]))
```

-->
