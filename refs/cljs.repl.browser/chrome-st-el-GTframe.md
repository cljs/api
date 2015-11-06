## cljs.repl.browser/chrome-st-el->frame



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3053"><img valign="middle" alt="[+] 0.0-3053" title="Added in 0.0-3053" src="https://img.shields.io/badge/+-0.0--3053-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__chrome-st-el->frame__ st-el opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3211/src/clj/cljs/repl/browser.clj#L231-L249):

```clj
(defn chrome-st-el->frame
  [st-el opts]
  (let [xs (-> st-el
             (string/replace #"\s+at\s+" "")
             (string/split #"\s+"))
        [function flc] (if (== (count xs) 1)
                         [nil (first xs)]
                         [(first xs) (last xs)])
        [file line column] (parse-file-line-column flc)]
    (if (and file function line column)
      {:file (parse-file file opts)
       :function (string/replace function #"Object\." "")
       :line line
       :column column}
      (when-not (string/blank? function)
        {:file nil
         :function (string/replace function #"Object\." "")
         :line nil
         :column nil}))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3211
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:231-249](https://github.com/clojure/clojurescript/blob/r3211/src/clj/cljs/repl/browser.clj#L231-L249)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/chrome-st-el->frame` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/chrome-st-el-%3Eframe.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/chrome-st-el-GTframe.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "chrome-st-el->frame",
 :type "function",
 :signature ["[st-el opts]"],
 :source {:code "(defn chrome-st-el->frame\n  [st-el opts]\n  (let [xs (-> st-el\n             (string/replace #\"\\s+at\\s+\" \"\")\n             (string/split #\"\\s+\"))\n        [function flc] (if (== (count xs) 1)\n                         [nil (first xs)]\n                         [(first xs) (last xs)])\n        [file line column] (parse-file-line-column flc)]\n    (if (and file function line column)\n      {:file (parse-file file opts)\n       :function (string/replace function #\"Object\\.\" \"\")\n       :line line\n       :column column}\n      (when-not (string/blank? function)\n        {:file nil\n         :function (string/replace function #\"Object\\.\" \"\")\n         :line nil\n         :column nil}))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [231 249]},
 :full-name "cljs.repl.browser/chrome-st-el->frame",
 :full-name-encode "cljs.repl.browser/chrome-st-el-GTframe",
 :history [["+" "0.0-3053"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/chrome-st-el->frame"]))
```

-->
