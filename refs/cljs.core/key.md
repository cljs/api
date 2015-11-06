## cljs.core/key



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/key</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/key)
</td>
</tr>
</table>


 <samp>
(__key__ map-entry)<br>
</samp>

---

Returns the key of the map entry.



---


###### See Also:

[`cljs.core/keys`](../cljs.core/keys.md)<br>

---


Source docstring:

```
Returns the key of the map entry.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2027/src/cljs/cljs/core.cljs#L5888-L5891):

```clj
(defn key
  [map-entry]
  (-key map-entry))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2027
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5888-5891](https://github.com/clojure/clojurescript/blob/r2027/src/cljs/cljs/core.cljs#L5888-L5891)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/key` @ clojuredocs](http://clojuredocs.org/clojure.core/key)<br>
[`clojure.core/key` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/key/)<br>
[`clojure.core/key` @ crossclj](http://crossclj.info/fun/clojure.core/key.html)<br>
[`cljs.core/key` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/key.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/key.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the key of the map entry.",
 :ns "cljs.core",
 :name "key",
 :signature ["[map-entry]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/keys"],
 :full-name-encode "cljs.core/key",
 :source {:code "(defn key\n  [map-entry]\n  (-key map-entry))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2027",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5888 5891]},
 :full-name "cljs.core/key",
 :clj-symbol "clojure.core/key",
 :docstring "Returns the key of the map entry."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/key"]))
```

-->
