## cljs.core/seq-iter



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__seq-iter__ coll)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/cljs/cljs/core.cljs#L3566-L3567):

```clj
(defn seq-iter [coll]
  (SeqIter. INIT coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.189
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3566-3567](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/cljs/cljs/core.cljs#L3566-L3567)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/seq-iter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/seq-iter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/seq-iter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "seq-iter",
 :type "function",
 :signature ["[coll]"],
 :source {:code "(defn seq-iter [coll]\n  (SeqIter. INIT coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.189",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3566 3567]},
 :full-name "cljs.core/seq-iter",
 :full-name-encode "cljs.core/seq-iter",
 :history [["+" "0.0-2301"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/seq-iter"]))
```

-->
