## cljs.core/vreset!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vreset!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vreset!)
</td>
</tr>
</table>


 <samp>
(__vreset!__ vol newval)<br>
</samp>

---



###### See Also:

[`cljs.core/vswap!`](../cljs.core/vswapBANG.md)<br>
[`cljs.core/volatile!`](../cljs.core/volatileBANG.md)<br>

---


Source docstring:

```
Sets the value of volatile to newval without regard for the
current value. Returns newval.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L3912-L3915):

```clj
(defn vreset!
  [vol newval]  (-vreset! vol newval))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3912-3915](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L3912-L3915)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/vreset!` @ clojuredocs](http://clojuredocs.org/clojure.core/vreset!)<br>
[`clojure.core/vreset!` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/vreset%21/)<br>
[`clojure.core/vreset!` @ crossclj](http://crossclj.info/fun/clojure.core/vreset%21.html)<br>
[`cljs.core/vreset!` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/vreset%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/vresetBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "vreset!",
 :signature ["[vol newval]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :related ["cljs.core/vswap!" "cljs.core/volatile!"],
 :full-name-encode "cljs.core/vresetBANG",
 :source {:code "(defn vreset!\n  [vol newval]  (-vreset! vol newval))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3912 3915]},
 :full-name "cljs.core/vreset!",
 :clj-symbol "clojure.core/vreset!",
 :docstring "Sets the value of volatile to newval without regard for the\ncurrent value. Returns newval."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vreset!"]))
```

-->
