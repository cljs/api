## clojure.walk/keywordize-keys



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/keywordize-keys</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/keywordize-keys)
</td>
</tr>
</table>


 <samp>
(__keywordize-keys__ m)<br>
</samp>

---





Source docstring:

```
Recursively transforms all map keys from strings to keywords.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/clojure/walk.cljs#L64-L70):

```clj
(defn keywordize-keys
  [m]
  (let [f (fn [[k v]] (if (string? k) [(keyword k) v] [k v]))]
    ;; only apply to maps
    (postwalk (fn [x] (if (map? x) (into {} (map f x)) x)) m)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2814
└── src
    └── cljs
        └── clojure
            └── <ins>[walk.cljs:64-70](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/clojure/walk.cljs#L64-L70)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.walk/keywordize-keys` @ clojuredocs](http://clojuredocs.org/clojure.walk/keywordize-keys)<br>
[`clojure.walk/keywordize-keys` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.walk/keywordize-keys/)<br>
[`clojure.walk/keywordize-keys` @ crossclj](http://crossclj.info/fun/clojure.walk/keywordize-keys.html)<br>
[`clojure.walk/keywordize-keys` @ crossclj](http://crossclj.info/fun/clojure.walk.cljs/keywordize-keys.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.walk/keywordize-keys.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.walk",
 :name "keywordize-keys",
 :signature ["[m]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.walk/keywordize-keys",
 :source {:code "(defn keywordize-keys\n  [m]\n  (let [f (fn [[k v]] (if (string? k) [(keyword k) v] [k v]))]\n    ;; only apply to maps\n    (postwalk (fn [x] (if (map? x) (into {} (map f x)) x)) m)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/cljs/clojure/walk.cljs",
          :lines [64 70]},
 :full-name "clojure.walk/keywordize-keys",
 :clj-symbol "clojure.walk/keywordize-keys",
 :docstring "Recursively transforms all map keys from strings to keywords."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.walk/keywordize-keys"]))
```

-->
