## cljs.build.api/src-file->goog-require



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__src-file->goog-require__ src)<br>
</samp>
 <samp>
(__src-file->goog-require__ src options)<br>
</samp>

---





Source docstring:

```
Given a ClojureScript or Google Closure style JavaScript source file return
the goog.require statement for it.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2843/src/clj/cljs/build/api.clj#L86-L91):

```clj
(defn ^String src-file->goog-require
  ([src] (closure/src-file->goog-require src))
  ([src options]
    (closure/src-file->goog-require src options)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2843
└── src
    └── clj
        └── cljs
            └── build
                └── <ins>[api.clj:86-91](https://github.com/clojure/clojurescript/blob/r2843/src/clj/cljs/build/api.clj#L86-L91)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.build.api/src-file->goog-require` @ crossclj](http://crossclj.info/fun/cljs.build.api/src-file-%3Egoog-require.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api/src-file-GTgoog-require.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type String,
 :ns "cljs.build.api",
 :name "src-file->goog-require",
 :signature ["[src]" "[src options]"],
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.build.api/src-file-GTgoog-require",
 :source {:code "(defn ^String src-file->goog-require\n  ([src] (closure/src-file->goog-require src))\n  ([src options]\n    (closure/src-file->goog-require src options)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2843",
          :filename "src/clj/cljs/build/api.clj",
          :lines [86 91]},
 :full-name "cljs.build.api/src-file->goog-require",
 :docstring "Given a ClojureScript or Google Closure style JavaScript source file return\nthe goog.require statement for it."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/src-file->goog-require"]))
```

-->
