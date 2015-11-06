## cljs.core/printf



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" title="Added in 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/printf</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/printf)
</td>
</tr>
</table>


 <samp>
(__printf__ fmt & args)<br>
</samp>

---





Source docstring:

```
Prints formatted output, as per format
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1878/src/cljs/cljs/core.cljs#L6758-L6761):

```clj
(defn printf
  [fmt & args]
  (print (apply format fmt args)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1878
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6758-6761](https://github.com/clojure/clojurescript/blob/r1878/src/cljs/cljs/core.cljs#L6758-L6761)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/printf` @ clojuredocs](http://clojuredocs.org/clojure.core/printf)<br>
[`clojure.core/printf` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/printf/)<br>
[`clojure.core/printf` @ crossclj](http://crossclj.info/fun/clojure.core/printf.html)<br>
[`cljs.core/printf` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/printf.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/printf.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "printf",
 :signature ["[fmt & args]"],
 :history [["+" "0.0-1443"]],
 :type "function",
 :full-name-encode "cljs.core/printf",
 :source {:code "(defn printf\n  [fmt & args]\n  (print (apply format fmt args)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1878",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6758 6761]},
 :full-name "cljs.core/printf",
 :clj-symbol "clojure.core/printf",
 :docstring "Prints formatted output, as per format"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/printf"]))
```

-->
