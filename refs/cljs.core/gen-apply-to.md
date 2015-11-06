## cljs.core/gen-apply-to



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__gen-apply-to__)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L1328-L1336):

```clj
(defmacro gen-apply-to []
  `(do
     (set! ~'*unchecked-if* true)
     (defn ~'apply-to [~'f ~'argc ~'args]
       (let [~'args (seq ~'args)]
         (if (zero? ~'argc)
           (~'f)
           ~(gen-apply-to-helper))))
     (set! ~'*unchecked-if* false)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1806
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1328-1336](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L1328-L1336)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/gen-apply-to` @ crossclj](http://crossclj.info/fun/cljs.core/gen-apply-to.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/gen-apply-to.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "gen-apply-to",
 :type "macro",
 :signature ["[]"],
 :source {:code "(defmacro gen-apply-to []\n  `(do\n     (set! ~'*unchecked-if* true)\n     (defn ~'apply-to [~'f ~'argc ~'args]\n       (let [~'args (seq ~'args)]\n         (if (zero? ~'argc)\n           (~'f)\n           ~(gen-apply-to-helper))))\n     (set! ~'*unchecked-if* false)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1806",
          :filename "src/clj/cljs/core.clj",
          :lines [1328 1336]},
 :full-name "cljs.core/gen-apply-to",
 :full-name-encode "cljs.core/gen-apply-to",
 :history [["+" "0.0-1211"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/gen-apply-to"]))
```

-->
