## clojure.set/select



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/select</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/select)
</td>
</tr>
</table>


 <samp>
(__select__ pred xset)<br>
</samp>

---

Returns a set of the elements for which `pred` is true.



---


###### See Also:

[`cljs.core/filter`](../cljs.core/filter.md)<br>

---


Source docstring:

```
Returns a set of the elements for which pred is true
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/clojure/set.cljs#L61-L65):

```clj
(defn select
  [pred xset]
    (reduce (fn [s k] (if (pred k) s (disj s k)))
            xset xset))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1933
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:61-65](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/clojure/set.cljs#L61-L65)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.set/select` @ clojuredocs](http://clojuredocs.org/clojure.set/select)<br>
[`clojure.set/select` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.set/select/)<br>
[`clojure.set/select` @ crossclj](http://crossclj.info/fun/clojure.set/select.html)<br>
[`clojure.set/select` @ crossclj](http://crossclj.info/fun/clojure.set.cljs/select.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set/select.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a set of the elements for which `pred` is true.",
 :ns "clojure.set",
 :name "select",
 :signature ["[pred xset]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/filter"],
 :full-name-encode "clojure.set/select",
 :source {:code "(defn select\n  [pred xset]\n    (reduce (fn [s k] (if (pred k) s (disj s k)))\n            xset xset))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1933",
          :filename "src/cljs/clojure/set.cljs",
          :lines [61 65]},
 :full-name "clojure.set/select",
 :clj-symbol "clojure.set/select",
 :docstring "Returns a set of the elements for which pred is true"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/select"]))
```

-->
