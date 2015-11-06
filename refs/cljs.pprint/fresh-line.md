## cljs.pprint/fresh-line



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/fresh-line</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/fresh-line)
</td>
</tr>
</table>


 <samp>
(__fresh-line__)<br>
</samp>

---





Source docstring:

```
Make a newline if *out* is not already at the beginning of the line. If *out* is
not a pretty writer (which keeps track of columns), this function always outputs a newline.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/pprint.cljs#L2093-L2100):

```clj
(defn fresh-line
  []
  (if (satisfies? IDeref *out*)
    (if (not (= 0 (get-column (:base @@*out*))))
      (prn))
    (prn)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:2093-2100](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/pprint.cljs#L2093-L2100)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/fresh-line` @ clojuredocs](http://clojuredocs.org/clojure.pprint/fresh-line)<br>
[`clojure.pprint/fresh-line` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/fresh-line/)<br>
[`clojure.pprint/fresh-line` @ crossclj](http://crossclj.info/fun/clojure.pprint/fresh-line.html)<br>
[`cljs.pprint/fresh-line` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/fresh-line.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/fresh-line.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "fresh-line",
 :signature ["[]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint/fresh-line",
 :source {:code "(defn fresh-line\n  []\n  (if (satisfies? IDeref *out*)\n    (if (not (= 0 (get-column (:base @@*out*))))\n      (prn))\n    (prn)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [2093 2100]},
 :full-name "cljs.pprint/fresh-line",
 :clj-symbol "clojure.pprint/fresh-line",
 :docstring "Make a newline if *out* is not already at the beginning of the line. If *out* is\nnot a pretty writer (which keeps track of columns), this function always outputs a newline."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/fresh-line"]))
```

-->
