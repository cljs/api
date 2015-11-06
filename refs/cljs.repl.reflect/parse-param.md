## cljs.repl.reflect/parse-param



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__parse-param__ path)<br>
</samp>

---





Source docstring:

```
Parses the query parameter of a path of the form "/reflect?var=foo"
into the vector ["var" "foo"].
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3126/src/clj/cljs/repl/reflect.clj#L44-L50):

```clj
(defn parse-param
  [path]
  (-> (str/split path #"\?")
      (last)
      (str/split #"=")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3126
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[reflect.clj:44-50](https://github.com/clojure/clojurescript/blob/r3126/src/clj/cljs/repl/reflect.clj#L44-L50)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.reflect/parse-param` @ crossclj](http://crossclj.info/fun/cljs.repl.reflect/parse-param.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.reflect/parse-param.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.reflect",
 :name "parse-param",
 :signature ["[path]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.reflect/parse-param",
 :source {:code "(defn parse-param\n  [path]\n  (-> (str/split path #\"\\?\")\n      (last)\n      (str/split #\"=\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/clj/cljs/repl/reflect.clj",
          :lines [44 50]},
 :full-name "cljs.repl.reflect/parse-param",
 :docstring "Parses the query parameter of a path of the form \"/reflect?var=foo\"\ninto the vector [\"var\" \"foo\"]."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.reflect/parse-param"]))
```

-->
