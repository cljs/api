## cljs.repl/js-src->cljs-src



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__js-src->cljs-src__ f)<br>
</samp>

---





Source docstring:

```
Map a JavaScript output file back to the original ClojureScript source
file.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/repl.clj#L203-L210):

```clj
(defn ^File js-src->cljs-src
  [f]
  (let [f (io/file f)
        dir (.getParentFile f)
        name (.getName f)]
    (io/file dir (string/replace name ".js" ".cljs"))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3165
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:203-210](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/repl.clj#L203-L210)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/js-src->cljs-src` @ crossclj](http://crossclj.info/fun/cljs.repl/js-src-%3Ecljs-src.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/js-src-GTcljs-src.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type File,
 :ns "cljs.repl",
 :name "js-src->cljs-src",
 :signature ["[f]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl/js-src-GTcljs-src",
 :source {:code "(defn ^File js-src->cljs-src\n  [f]\n  (let [f (io/file f)\n        dir (.getParentFile f)\n        name (.getName f)]\n    (io/file dir (string/replace name \".js\" \".cljs\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/clj/cljs/repl.clj",
          :lines [203 210]},
 :full-name "cljs.repl/js-src->cljs-src",
 :docstring "Map a JavaScript output file back to the original ClojureScript source\nfile."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/js-src->cljs-src"]))
```

-->
