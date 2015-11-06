## cljs.core/force



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/force</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/force)
</td>
</tr>
</table>


 <samp>
(__force__ x)<br>
</samp>

---





Source docstring:

```
If x is a Delay, returns the (possibly cached) value of its expression, else returns x
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L6887-L6892):

```clj
(defn force
  [x]
  (if (delay? x)
    (deref x)
    x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6887-6892](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L6887-L6892)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/force` @ clojuredocs](http://clojuredocs.org/clojure.core/force)<br>
[`clojure.core/force` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/force/)<br>
[`clojure.core/force` @ crossclj](http://crossclj.info/fun/clojure.core/force.html)<br>
[`cljs.core/force` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/force.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/force.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "force",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/force",
 :source {:code "(defn force\n  [x]\n  (if (delay? x)\n    (deref x)\n    x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1586",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6887 6892]},
 :full-name "cljs.core/force",
 :clj-symbol "clojure.core/force",
 :docstring "If x is a Delay, returns the (possibly cached) value of its expression, else returns x"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/force"]))
```

-->
