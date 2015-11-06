## clojure.zip/root



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/root</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/root)
</td>
</tr>
</table>


 <samp>
(__root__ loc)<br>
</samp>

---





Source docstring:

```
zips all the way up and returns the root node, reflecting any
changes.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/clojure/zip.cljs#L124-L133):

```clj
(defn root
  [loc]
    (if (= :end (loc 1))
      (node loc)
      (let [p (up loc)]
        (if p
          (recur p)
          (node loc)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2723
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:124-133](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/clojure/zip.cljs#L124-L133)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/root` @ clojuredocs](http://clojuredocs.org/clojure.zip/root)<br>
[`clojure.zip/root` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/root/)<br>
[`clojure.zip/root` @ crossclj](http://crossclj.info/fun/clojure.zip/root.html)<br>
[`clojure.zip/root` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/root.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/root.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "root",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/root",
 :source {:code "(defn root\n  [loc]\n    (if (= :end (loc 1))\n      (node loc)\n      (let [p (up loc)]\n        (if p\n          (recur p)\n          (node loc)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [124 133]},
 :full-name "clojure.zip/root",
 :clj-symbol "clojure.zip/root",
 :docstring "zips all the way up and returns the root node, reflecting any\nchanges."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/root"]))
```

-->
