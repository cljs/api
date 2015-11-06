## cljs.core/unchecked-long



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-long</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-long)
</td>
</tr>
</table>


 <samp>
(__unchecked-long__ x)<br>
</samp>

---





Source docstring:

```
Coerce to long by stripping decimal places. Identical to `int'.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L1603-L1606):

```clj
(defn unchecked-long
  [x]
  (fix x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1603-1606](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L1603-L1606)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/unchecked-long` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-long)<br>
[`clojure.core/unchecked-long` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-long/)<br>
[`clojure.core/unchecked-long` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-long.html)<br>
[`cljs.core/unchecked-long` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-long.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-long.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "unchecked-long",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core/unchecked-long",
 :source {:code "(defn unchecked-long\n  [x]\n  (fix x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1603 1606]},
 :full-name "cljs.core/unchecked-long",
 :clj-symbol "clojure.core/unchecked-long",
 :docstring "Coerce to long by stripping decimal places. Identical to `int'."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-long"]))
```

-->
