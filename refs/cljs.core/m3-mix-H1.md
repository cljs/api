## cljs.core/m3-mix-H1



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" title="Added in 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__m3-mix-H1__ h1 k1)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/cljs/cljs/core.cljs#L779-L780):

```clj
(defn ^number m3-mix-H1 [h1 k1]
  (int (-> (int h1) (bit-xor (int k1)) (int-rotate-left 13) (imul 5) (+ (int 0xe6546b64)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.28
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:779-780](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/cljs/cljs/core.cljs#L779-L780)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/m3-mix-H1` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/m3-mix-H1.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/m3-mix-H1.cljsdoc
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
 :name "m3-mix-H1",
 :signature ["[h1 k1]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core/m3-mix-H1",
 :source {:code "(defn ^number m3-mix-H1 [h1 k1]\n  (int (-> (int h1) (bit-xor (int k1)) (int-rotate-left 13) (imul 5) (+ (int 0xe6546b64)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.28",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [779 780]},
 :full-name "cljs.core/m3-mix-H1"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/m3-mix-H1"]))
```

-->
