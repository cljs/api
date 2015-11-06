## cljs.js/dump-core



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__dump-core__)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.clj#L20-L21):

```clj
(defmacro dump-core []
  `(quote ~(get-in @env/*compiler* [::ana/namespaces 'cljs.core])))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.clj:20-21](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.clj#L20-L21)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/dump-core` @ crossclj](http://crossclj.info/fun/cljs.js/dump-core.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/dump-core.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "dump-core",
 :type "macro",
 :signature ["[]"],
 :source {:code "(defmacro dump-core []\n  `(quote ~(get-in @env/*compiler* [::ana/namespaces 'cljs.core])))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/js.clj",
          :lines [20 21]},
 :full-name "cljs.js/dump-core",
 :full-name-encode "cljs.js/dump-core",
 :history [["+" "1.7.10"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/dump-core"]))
```

-->
