## cljs.reader/read-string



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/read-string</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/read-string)
</td>
</tr>
</table>


 <samp>
(__read-string__ s)<br>
</samp>

---





Source docstring:

```
Reads one object from the string s
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/reader.cljs#L431-L435):

```clj
(defn read-string
  [s]
  (let [r (push-back-reader s)]
    (read r true nil false)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1889
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:431-435](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/reader.cljs#L431-L435)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/read-string` @ clojuredocs](http://clojuredocs.org/clojure.core/read-string)<br>
[`clojure.core/read-string` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/read-string/)<br>
[`clojure.core/read-string` @ crossclj](http://crossclj.info/fun/clojure.core/read-string.html)<br>
[`cljs.reader/read-string` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/read-string.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/read-string.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "read-string",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.reader/read-string",
 :source {:code "(defn read-string\n  [s]\n  (let [r (push-back-reader s)]\n    (read r true nil false)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [431 435]},
 :full-name "cljs.reader/read-string",
 :clj-symbol "clojure.core/read-string",
 :docstring "Reads one object from the string s"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-string"]))
```

-->
