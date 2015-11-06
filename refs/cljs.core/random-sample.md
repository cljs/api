## cljs.core/random-sample



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__random-sample__ prob)<br>
</samp>
 <samp>
(__random-sample__ prob coll)<br>
</samp>

---





Source docstring:

```
Returns items from coll with random probability of prob (0.0 -
1.0).  Returns a transducer when no collection is provided.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/core.cljs#L8464-L8470):

```clj
(defn random-sample
  ([prob]
     (filter (fn [_] (< (rand) prob))))
  ([prob coll]
     (filter (fn [_] (< (rand) prob)) coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8464-8470](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/core.cljs#L8464-L8470)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/random-sample` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/random-sample.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/random-sample.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "random-sample",
 :signature ["[prob]" "[prob coll]"],
 :history [["+" "0.0-2301"]],
 :type "function",
 :full-name-encode "cljs.core/random-sample",
 :source {:code "(defn random-sample\n  ([prob]\n     (filter (fn [_] (< (rand) prob))))\n  ([prob coll]\n     (filter (fn [_] (< (rand) prob)) coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8464 8470]},
 :full-name "cljs.core/random-sample",
 :docstring "Returns items from coll with random probability of prob (0.0 -\n1.0).  Returns a transducer when no collection is provided."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/random-sample"]))
```

-->
