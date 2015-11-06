## cljs.core/m3-hash-unencoded-chars



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" title="Added in 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__m3-hash-unencoded-chars__ in)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2816/src/cljs/cljs/core.cljs#L494-L506):

```clj
(defn ^number m3-hash-unencoded-chars [in]
  (let [h1 (loop [i 1 h1 m3-seed]
             (if (< i (alength in))
               (recur (+ i 2)
                 (m3-mix-H1 h1
                   (m3-mix-K1
                     (bit-or (.charCodeAt in (dec i))
                       (bit-shift-left (.charCodeAt in i) 16)))))
               h1))
        h1 (if (== (bit-and (alength in) 1) 1)
             (bit-xor h1 (m3-mix-K1 (.charCodeAt in (dec (alength in)))))
             h1)]
    (m3-fmix h1 (imul 2 (alength in)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2816
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:494-506](https://github.com/clojure/clojurescript/blob/r2816/src/cljs/cljs/core.cljs#L494-L506)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/m3-hash-unencoded-chars` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/m3-hash-unencoded-chars.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/m3-hash-unencoded-chars.cljsdoc
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
 :name "m3-hash-unencoded-chars",
 :signature ["[in]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core/m3-hash-unencoded-chars",
 :source {:code "(defn ^number m3-hash-unencoded-chars [in]\n  (let [h1 (loop [i 1 h1 m3-seed]\n             (if (< i (alength in))\n               (recur (+ i 2)\n                 (m3-mix-H1 h1\n                   (m3-mix-K1\n                     (bit-or (.charCodeAt in (dec i))\n                       (bit-shift-left (.charCodeAt in i) 16)))))\n               h1))\n        h1 (if (== (bit-and (alength in) 1) 1)\n             (bit-xor h1 (m3-mix-K1 (.charCodeAt in (dec (alength in)))))\n             h1)]\n    (m3-fmix h1 (imul 2 (alength in)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2816",
          :filename "src/cljs/cljs/core.cljs",
          :lines [494 506]},
 :full-name "cljs.core/m3-hash-unencoded-chars"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/m3-hash-unencoded-chars"]))
```

-->
