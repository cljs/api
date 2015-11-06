## cljs.repl.rhino/load-file



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" title="Added in 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__load-file__ repl-env opts src)<br>
</samp>

---





Source docstring:

```
Load a JavaScript. This is needed to load JavaScript files before the Rhino
environment is bootstrapped. After bootstrapping load-javascript will be
used.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl/rhino.clj#L88-L94):

```clj
(defn load-file
  [repl-env opts src]
  (let [goog-path (io/file (util/output-directory opts) "goog" src)]
    (rhino-eval repl-env (.getPath goog-path) 1 (io/reader goog-path))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:88-94](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/repl/rhino.clj#L88-L94)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.rhino/load-file` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/load-file.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/load-file.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "load-file",
 :signature ["[repl-env opts src]"],
 :history [["+" "0.0-2985"]],
 :type "function",
 :full-name-encode "cljs.repl.rhino/load-file",
 :source {:code "(defn load-file\n  [repl-env opts src]\n  (let [goog-path (io/file (util/output-directory opts) \"goog\" src)]\n    (rhino-eval repl-env (.getPath goog-path) 1 (io/reader goog-path))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [88 94]},
 :full-name "cljs.repl.rhino/load-file",
 :docstring "Load a JavaScript. This is needed to load JavaScript files before the Rhino\nenvironment is bootstrapped. After bootstrapping load-javascript will be\nused."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/load-file"]))
```

-->
