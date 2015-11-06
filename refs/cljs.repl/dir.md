## cljs.repl/dir



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" title="Added in 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.repl/dir</samp>](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/dir)
</td>
</tr>
</table>


 <samp>
(__dir__ ns)<br>
</samp>

---

Prints a sorted directory of public vars in a namespace `ns`.



---

###### Examples:

```clj
(require 'clojure.set)

(dir clojure.set)
;; Prints:
;;  difference
;;  index
;;  intersection
;;  join
;;  map-invert
;;  project
;;  rename
;;  rename-keys
;;  select
;;  subset?
;;  superset?
;;  union
;;
;;=> nil
```



---

###### See Also:

[`cljs.repl/find-doc`](../cljs.repl/find-doc.md)<br>
[`cljs.repl/apropos`](../cljs.repl/apropos.md)<br>

---


Source docstring:

```
Prints a sorted directory of public vars in a namespace
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3153/src/clj/cljs/repl.clj#L1152-L1156):

```clj
(defmacro dir
  [ns]
  `(doseq [sym# (quote ~(sort (keys (ana-api/ns-publics ns))))]
     (println sym#)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3153
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:1152-1156](https://github.com/clojure/clojurescript/blob/r3153/src/clj/cljs/repl.clj#L1152-L1156)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.repl/dir` @ clojuredocs](http://clojuredocs.org/clojure.repl/dir)<br>
[`clojure.repl/dir` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.repl/dir/)<br>
[`clojure.repl/dir` @ crossclj](http://crossclj.info/fun/clojure.repl/dir.html)<br>
[`cljs.repl/dir` @ crossclj](http://crossclj.info/fun/cljs.repl/dir.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/dir.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Prints a sorted directory of public vars in a namespace `ns`.",
 :ns "cljs.repl",
 :name "dir",
 :signature ["[ns]"],
 :history [["+" "0.0-2985"]],
 :type "macro",
 :related ["cljs.repl/find-doc" "cljs.repl/apropos"],
 :full-name-encode "cljs.repl/dir",
 :source {:code "(defmacro dir\n  [ns]\n  `(doseq [sym# (quote ~(sort (keys (ana-api/ns-publics ns))))]\n     (println sym#)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/clj/cljs/repl.clj",
          :lines [1152 1156]},
 :examples [{:id "9bf2b0",
             :content "```clj\n(require 'clojure.set)\n\n(dir clojure.set)\n;; Prints:\n;;  difference\n;;  index\n;;  intersection\n;;  join\n;;  map-invert\n;;  project\n;;  rename\n;;  rename-keys\n;;  select\n;;  subset?\n;;  superset?\n;;  union\n;;\n;;=> nil\n```"}],
 :full-name "cljs.repl/dir",
 :clj-symbol "clojure.repl/dir",
 :docstring "Prints a sorted directory of public vars in a namespace"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/dir"]))
```

-->
