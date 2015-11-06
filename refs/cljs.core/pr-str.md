## cljs.core/pr-str



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/pr-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pr-str)
</td>
</tr>
</table>


 <samp>
(__pr-str__ & objs)<br>
</samp>

---





Source docstring:

```
pr to a string, returning it. Fundamental entrypoint to IPrintWithWriter.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L8267-L8270):

```clj
(defn pr-str
  [& objs]
  (pr-str-with-opts objs (pr-opts)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8267-8270](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L8267-L8270)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/pr-str` @ clojuredocs](http://clojuredocs.org/clojure.core/pr-str)<br>
[`clojure.core/pr-str` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/pr-str/)<br>
[`clojure.core/pr-str` @ crossclj](http://crossclj.info/fun/clojure.core/pr-str.html)<br>
[`cljs.core/pr-str` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/pr-str.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/pr-str.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "pr-str",
 :signature ["[& objs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/pr-str",
 :source {:code "(defn pr-str\n  [& objs]\n  (pr-str-with-opts objs (pr-opts)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8267 8270]},
 :full-name "cljs.core/pr-str",
 :clj-symbol "clojure.core/pr-str",
 :docstring "pr to a string, returning it. Fundamental entrypoint to IPrintWithWriter."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pr-str"]))
```

-->
