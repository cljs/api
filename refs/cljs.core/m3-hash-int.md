## cljs.core/m3-hash-int



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" title="Added in 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__m3-hash-int__ in)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/core.cljs#L456-L461):

```clj
(defn ^number m3-hash-int [in]
  (if (zero? in)
    in
    (let [k1 (m3-mix-K1 in)
          h1 (m3-mix-H1 m3-seed k1)]
      (m3-fmix h1 4))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2371
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:456-461](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/core.cljs#L456-L461)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/m3-hash-int` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/m3-hash-int.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/m3-hash-int.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type number,
 :ns "cljs.core",
 :name "m3-hash-int",
 :signature ["[in]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core/m3-hash-int",
 :source {:code "(defn ^number m3-hash-int [in]\n  (if (zero? in)\n    in\n    (let [k1 (m3-mix-K1 in)\n          h1 (m3-mix-H1 m3-seed k1)]\n      (m3-fmix h1 4))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2371",
          :filename "src/cljs/cljs/core.cljs",
          :lines [456 461]},
 :full-name "cljs.core/m3-hash-int"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/m3-hash-int"]))
```

-->
