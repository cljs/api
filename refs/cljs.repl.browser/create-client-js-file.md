## cljs.repl.browser/create-client-js-file



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__create-client-js-file__ opts file-path)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2120/src/clj/cljs/repl/browser.clj#L205-L209):

```clj
(defn create-client-js-file [opts file-path]
  (let [file (io/file file-path)]
    (when (not (.exists file))
      (spit file (compile-client-js opts)))
    file))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2120
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:205-209](https://github.com/clojure/clojurescript/blob/r2120/src/clj/cljs/repl/browser.clj#L205-L209)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/create-client-js-file` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/create-client-js-file.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/create-client-js-file.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "create-client-js-file",
 :type "function",
 :signature ["[opts file-path]"],
 :source {:code "(defn create-client-js-file [opts file-path]\n  (let [file (io/file file-path)]\n    (when (not (.exists file))\n      (spit file (compile-client-js opts)))\n    file))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2120",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [205 209]},
 :full-name "cljs.repl.browser/create-client-js-file",
 :full-name-encode "cljs.repl.browser/create-client-js-file",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/create-client-js-file"]))
```

-->
