## cljs.core/HashMap.fromArrays



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__HashMap.fromArrays__ ks vs)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L2404-L2409):

```clj
(set! cljs.core.HashMap/fromArrays (fn [ks vs]
  (let [len (.-length ks)]
    (loop [i 0, out cljs.core.HashMap/EMPTY]
      (if (< i len)
        (recur (inc i) (assoc out (aget ks i) (aget vs i)))
        out)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2404-2409](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L2404-L2409)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/HashMap.fromArrays` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/HashMap.fromArrays.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/HashMapDOTfromArrays.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "HashMap.fromArrays",
 :signature ["[ks vs]"],
 :history [["+" "0.0-927"]],
 :parent-type "HashMap",
 :type "function",
 :full-name-encode "cljs.core/HashMapDOTfromArrays",
 :source {:code "(set! cljs.core.HashMap/fromArrays (fn [ks vs]\n  (let [len (.-length ks)]\n    (loop [i 0, out cljs.core.HashMap/EMPTY]\n      (if (< i len)\n        (recur (inc i) (assoc out (aget ks i) (aget vs i)))\n        out)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r971",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2404 2409]},
 :full-name "cljs.core/HashMap.fromArrays"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/HashMap.fromArrays"]))
```

-->
