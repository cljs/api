## cljs.core/butlast



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/butlast</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/butlast)
</td>
</tr>
</table>


 <samp>
(__butlast__ s)<br>
</samp>

---

Returns a sequence of all but the last item in `s`.

`butlast` runs in linear time.



---

###### Examples:

```clj
(butlast [1 2 3])
;;=> (1 2)

(butlast [1 2])
;;=> (1)

(butlast [1])
;;=> nil

(butlast [])
;;=> nil
```



---

###### See Also:

[`cljs.core/first`](../cljs.core/first.md)<br>
[`cljs.core/rest`](../cljs.core/rest.md)<br>
[`cljs.core/last`](../cljs.core/last.md)<br>
[`cljs.core/next`](../cljs.core/next.md)<br>
[`cljs.core/drop-last`](../cljs.core/drop-last.md)<br>
[`cljs.core/take-last`](../cljs.core/take-last.md)<br>

---




Source code @ [github](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/cljs/core.cljs#L7280-L7284):

```clj
(defn butlast [s]
  (loop [ret [] s s]
    (if (next s)
      (recur (conj ret (first s)) (next s))
      (seq ret))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2311
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7280-7284](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/cljs/core.cljs#L7280-L7284)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/butlast` @ clojuredocs](http://clojuredocs.org/clojure.core/butlast)<br>
[`clojure.core/butlast` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/butlast/)<br>
[`clojure.core/butlast` @ crossclj](http://crossclj.info/fun/clojure.core/butlast.html)<br>
[`cljs.core/butlast` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/butlast.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/butlast.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a sequence of all but the last item in `s`.\n\n`butlast` runs in linear time.",
 :ns "cljs.core",
 :name "butlast",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/first"
           "cljs.core/rest"
           "cljs.core/last"
           "cljs.core/next"
           "cljs.core/drop-last"
           "cljs.core/take-last"],
 :full-name-encode "cljs.core/butlast",
 :source {:code "(defn butlast [s]\n  (loop [ret [] s s]\n    (if (next s)\n      (recur (conj ret (first s)) (next s))\n      (seq ret))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2311",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7280 7284]},
 :examples [{:id "7a4676",
             :content "```clj\n(butlast [1 2 3])\n;;=> (1 2)\n\n(butlast [1 2])\n;;=> (1)\n\n(butlast [1])\n;;=> nil\n\n(butlast [])\n;;=> nil\n```"}],
 :full-name "cljs.core/butlast",
 :clj-symbol "clojure.core/butlast"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/butlast"]))
```

-->
