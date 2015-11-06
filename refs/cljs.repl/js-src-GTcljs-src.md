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
file (.cljs or .cljc).
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3255/src/main/clojure/cljs/repl.cljc#L203-L215):

```clj
(defn ^File js-src->cljs-src
  [f]
  (let [f (io/file f)
        dir (.getParentFile f)
        base-name (string/replace (.getName f) ".js" "")
        cljsf (io/file dir (str base-name ".cljs"))]
    (if (.exists cljsf)
      cljsf
      (let [cljcf (io/file dir (str base-name ".cljc"))]
        (if (.exists cljcf)
          cljcf)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:203-215](https://github.com/clojure/clojurescript/blob/r3255/src/main/clojure/cljs/repl.cljc#L203-L215)</ins>
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
 :source {:code "(defn ^File js-src->cljs-src\n  [f]\n  (let [f (io/file f)\n        dir (.getParentFile f)\n        base-name (string/replace (.getName f) \".js\" \"\")\n        cljsf (io/file dir (str base-name \".cljs\"))]\n    (if (.exists cljsf)\n      cljsf\n      (let [cljcf (io/file dir (str base-name \".cljc\"))]\n        (if (.exists cljcf)\n          cljcf)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [203 215]},
 :full-name "cljs.repl/js-src->cljs-src",
 :docstring "Map a JavaScript output file back to the original ClojureScript source\nfile (.cljs or .cljc)."}

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
