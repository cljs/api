## cljs.core/key-test



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__key-test__ key other)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L5915-L5919):

```clj
(defn ^boolean key-test [key other]
  (cond
    (identical? key other) true
    (keyword-identical? key other) true
    :else (= key other)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:5915-5919](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L5915-L5919)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/key-test` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/key-test.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/key-test.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "key-test",
 :signature ["[key other]"],
 :history [["+" "0.0-1424"]],
 :type "function",
 :full-name-encode "cljs.core/key-test",
 :source {:code "(defn ^boolean key-test [key other]\n  (cond\n    (identical? key other) true\n    (keyword-identical? key other) true\n    :else (= key other)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [5915 5919]},
 :full-name "cljs.core/key-test"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/key-test"]))
```

-->
