## cljs.core/seqable?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__seqable?__ s)<br>
</samp>

---





Source docstring:

```
Return true if s satisfies ISeqable
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/core.cljs#L1458-L1461):

```clj
(defn ^boolean seqable?
  [s]
  (satisfies? ISeqable s))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2371
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1458-1461](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/core.cljs#L1458-L1461)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/seqable?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/seqable%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/seqableQMARK.cljsdoc
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
 :name "seqable?",
 :signature ["[s]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core/seqableQMARK",
 :source {:code "(defn ^boolean seqable?\n  [s]\n  (satisfies? ISeqable s))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2371",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1458 1461]},
 :full-name "cljs.core/seqable?",
 :docstring "Return true if s satisfies ISeqable"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/seqable?"]))
```

-->
