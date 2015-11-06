## clojure.data/Diff



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.data/Diff</samp>](http://clojure.github.io/clojure/branch-master/clojure.data-api.html#clojure.data/Diff)
</td>
</tr>
</table>







Source docstring:

```
Implementation detail. Subject to change.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/clojure/data.cljs#L79-L81):

```clj
(defprotocol Diff
  "Implementation detail. Subject to change."
  (diff-similar [a b] "Implementation detail. Subject to change."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1847
└── src
    └── cljs
        └── clojure
            └── <ins>[data.cljs:79-81](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/clojure/data.cljs#L79-L81)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.data/Diff` @ clojuredocs](http://clojuredocs.org/clojure.data/Diff)<br>
[`clojure.data/Diff` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.data/Diff/)<br>
[`clojure.data/Diff` @ crossclj](http://crossclj.info/fun/clojure.data/Diff.html)<br>
[`clojure.data/Diff` @ crossclj](http://crossclj.info/fun/clojure.data.cljs/Diff.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.data/Diff.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.data",
 :name "Diff",
 :history [["+" "0.0-1503"]],
 :type "protocol",
 :full-name-encode "clojure.data/Diff",
 :source {:code "(defprotocol Diff\n  \"Implementation detail. Subject to change.\"\n  (diff-similar [a b] \"Implementation detail. Subject to change.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1847",
          :filename "src/cljs/clojure/data.cljs",
          :lines [79 81]},
 :methods [{:name "diff-similar",
            :signature ["[a b]"],
            :docstring "Implementation detail. Subject to change."}],
 :full-name "clojure.data/Diff",
 :clj-symbol "clojure.data/Diff",
 :docstring "Implementation detail. Subject to change."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.data/Diff"]))
```

-->
