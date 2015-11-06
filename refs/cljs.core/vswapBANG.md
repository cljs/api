## cljs.core/vswap!



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vswap!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vswap!)
</td>
</tr>
</table>


 <samp>
(__vswap!__ vol f & args)<br>
</samp>

---



###### See Also:

[`cljs.core/vreset!`](../cljs.core/vresetBANG.md)<br>
[`cljs.core/volatile!`](../cljs.core/volatileBANG.md)<br>

---


Source docstring:

```
Non-atomically swaps the value of the volatile as if:
(apply f current-value-of-vol args). Returns the value that
was swapped in.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/clojure/cljs/core.cljc#L2571-L2576):

```clj
(core/defmacro vswap!
  [vol f & args]
  `(-vreset! ~vol (~f (-deref ~vol) ~@args)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.48
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.cljc:2571-2576](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/clojure/cljs/core.cljc#L2571-L2576)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/vswap!` @ clojuredocs](http://clojuredocs.org/clojure.core/vswap!)<br>
[`clojure.core/vswap!` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/vswap%21/)<br>
[`clojure.core/vswap!` @ crossclj](http://crossclj.info/fun/clojure.core/vswap%21.html)<br>
[`cljs.core/vswap!` @ crossclj](http://crossclj.info/fun/cljs.core/vswap%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/vswapBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "vswap!",
 :signature ["[vol f & args]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :related ["cljs.core/vreset!" "cljs.core/volatile!"],
 :full-name-encode "cljs.core/vswapBANG",
 :source {:code "(core/defmacro vswap!\n  [vol f & args]\n  `(-vreset! ~vol (~f (-deref ~vol) ~@args)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.48",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [2571 2576]},
 :full-name "cljs.core/vswap!",
 :clj-symbol "clojure.core/vswap!",
 :docstring "Non-atomically swaps the value of the volatile as if:\n(apply f current-value-of-vol args). Returns the value that\nwas swapped in."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vswap!"]))
```

-->
