## cljs.core/hash-string



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" title="Added in 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__hash-string__ k)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L534-L541):

```clj
(defn hash-string [k]
  (when (> string-hash-cache-count 255)
    (set! string-hash-cache (js-obj))
    (set! string-hash-cache-count 0))
  (let [h (aget string-hash-cache k)]
    (if (number? h)
      h
      (add-to-string-hash-cache k))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2814
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:534-541](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L534-L541)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/hash-string` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/hash-string.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/hash-string.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "hash-string",
 :type "function",
 :signature ["[k]"],
 :source {:code "(defn hash-string [k]\n  (when (> string-hash-cache-count 255)\n    (set! string-hash-cache (js-obj))\n    (set! string-hash-cache-count 0))\n  (let [h (aget string-hash-cache k)]\n    (if (number? h)\n      h\n      (add-to-string-hash-cache k))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/cljs/cljs/core.cljs",
          :lines [534 541]},
 :full-name "cljs.core/hash-string",
 :full-name-encode "cljs.core/hash-string",
 :history [["+" "0.0-2261"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash-string"]))
```

-->
