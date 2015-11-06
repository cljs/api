## cljs.core/constantly



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/constantly</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/constantly)
</td>
</tr>
</table>


 <samp>
(__constantly__ x)<br>
</samp>

---

Returns a function that takes any number of arguments and always returns `x`.



---

###### Examples:

```clj
(def ten (constantly 10))

(ten "hi")
;;=> 10

(ten 123)
;;=> 10

(ten :whatever)
;;=> 10
```



---

###### See Also:

[`cljs.core/repeatedly`](../cljs.core/repeatedly.md)<br>

---


Source docstring:

```
Returns a function that takes any number of arguments and returns x.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L3283-L3285):

```clj
(defn constantly
  [x] (fn [& args] x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3283-3285](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L3283-L3285)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/constantly` @ clojuredocs](http://clojuredocs.org/clojure.core/constantly)<br>
[`clojure.core/constantly` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/constantly/)<br>
[`clojure.core/constantly` @ crossclj](http://crossclj.info/fun/clojure.core/constantly.html)<br>
[`cljs.core/constantly` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/constantly.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/constantly.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a function that takes any number of arguments and always returns `x`.",
 :ns "cljs.core",
 :name "constantly",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/repeatedly"],
 :full-name-encode "cljs.core/constantly",
 :source {:code "(defn constantly\n  [x] (fn [& args] x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3283 3285]},
 :examples [{:id "9d5c25",
             :content "```clj\n(def ten (constantly 10))\n\n(ten \"hi\")\n;;=> 10\n\n(ten 123)\n;;=> 10\n\n(ten :whatever)\n;;=> 10\n```"}],
 :full-name "cljs.core/constantly",
 :clj-symbol "clojure.core/constantly",
 :docstring "Returns a function that takes any number of arguments and returns x."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/constantly"]))
```

-->
