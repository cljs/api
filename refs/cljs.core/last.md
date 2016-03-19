## cljs.core/last



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/last</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/last)
</td>
</tr>
</table>


 <samp>
(__last__ coll)<br>
</samp>

---

Returns the last item in `coll` in linear time.

`peek` is much faster than `last` for a vector.



---

###### Examples:

```clj
(last [1 2 3])
;;=> 3

(last [1 2])
;;=> 2

(last [1])
;;=> 1

(last [])
;;=> nil
```



---

###### See Also:

[`cljs.core/first`](../cljs.core/first.md)<br>
[`cljs.core/next`](../cljs.core/next.md)<br>
[`cljs.core/rest`](../cljs.core/rest.md)<br>
[`cljs.core/butlast`](../cljs.core/butlast.md)<br>
[`cljs.core/take-last`](../cljs.core/take-last.md)<br>

---


Source docstring:

```
Return the last item in coll, in linear time
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L1626-L1632):

```clj
(defn last
  [s]
  (let [sn (next s)]
    (if-not (nil? sn)
      (recur sn)
      (first s))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1626-1632](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L1626-L1632)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/last` @ clojuredocs](http://clojuredocs.org/clojure.core/last)<br>
[`clojure.core/last` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/last/)<br>
[`clojure.core/last` @ crossclj](http://crossclj.info/fun/clojure.core/last.html)<br>
[`cljs.core/last` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/last.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/last.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the last item in `coll` in linear time.\n\n`peek` is much faster than `last` for a vector.",
 :ns "cljs.core",
 :name "last",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/first"
           "cljs.core/next"
           "cljs.core/rest"
           "cljs.core/butlast"
           "cljs.core/take-last"],
 :full-name-encode "cljs.core/last",
 :source {:code "(defn last\n  [s]\n  (let [sn (next s)]\n    (if-not (nil? sn)\n      (recur sn)\n      (first s))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1626 1632]},
 :examples [{:id "eb0836",
             :content "```clj\n(last [1 2 3])\n;;=> 3\n\n(last [1 2])\n;;=> 2\n\n(last [1])\n;;=> 1\n\n(last [])\n;;=> nil\n```"}],
 :full-name "cljs.core/last",
 :clj-symbol "clojure.core/last",
 :docstring "Return the last item in coll, in linear time"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/last"]))
```

-->
