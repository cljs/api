## cljs.repl/self-require?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2911"><img valign="middle" alt="[+] 0.0-2911" title="Added in 0.0-2911" src="https://img.shields.io/badge/+-0.0--2911-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__self-require?__ specs)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3195/src/clj/cljs/repl.clj#L592-L601):

```clj
(defn self-require? [specs]
  (some
    (fn [quoted-spec-or-kw]
      (and (not (keyword? quoted-spec-or-kw))
           (let [spec (second quoted-spec-or-kw)
                 ns (if (sequential? spec)
                      (first spec)
                      spec)]
             (= ns ana/*cljs-ns*))))
    specs))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3195
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:592-601](https://github.com/clojure/clojurescript/blob/r3195/src/clj/cljs/repl.clj#L592-L601)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/self-require?` @ crossclj](http://crossclj.info/fun/cljs.repl/self-require%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/self-requireQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "self-require?",
 :type "function",
 :signature ["[specs]"],
 :source {:code "(defn self-require? [specs]\n  (some\n    (fn [quoted-spec-or-kw]\n      (and (not (keyword? quoted-spec-or-kw))\n           (let [spec (second quoted-spec-or-kw)\n                 ns (if (sequential? spec)\n                      (first spec)\n                      spec)]\n             (= ns ana/*cljs-ns*))))\n    specs))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/clj/cljs/repl.clj",
          :lines [592 601]},
 :full-name "cljs.repl/self-require?",
 :full-name-encode "cljs.repl/self-requireQMARK",
 :history [["+" "0.0-2911"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/self-require?"]))
```

-->
