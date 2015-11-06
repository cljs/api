## cljs.repl.browser/parse-file



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3053"><img valign="middle" alt="[+] 0.0-3053" title="Added in 0.0-3053" src="https://img.shields.io/badge/+-0.0--3053-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__parse-file__ file opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3153/src/clj/cljs/repl/browser.clj#L214-L224):

```clj
(defn parse-file [file opts]
  (if (re-find #"http://localhost:9000/" file)
    (-> file
      (string/replace #"http://localhost:9000/" "")
      (string/replace (Pattern/compile (str "^" (util/output-directory opts) "/")) ""))
    (if-let [asset-root (:asset-root opts)]
      (string/replace file asset-root "")
      (throw
        (ex-info (str "Could not relativize URL " file)
          {:type :parse-stacktrace
           :reason :relativize-url})))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3153
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:214-224](https://github.com/clojure/clojurescript/blob/r3153/src/clj/cljs/repl/browser.clj#L214-L224)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/parse-file` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/parse-file.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/parse-file.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "parse-file",
 :type "function",
 :signature ["[file opts]"],
 :source {:code "(defn parse-file [file opts]\n  (if (re-find #\"http://localhost:9000/\" file)\n    (-> file\n      (string/replace #\"http://localhost:9000/\" \"\")\n      (string/replace (Pattern/compile (str \"^\" (util/output-directory opts) \"/\")) \"\"))\n    (if-let [asset-root (:asset-root opts)]\n      (string/replace file asset-root \"\")\n      (throw\n        (ex-info (str \"Could not relativize URL \" file)\n          {:type :parse-stacktrace\n           :reason :relativize-url})))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [214 224]},
 :full-name "cljs.repl.browser/parse-file",
 :full-name-encode "cljs.repl.browser/parse-file",
 :history [["+" "0.0-3053"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/parse-file"]))
```

-->
