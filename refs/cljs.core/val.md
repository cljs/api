## cljs.core/val



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/val</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/val)
</td>
</tr>
</table>


 <samp>
(__val__ map-entry)<br>
</samp>

---

Returns the value in the map entry.



---


###### See Also:

[`cljs.core/vals`](../cljs.core/vals.md)<br>

---


Source docstring:

```
Returns the value in the map entry.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1853/src/cljs/cljs/core.cljs#L5908-L5911):

```clj
(defn val
  [map-entry]
  (-val map-entry))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1853
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5908-5911](https://github.com/clojure/clojurescript/blob/r1853/src/cljs/cljs/core.cljs#L5908-L5911)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/val` @ clojuredocs](http://clojuredocs.org/clojure.core/val)<br>
[`clojure.core/val` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/val/)<br>
[`clojure.core/val` @ crossclj](http://crossclj.info/fun/clojure.core/val.html)<br>
[`cljs.core/val` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/val.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/val.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the value in the map entry.",
 :ns "cljs.core",
 :name "val",
 :signature ["[map-entry]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/vals"],
 :full-name-encode "cljs.core/val",
 :source {:code "(defn val\n  [map-entry]\n  (-val map-entry))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1853",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5908 5911]},
 :full-name "cljs.core/val",
 :clj-symbol "clojure.core/val",
 :docstring "Returns the value in the map entry."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/val"]))
```

-->
