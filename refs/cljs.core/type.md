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

<samp>(type x)</samp><br>

---

 <samp>
(__type__ x)<br>
</samp>

---





Source docstring:

```
Return x's constructor.
```


Source code @ [github]():

```clj
(defn type
  [x]
  (when-not (nil? x)
    (.-constructor x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

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
 :name-encode "type",
 :history [["+" "0.0-971"]],
 :type "function",
 :clj-equiv {:full-name "clojure.core/type",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/type"},
 :full-name-encode "cljs.core/type",
 :source {:code "(defn type\n  [x]\n  (when-not (nil? x)\n    (.-constructor x)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [253 257],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/core.cljs#L253-L257"},
 :usage ["(type x)"],
 :full-name "cljs.core/type",
 :docstring "Return x's constructor.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/type.cljsdoc"}

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
