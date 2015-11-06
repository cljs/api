## cljs.core/drop-last



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/drop-last</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/drop-last)
</td>
</tr>
</table>


 <samp>
(__drop-last__ s)<br>
</samp>
 <samp>
(__drop-last__ n s)<br>
</samp>

---

Return a lazy sequence of all but the last `n` items in `s`.

`n` defaults to 1.



---


###### See Also:

[`cljs.core/drop`](../cljs.core/drop.md)<br>
[`cljs.core/drop-while`](../cljs.core/drop-while.md)<br>

---


Source docstring:

```
Return a lazy sequence of all but the last n (default 1) items in coll
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L3129-L3132):

```clj
(defn drop-last
  ([s] (drop-last 1 s))
  ([n s] (map (fn [x _] x) s (drop n s))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3129-3132](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L3129-L3132)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/drop-last` @ clojuredocs](http://clojuredocs.org/clojure.core/drop-last)<br>
[`clojure.core/drop-last` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/drop-last/)<br>
[`clojure.core/drop-last` @ crossclj](http://crossclj.info/fun/clojure.core/drop-last.html)<br>
[`cljs.core/drop-last` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/drop-last.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/drop-last.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Return a lazy sequence of all but the last `n` items in `s`.\n\n`n` defaults to 1.",
 :ns "cljs.core",
 :name "drop-last",
 :signature ["[s]" "[n s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/drop" "cljs.core/drop-while"],
 :full-name-encode "cljs.core/drop-last",
 :source {:code "(defn drop-last\n  ([s] (drop-last 1 s))\n  ([n s] (map (fn [x _] x) s (drop n s))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3129 3132]},
 :full-name "cljs.core/drop-last",
 :clj-symbol "clojure.core/drop-last",
 :docstring "Return a lazy sequence of all but the last n (default 1) items in coll"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/drop-last"]))
```

-->
