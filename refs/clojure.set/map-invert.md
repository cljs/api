## clojure.set/map-invert



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/map-invert</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/map-invert)
</td>
</tr>
</table>


 <samp>
(__map-invert__ m)<br>
</samp>

---





Source docstring:

```
Returns the map with the vals mapped to the keys.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/clojure/set.cljs#L97-L99):

```clj
(defn map-invert
  [m] (reduce (fn [m [k v]] (assoc m v k)) {} m))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:97-99](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/clojure/set.cljs#L97-L99)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.set/map-invert` @ clojuredocs](http://clojuredocs.org/clojure.set/map-invert)<br>
[`clojure.set/map-invert` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.set/map-invert/)<br>
[`clojure.set/map-invert` @ crossclj](http://crossclj.info/fun/clojure.set/map-invert.html)<br>
[`clojure.set/map-invert` @ crossclj](http://crossclj.info/fun/clojure.set.cljs/map-invert.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set/map-invert.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.set",
 :name "map-invert",
 :signature ["[m]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set/map-invert",
 :source {:code "(defn map-invert\n  [m] (reduce (fn [m [k v]] (assoc m v k)) {} m))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/clojure/set.cljs",
          :lines [97 99]},
 :full-name "clojure.set/map-invert",
 :clj-symbol "clojure.set/map-invert",
 :docstring "Returns the map with the vals mapped to the keys."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/map-invert"]))
```

-->
