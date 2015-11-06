## cljs.core/js-keys



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__js-keys__ obj)<br>
</samp>

---

Returns the keys for the JavaScript object `obj`.



---

###### Examples:

```clj
(js-keys #js {:foo 1 :bar 2})
;;=> #js ["foo" "bar"]
```



---

###### See Also:

[`cljs.core/keys`](../cljs.core/keys.md)<br>

---




Source code @ [github](https://github.com/clojure/clojurescript/blob/r2411/src/cljs/cljs/core.cljs#L1479-L1482):

```clj
(defn js-keys [obj]
  (let [keys (array)]
    (goog.object/forEach obj (fn [val key obj] (.push keys key)))
    keys))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2411
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1479-1482](https://github.com/clojure/clojurescript/blob/r2411/src/cljs/cljs/core.cljs#L1479-L1482)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/js-keys` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/js-keys.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/js-keys.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the keys for the JavaScript object `obj`.",
 :ns "cljs.core",
 :name "js-keys",
 :signature ["[obj]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/keys"],
 :full-name-encode "cljs.core/js-keys",
 :source {:code "(defn js-keys [obj]\n  (let [keys (array)]\n    (goog.object/forEach obj (fn [val key obj] (.push keys key)))\n    keys))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2411",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1479 1482]},
 :examples [{:id "5dd933",
             :content "```clj\n(js-keys #js {:foo 1 :bar 2})\n;;=> #js [\"foo\" \"bar\"]\n```"}],
 :full-name "cljs.core/js-keys"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-keys"]))
```

-->
