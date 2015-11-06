## cljs.core/set-print-fn!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__set-print-fn!__ f)<br>
</samp>

---





Source docstring:

```
Set *print-fn* to f.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/cljs/core.cljs#L28-L30):

```clj
(defn set-print-fn!
  [f] (set! *print-fn* f))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2342
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:28-30](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/cljs/core.cljs#L28-L30)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/set-print-fn!` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/set-print-fn%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/set-print-fnBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "set-print-fn!",
 :signature ["[f]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core/set-print-fnBANG",
 :source {:code "(defn set-print-fn!\n  [f] (set! *print-fn* f))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/cljs/cljs/core.cljs",
          :lines [28 30]},
 :full-name "cljs.core/set-print-fn!",
 :docstring "Set *print-fn* to f."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/set-print-fn!"]))
```

-->
