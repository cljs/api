## cljs.core/hash



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash)
</td>
</tr>
</table>


 <samp>
(__hash__ o)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L508-L526):

```clj
(defn hash [o]
  (cond
    (implements? IHash o)
    (-hash ^not-native o)

    (number? o)
    (js-mod (Math/floor o) 2147483647)

    (true? o) 1

    (false? o) 0

    (string? o)
    (m3-hash-int (hash-string o))

    (nil? o) 0

    :else
    (-hash o)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2307
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:508-526](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L508-L526)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/hash` @ clojuredocs](http://clojuredocs.org/clojure.core/hash)<br>
[`clojure.core/hash` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/hash/)<br>
[`clojure.core/hash` @ crossclj](http://crossclj.info/fun/clojure.core/hash.html)<br>
[`cljs.core/hash` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/hash.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/hash.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "hash",
 :signature ["[o]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/hash",
 :source {:code "(defn hash [o]\n  (cond\n    (implements? IHash o)\n    (-hash ^not-native o)\n\n    (number? o)\n    (js-mod (Math/floor o) 2147483647)\n\n    (true? o) 1\n\n    (false? o) 0\n\n    (string? o)\n    (m3-hash-int (hash-string o))\n\n    (nil? o) 0\n\n    :else\n    (-hash o)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/cljs/cljs/core.cljs",
          :lines [508 526]},
 :full-name "cljs.core/hash",
 :clj-symbol "clojure.core/hash"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash"]))
```

-->
