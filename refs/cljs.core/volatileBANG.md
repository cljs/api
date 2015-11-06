## cljs.core/volatile!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/volatile!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/volatile!)
</td>
</tr>
</table>


 <samp>
(__volatile!__ val)<br>
</samp>

---



###### See Also:

[`cljs.core/volatile?`](../cljs.core/volatileQMARK.md)<br>
[`cljs.core/vswap!`](../cljs.core/vswapBANG.md)<br>
[`cljs.core/vreset!`](../cljs.core/vresetBANG.md)<br>
[`cljs.core/Volatile`](../cljs.core/Volatile.md)<br>

---


Source docstring:

```
Creates and returns a Volatile with an initial value of val.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/core.cljs#L4039-L4042):

```clj
(defn volatile!
  [val]
  (Volatile. val))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.58
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:4039-4042](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/core.cljs#L4039-L4042)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/volatile!` @ clojuredocs](http://clojuredocs.org/clojure.core/volatile!)<br>
[`clojure.core/volatile!` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/volatile%21/)<br>
[`clojure.core/volatile!` @ crossclj](http://crossclj.info/fun/clojure.core/volatile%21.html)<br>
[`cljs.core/volatile!` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/volatile%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/volatileBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "volatile!",
 :signature ["[val]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :related ["cljs.core/volatile?"
           "cljs.core/vswap!"
           "cljs.core/vreset!"
           "cljs.core/Volatile"],
 :full-name-encode "cljs.core/volatileBANG",
 :source {:code "(defn volatile!\n  [val]\n  (Volatile. val))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.58",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4039 4042]},
 :full-name "cljs.core/volatile!",
 :clj-symbol "clojure.core/volatile!",
 :docstring "Creates and returns a Volatile with an initial value of val."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/volatile!"]))
```

-->
