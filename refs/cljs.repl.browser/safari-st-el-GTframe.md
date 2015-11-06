## ~~cljs.repl.browser/safari-st-el->frame~~



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3053"><img valign="middle" alt="[+] 0.0-3053" title="Added in 0.0-3053" src="https://img.shields.io/badge/+-0.0--3053-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[×] 1.7.10" title="Removed in 1.7.10" src="https://img.shields.io/badge/×-1.7.10-red.svg"></a> </td>
</tr>
</table>


 <samp>
(__safari-st-el->frame__ repl-env st-el opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/repl/browser.clj#L318-L333):

```clj
(defn safari-st-el->frame
  [repl-env st-el opts]
  (let [[function flc] (if (re-find #"@" st-el)
                         (string/split st-el #"@")
                         [nil st-el])
        [file line column] (parse-file-line-column flc)]
    (if (and file function line column)
      {:file (parse-file repl-env file opts)
       :function function
       :line line
       :column column}
      (when-not (string/blank? function)
        {:file nil
         :function (string/trim function)
         :line nil
         :column nil}))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[browser.clj:318-333](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/repl/browser.clj#L318-L333)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/safari-st-el->frame` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/safari-st-el-%3Eframe.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/safari-st-el-GTframe.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "safari-st-el->frame",
 :signature ["[repl-env st-el opts]"],
 :history [["+" "0.0-3053"] ["-" "1.7.10"]],
 :type "function",
 :full-name-encode "cljs.repl.browser/safari-st-el-GTframe",
 :source {:code "(defn safari-st-el->frame\n  [repl-env st-el opts]\n  (let [[function flc] (if (re-find #\"@\" st-el)\n                         (string/split st-el #\"@\")\n                         [nil st-el])\n        [file line column] (parse-file-line-column flc)]\n    (if (and file function line column)\n      {:file (parse-file repl-env file opts)\n       :function function\n       :line line\n       :column column}\n      (when-not (string/blank? function)\n        {:file nil\n         :function (string/trim function)\n         :line nil\n         :column nil}))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [318 333]},
 :full-name "cljs.repl.browser/safari-st-el->frame",
 :removed {:in "1.7.10", :last-seen "0.0-3308"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/safari-st-el->frame"]))
```

-->
