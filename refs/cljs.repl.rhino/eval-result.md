## cljs.repl.rhino/eval-result



 <table border="1">
<tr>
<td>multimethod</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/repl/rhino.clj#L48):

```clj
(defmulti eval-result class)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1006
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:48](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/repl/rhino.clj#L48)</ins>
</pre>

-->

---

Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/repl/rhino.clj#L50-L51):

```clj
(defmethod eval-result :default [r]
  (.toString r))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1006
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:50-51](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/repl/rhino.clj#L50-L51)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/repl/rhino.clj#L53):

```clj
(defmethod eval-result nil [_] "")
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1006
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:53](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/repl/rhino.clj#L53)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/repl/rhino.clj#L55):

```clj
(defmethod eval-result org.mozilla.javascript.Undefined [_] "")
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1006
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:55](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/repl/rhino.clj#L55)</ins>
</pre>
-->

---


###### External doc links:

[`cljs.repl.rhino/eval-result` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/eval-result.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/eval-result.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "eval-result",
 :type "multimethod",
 :source {:code "(defmulti eval-result class)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1006",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [48]},
 :full-name "cljs.repl.rhino/eval-result",
 :full-name-encode "cljs.repl.rhino/eval-result",
 :extra-sources ({:code "(defmethod eval-result :default [r]\n  (.toString r))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1006",
                  :filename "src/clj/cljs/repl/rhino.clj",
                  :lines [50 51]}
                 {:code "(defmethod eval-result nil [_] \"\")",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1006",
                  :filename "src/clj/cljs/repl/rhino.clj",
                  :lines [53]}
                 {:code "(defmethod eval-result org.mozilla.javascript.Undefined [_] \"\")",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1006",
                  :filename "src/clj/cljs/repl/rhino.clj",
                  :lines [55]}),
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/eval-result"]))
```

-->
