## cljs.core/keys



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keys</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keys)
</td>
</tr>
</table>


 <samp>
(__keys__ hash-map)<br>
</samp>

---

Returns a sequence of the keys in `hash-map`.



---


###### See Also:

[`cljs.core/vals`](../cljs.core/vals.md)<br>

---


Source docstring:

```
Returns a sequence of the map's keys.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/cljs/core.cljs#L7230-L7234):

```clj
(defn keys
  [hash-map]
  (when-let [mseq (seq hash-map)]
    (KeySeq. mseq nil)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2760
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7230-7234](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/cljs/core.cljs#L7230-L7234)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/keys` @ clojuredocs](http://clojuredocs.org/clojure.core/keys)<br>
[`clojure.core/keys` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/keys/)<br>
[`clojure.core/keys` @ crossclj](http://crossclj.info/fun/clojure.core/keys.html)<br>
[`cljs.core/keys` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/keys.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/keys.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a sequence of the keys in `hash-map`.",
 :ns "cljs.core",
 :name "keys",
 :signature ["[hash-map]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/vals"],
 :full-name-encode "cljs.core/keys",
 :source {:code "(defn keys\n  [hash-map]\n  (when-let [mseq (seq hash-map)]\n    (KeySeq. mseq nil)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7230 7234]},
 :full-name "cljs.core/keys",
 :clj-symbol "clojure.core/keys",
 :docstring "Returns a sequence of the map's keys."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/keys"]))
```

-->
