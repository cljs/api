## ~~cljs.js/wrap-error~~



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.28"><img valign="middle" alt="[×] 1.7.28" title="Removed in 1.7.28" src="https://img.shields.io/badge/×-1.7.28-red.svg"></a> </td>
</tr>
</table>


 <samp>
(__wrap-error__ ex)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.cljs#L100-L101):

```clj
(defn wrap-error [ex]
  {:error ex})
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.cljs:100-101](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.cljs#L100-L101)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/wrap-error` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/wrap-error.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/wrap-error.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "wrap-error",
 :signature ["[ex]"],
 :history [["+" "1.7.10"] ["-" "1.7.28"]],
 :type "function",
 :full-name-encode "cljs.js/wrap-error",
 :source {:code "(defn wrap-error [ex]\n  {:error ex})",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [100 101]},
 :full-name "cljs.js/wrap-error",
 :removed {:in "1.7.28", :last-seen "1.7.10"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/wrap-error"]))
```

-->
