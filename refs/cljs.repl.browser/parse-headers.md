## ~~cljs.repl.browser/parse-headers~~


> __MOVED__, please see [`cljs.repl.server/parse-headers`](../cljs.repl.server/parse-headers.md)

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[×] 0.0-1503" title="Removed in 0.0-1503" src="https://img.shields.io/badge/×-0.0--1503-red.svg"></a> </td>
</tr>
</table>


 <samp>
(__parse-headers__ header-lines)<br>
</samp>

---





Source docstring:

```
Parse the headers of an HTTP POST request.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/repl/browser.clj#L116-L124):

```clj
(defn parse-headers
  [header-lines]
  (apply hash-map
   (mapcat
    (fn [line]
      (let [[k v] (str/split line #":" 2)]
        [(keyword (str/lower-case k)) (str/triml v)]))
    header-lines)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1450
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:116-124](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/repl/browser.clj#L116-L124)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/parse-headers` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/parse-headers.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/parse-headers.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:moved "cljs.repl.server/parse-headers",
 :ns "cljs.repl.browser",
 :name "parse-headers",
 :signature ["[header-lines]"],
 :history [["+" "0.0-927"] ["-" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.browser/parse-headers",
 :source {:code "(defn parse-headers\n  [header-lines]\n  (apply hash-map\n   (mapcat\n    (fn [line]\n      (let [[k v] (str/split line #\":\" 2)]\n        [(keyword (str/lower-case k)) (str/triml v)]))\n    header-lines)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [116 124]},
 :full-name "cljs.repl.browser/parse-headers",
 :docstring "Parse the headers of an HTTP POST request.",
 :removed {:in "0.0-1503", :last-seen "0.0-1450"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/parse-headers"]))
```

-->
