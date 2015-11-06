## cljs.compiler.api/cljs-files-in



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__cljs-files-in__ dir)<br>
</samp>

---





Source docstring:

```
Return a sequence of all .cljs and .cljc files in the given directory.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/clojure/cljs/compiler/api.clj#L88-L91):

```clj
(defn cljs-files-in
  [dir]
  (comp/cljs-files-in dir))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── clojure
            └── cljs
                └── compiler
                    └── <ins>[api.clj:88-91](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/clojure/cljs/compiler/api.clj#L88-L91)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.compiler.api/cljs-files-in` @ crossclj](http://crossclj.info/fun/cljs.compiler.api/cljs-files-in.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.compiler.api/cljs-files-in.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.compiler.api",
 :name "cljs-files-in",
 :signature ["[dir]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.compiler.api/cljs-files-in",
 :source {:code "(defn cljs-files-in\n  [dir]\n  (comp/cljs-files-in dir))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/clojure/cljs/compiler/api.clj",
          :lines [88 91]},
 :full-name "cljs.compiler.api/cljs-files-in",
 :docstring "Return a sequence of all .cljs and .cljc files in the given directory."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.compiler.api/cljs-files-in"]))
```

-->
