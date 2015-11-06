## cljs.core/volatile?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__volatile?__ x)<br>
</samp>

---



###### See Also:

[`cljs.core/volatile!`](../cljs.core/volatileBANG.md)<br>

---


Source docstring:

```
Returns true if x is a volatile.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L3897-L3899):

```clj
(defn volatile?
  [x] (instance? Volatile x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3897-3899](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L3897-L3899)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/volatile?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/volatile%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/volatileQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "volatile?",
 :signature ["[x]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :related ["cljs.core/volatile!"],
 :full-name-encode "cljs.core/volatileQMARK",
 :source {:code "(defn volatile?\n  [x] (instance? Volatile x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3897 3899]},
 :full-name "cljs.core/volatile?",
 :docstring "Returns true if x is a volatile."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/volatile?"]))
```

-->
