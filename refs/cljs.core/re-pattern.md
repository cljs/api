## cljs.core/re-pattern



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/re-pattern</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/re-pattern)
</td>
</tr>
</table>


 <samp>
(__re-pattern__ s)<br>
</samp>

---

Returns an instance of RegExp which has compiled the provided string.



---




Source docstring:

```
Returns an instance of RegExp which has compiled the provided string.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/cljs/core.cljs#L6638-L6642):

```clj
(defn re-pattern
  [s]
  (let [[_ flags pattern] (re-find #"^(?:\(\?([idmsux]*)\))?(.*)" s)]
    (js/RegExp. pattern flags)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2127
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6638-6642](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/cljs/core.cljs#L6638-L6642)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/re-pattern` @ clojuredocs](http://clojuredocs.org/clojure.core/re-pattern)<br>
[`clojure.core/re-pattern` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/re-pattern/)<br>
[`clojure.core/re-pattern` @ crossclj](http://crossclj.info/fun/clojure.core/re-pattern.html)<br>
[`cljs.core/re-pattern` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/re-pattern.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/re-pattern.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns an instance of RegExp which has compiled the provided string.",
 :ns "cljs.core",
 :name "re-pattern",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/re-pattern",
 :source {:code "(defn re-pattern\n  [s]\n  (let [[_ flags pattern] (re-find #\"^(?:\\(\\?([idmsux]*)\\))?(.*)\" s)]\n    (js/RegExp. pattern flags)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2127",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6638 6642]},
 :full-name "cljs.core/re-pattern",
 :clj-symbol "clojure.core/re-pattern",
 :docstring "Returns an instance of RegExp which has compiled the provided string."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/re-pattern"]))
```

-->
