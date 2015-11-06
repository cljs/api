## cljs.core/complement



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/complement</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/complement)
</td>
</tr>
</table>


 <samp>
(__complement__ f)<br>
</samp>

---

Takes a function `f` and returns a function that takes the same arguments as
`f`, has the same effects, if any, and returns the opposite truth value.



---

###### Examples:

```clj
(def a 10)
((complement #(= a %)) 12)
;;=> true
```



---

###### See Also:

[`cljs.core/not`](../cljs.core/not.md)<br>

---


Source docstring:

```
Takes a fn f and returns a fn that takes the same arguments as f,
has the same effects, if any, and returns the opposite truth value.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2341/src/cljs/cljs/core.cljs#L3152-L3160):

```clj
(defn ^boolean complement
  [f]
  (fn
    ([] (not (f)))
    ([x] (not (f x)))
    ([x y] (not (f x y)))
    ([x y & zs] (not (apply f x y zs)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2341
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3152-3160](https://github.com/clojure/clojurescript/blob/r2341/src/cljs/cljs/core.cljs#L3152-L3160)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/complement` @ clojuredocs](http://clojuredocs.org/clojure.core/complement)<br>
[`clojure.core/complement` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/complement/)<br>
[`clojure.core/complement` @ crossclj](http://crossclj.info/fun/clojure.core/complement.html)<br>
[`cljs.core/complement` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/complement.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/complement.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Takes a function `f` and returns a function that takes the same arguments as\n`f`, has the same effects, if any, and returns the opposite truth value.",
 :return-type boolean,
 :ns "cljs.core",
 :name "complement",
 :signature ["[f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/not"],
 :full-name-encode "cljs.core/complement",
 :source {:code "(defn ^boolean complement\n  [f]\n  (fn\n    ([] (not (f)))\n    ([x] (not (f x)))\n    ([x y] (not (f x y)))\n    ([x y & zs] (not (apply f x y zs)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2341",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3152 3160]},
 :examples [{:id "69e359",
             :content "```clj\n(def a 10)\n((complement #(= a %)) 12)\n;;=> true\n```"}],
 :full-name "cljs.core/complement",
 :clj-symbol "clojure.core/complement",
 :docstring "Takes a fn f and returns a fn that takes the same arguments as f,\nhas the same effects, if any, and returns the opposite truth value."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/complement"]))
```

-->
