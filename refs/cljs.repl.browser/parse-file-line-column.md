## cljs.repl.browser/parse-file-line-column



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3053"><img valign="middle" alt="[+] 0.0-3053" title="Added in 0.0-3053" src="https://img.shields.io/badge/+-0.0--3053-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__parse-file-line-column__ flc)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3123/src/clj/cljs/repl/browser.clj#L196-L213):

```clj
(defn parse-file-line-column [flc]
  (let [xs (string/split flc #":")
        [pre [line column]]
        (reduce
          (fn [[pre post] [x i]]
            (if (<= i 2)
              [pre (conj post x)]
              [(conj pre x) post]))
          [[] []] (map vector xs (range (count xs) 0 -1)))
        file (string/join ":" pre)]
    [(cond-> file
       (.startsWith file "(") (string/replace "(" ""))
     (Long/parseLong
       (cond-> line
         (.endsWith line ")") (string/replace ")" "")))
     (Long/parseLong
       (cond-> column
         (.endsWith column ")") (string/replace ")" "")))]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3123
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:196-213](https://github.com/clojure/clojurescript/blob/r3123/src/clj/cljs/repl/browser.clj#L196-L213)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/parse-file-line-column` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/parse-file-line-column.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/parse-file-line-column.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "parse-file-line-column",
 :type "function",
 :signature ["[flc]"],
 :source {:code "(defn parse-file-line-column [flc]\n  (let [xs (string/split flc #\":\")\n        [pre [line column]]\n        (reduce\n          (fn [[pre post] [x i]]\n            (if (<= i 2)\n              [pre (conj post x)]\n              [(conj pre x) post]))\n          [[] []] (map vector xs (range (count xs) 0 -1)))\n        file (string/join \":\" pre)]\n    [(cond-> file\n       (.startsWith file \"(\") (string/replace \"(\" \"\"))\n     (Long/parseLong\n       (cond-> line\n         (.endsWith line \")\") (string/replace \")\" \"\")))\n     (Long/parseLong\n       (cond-> column\n         (.endsWith column \")\") (string/replace \")\" \"\")))]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [196 213]},
 :full-name "cljs.repl.browser/parse-file-line-column",
 :full-name-encode "cljs.repl.browser/parse-file-line-column",
 :history [["+" "0.0-3053"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/parse-file-line-column"]))
```

-->
