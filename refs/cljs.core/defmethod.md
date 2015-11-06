## cljs.core/defmethod



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defmethod</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defmethod)
</td>
</tr>
</table>


 <samp>
(__defmethod__ multifn dispatch-val & fn-tail)<br>
</samp>

---





Source docstring:

```
Creates and installs a new method of multimethod associated with dispatch-value. 
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2227/src/clj/cljs/core.clj#L1564-L1567):

```clj
(defmacro defmethod
  [multifn dispatch-val & fn-tail]
  `(-add-method ~(with-meta multifn {:tag 'cljs.core/MultiFn}) ~dispatch-val (fn ~@fn-tail)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2227
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1564-1567](https://github.com/clojure/clojurescript/blob/r2227/src/clj/cljs/core.clj#L1564-L1567)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/defmethod` @ clojuredocs](http://clojuredocs.org/clojure.core/defmethod)<br>
[`clojure.core/defmethod` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/defmethod/)<br>
[`clojure.core/defmethod` @ crossclj](http://crossclj.info/fun/clojure.core/defmethod.html)<br>
[`cljs.core/defmethod` @ crossclj](http://crossclj.info/fun/cljs.core/defmethod.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/defmethod.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "defmethod",
 :signature ["[multifn dispatch-val & fn-tail]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core/defmethod",
 :source {:code "(defmacro defmethod\n  [multifn dispatch-val & fn-tail]\n  `(-add-method ~(with-meta multifn {:tag 'cljs.core/MultiFn}) ~dispatch-val (fn ~@fn-tail)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/clj/cljs/core.clj",
          :lines [1564 1567]},
 :full-name "cljs.core/defmethod",
 :clj-symbol "clojure.core/defmethod",
 :docstring "Creates and installs a new method of multimethod associated with dispatch-value. "}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defmethod"]))
```

-->
