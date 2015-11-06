## cljs.core/reduced?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__reduced?__ r)<br>
</samp>

---





Source docstring:

```
Returns true if x is the result of a call to reduced
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1000-L1003):

```clj
(defn ^boolean reduced?
  [r]
  (instance? Reduced r))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1000-1003](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1000-L1003)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/reduced?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/reduced%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/reducedQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "reduced?",
 :signature ["[r]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core/reducedQMARK",
 :source {:code "(defn ^boolean reduced?\n  [r]\n  (instance? Reduced r))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1000 1003]},
 :full-name "cljs.core/reduced?",
 :docstring "Returns true if x is the result of a call to reduced"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reduced?"]))
```

-->
