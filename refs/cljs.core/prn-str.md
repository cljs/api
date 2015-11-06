## cljs.core/prn-str



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1011"><img valign="middle" alt="[+] 0.0-1011" title="Added in 0.0-1011" src="https://img.shields.io/badge/+-0.0--1011-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/prn-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/prn-str)
</td>
</tr>
</table>


 <samp>
(__prn-str__ & objs)<br>
</samp>

---





Source docstring:

```
Same as pr-str followed by (newline)
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1895/src/cljs/cljs/core.cljs#L6704-L6707):

```clj
(defn prn-str
  [& objs]
  (prn-str-with-opts objs (pr-opts)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1895
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6704-6707](https://github.com/clojure/clojurescript/blob/r1895/src/cljs/cljs/core.cljs#L6704-L6707)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/prn-str` @ clojuredocs](http://clojuredocs.org/clojure.core/prn-str)<br>
[`clojure.core/prn-str` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/prn-str/)<br>
[`clojure.core/prn-str` @ crossclj](http://crossclj.info/fun/clojure.core/prn-str.html)<br>
[`cljs.core/prn-str` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/prn-str.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/prn-str.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "prn-str",
 :signature ["[& objs]"],
 :history [["+" "0.0-1011"]],
 :type "function",
 :full-name-encode "cljs.core/prn-str",
 :source {:code "(defn prn-str\n  [& objs]\n  (prn-str-with-opts objs (pr-opts)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1895",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6704 6707]},
 :full-name "cljs.core/prn-str",
 :clj-symbol "clojure.core/prn-str",
 :docstring "Same as pr-str followed by (newline)"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/prn-str"]))
```

-->
