## cljs.reader/special-symbols



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__special-symbols__ t not-found)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/reader.cljs#L319-L325):

```clj
(defn special-symbols [t not-found]
  (cond
    (identical? t "nil") nil
    (identical? t "true") true
    (identical? t "false") false
    (identical? t "/") '/
    :else not-found))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.170
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[reader.cljs:319-325](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/reader.cljs#L319-L325)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/special-symbols` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/special-symbols.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/special-symbols.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "special-symbols",
 :type "function",
 :signature ["[t not-found]"],
 :source {:code "(defn special-symbols [t not-found]\n  (cond\n    (identical? t \"nil\") nil\n    (identical? t \"true\") true\n    (identical? t \"false\") false\n    (identical? t \"/\") '/\n    :else not-found))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.170",
          :filename "src/main/cljs/cljs/reader.cljs",
          :lines [319 325]},
 :full-name "cljs.reader/special-symbols",
 :full-name-encode "cljs.reader/special-symbols",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/special-symbols"]))
```

-->
