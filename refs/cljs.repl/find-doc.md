## cljs.repl/find-doc



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" title="Added in 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.repl/find-doc</samp>](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/find-doc)
</td>
</tr>
</table>


 <samp>
(__find-doc__ re-string-or-pattern)<br>
</samp>

---

Prints documentation for any var whose documentation or name
contains a match for `re-string-or-pattern`.



---

###### Examples:

```clj
(find-doc "some")
;; Prints: (docs truncated)
;; - IPrintWriter (docstring match)
;; - contains? (docstring match)
;; - gensym (docstring match)
;; - cljs.core/if-some
;; - some
;; - cljs.core/some->
;; - cljs.core/some->>
;; - some-fn
;; - some?
;; - trampoline (docstring match)
;; - cljs.core/when-some
;; - cljs.core/while (docstring match)
;;
;;=> nil
```



---

###### See Also:

[`cljs.repl/doc`](../cljs.repl/doc.md)<br>

---


Source docstring:

```
Prints documentation for any var whose documentation or name
contains a match for re-string-or-pattern
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/repl.clj#L918-L940):

```clj
(defmacro find-doc
  [re-string-or-pattern]
  (let [re (re-pattern re-string-or-pattern)
        ms (concat
             (mapcat
               (fn [ns]
                 (map
                   (fn [m]
                     (update-in (select-keys m [:ns :name :doc :forms :arglists :macro :url])
                       [:name] clojure.core/name))
                   (sort-by :name (vals (ana-api/ns-interns ns)))))
               (ana-api/all-ns))
             (map #(select-keys (ana-api/find-ns %) [:name :doc]) (ana-api/all-ns))
             (map special-doc (keys special-doc-map)))
        ms (for [m ms
                 :when (and (:doc m)
                            (or (re-find (re-matcher re (:doc m)))
                                (re-find (re-matcher re (str (:name m))))))]
             m)]
    `(doseq [m# (quote ~ms)]
       (cljs.repl/print-doc m#))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:918-940](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/repl.clj#L918-L940)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.repl/find-doc` @ clojuredocs](http://clojuredocs.org/clojure.repl/find-doc)<br>
[`clojure.repl/find-doc` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.repl/find-doc/)<br>
[`clojure.repl/find-doc` @ crossclj](http://crossclj.info/fun/clojure.repl/find-doc.html)<br>
[`cljs.repl/find-doc` @ crossclj](http://crossclj.info/fun/cljs.repl/find-doc.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/find-doc.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Prints documentation for any var whose documentation or name\ncontains a match for `re-string-or-pattern`.",
 :ns "cljs.repl",
 :name "find-doc",
 :signature ["[re-string-or-pattern]"],
 :history [["+" "0.0-2985"]],
 :type "macro",
 :related ["cljs.repl/doc"],
 :full-name-encode "cljs.repl/find-doc",
 :source {:code "(defmacro find-doc\n  [re-string-or-pattern]\n  (let [re (re-pattern re-string-or-pattern)\n        ms (concat\n             (mapcat\n               (fn [ns]\n                 (map\n                   (fn [m]\n                     (update-in (select-keys m [:ns :name :doc :forms :arglists :macro :url])\n                       [:name] clojure.core/name))\n                   (sort-by :name (vals (ana-api/ns-interns ns)))))\n               (ana-api/all-ns))\n             (map #(select-keys (ana-api/find-ns %) [:name :doc]) (ana-api/all-ns))\n             (map special-doc (keys special-doc-map)))\n        ms (for [m ms\n                 :when (and (:doc m)\n                            (or (re-find (re-matcher re (:doc m)))\n                                (re-find (re-matcher re (str (:name m))))))]\n             m)]\n    `(doseq [m# (quote ~ms)]\n       (cljs.repl/print-doc m#))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/clj/cljs/repl.clj",
          :lines [918 940]},
 :examples [{:id "50ec43",
             :content "```clj\n(find-doc \"some\")\n;; Prints: (docs truncated)\n;; - IPrintWriter (docstring match)\n;; - contains? (docstring match)\n;; - gensym (docstring match)\n;; - cljs.core/if-some\n;; - some\n;; - cljs.core/some->\n;; - cljs.core/some->>\n;; - some-fn\n;; - some?\n;; - trampoline (docstring match)\n;; - cljs.core/when-some\n;; - cljs.core/while (docstring match)\n;;\n;;=> nil\n```"}],
 :full-name "cljs.repl/find-doc",
 :clj-symbol "clojure.repl/find-doc",
 :docstring "Prints documentation for any var whose documentation or name\ncontains a match for re-string-or-pattern"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/find-doc"]))
```

-->
