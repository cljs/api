## cljs.core/vswap!



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
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


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2657/src/clj/cljs/core.clj#L1686-L1691):

```clj
(defmacro vswap!
  [vol f & args]
  `(-vreset! ~vol (~f (-deref ~vol) ~@args)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2657
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1686-1691](https://github.com/clojure/clojurescript/blob/r2657/src/clj/cljs/core.clj#L1686-L1691)</ins>
</pre>

-->

---



###### External doc links:

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
 :source {:code "(defmacro vswap!\n  [vol f & args]\n  `(-vreset! ~vol (~f (-deref ~vol) ~@args)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2657",
          :filename "src/clj/cljs/core.clj",
          :lines [1686 1691]},
 :full-name "cljs.core/vswap!",
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
