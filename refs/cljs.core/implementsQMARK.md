## cljs.core/implements?



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2014"><img valign="middle" alt="[+] 0.0-2014" title="Added in 0.0-2014" src="https://img.shields.io/badge/+-0.0--2014-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__implements?__ psym x)<br>
</samp>

---





Source docstring:

```
EXPERIMENTAL
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2024/src/clj/cljs/core.clj#L964-L982):

```clj
(defmacro implements?
  [psym x]
  (let [p          (:name
                    (cljs.analyzer/resolve-var
                      (dissoc &env :locals) psym))
        prefix     (protocol-prefix p)
        xsym       (bool-expr (gensym))
        [part bit] (fast-path-protocols p)
        msym       (symbol
                      (core/str "-cljs$lang$protocol_mask$partition" part "$"))]
    `(let [~xsym ~x]
       (if ~xsym
         (let [bit# ~(if bit `(unsafe-bit-and (. ~xsym ~msym) ~bit))]
           (if (or bit#
                 ~(bool-expr `(. ~xsym ~(symbol (core/str "-" prefix)))))
             true
             false))
         false))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2024
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:964-982](https://github.com/clojure/clojurescript/blob/r2024/src/clj/cljs/core.clj#L964-L982)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/implements?` @ crossclj](http://crossclj.info/fun/cljs.core/implements%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/implementsQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "implements?",
 :signature ["[psym x]"],
 :history [["+" "0.0-2014"]],
 :type "macro",
 :full-name-encode "cljs.core/implementsQMARK",
 :source {:code "(defmacro implements?\n  [psym x]\n  (let [p          (:name\n                    (cljs.analyzer/resolve-var\n                      (dissoc &env :locals) psym))\n        prefix     (protocol-prefix p)\n        xsym       (bool-expr (gensym))\n        [part bit] (fast-path-protocols p)\n        msym       (symbol\n                      (core/str \"-cljs$lang$protocol_mask$partition\" part \"$\"))]\n    `(let [~xsym ~x]\n       (if ~xsym\n         (let [bit# ~(if bit `(unsafe-bit-and (. ~xsym ~msym) ~bit))]\n           (if (or bit#\n                 ~(bool-expr `(. ~xsym ~(symbol (core/str \"-\" prefix)))))\n             true\n             false))\n         false))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2024",
          :filename "src/clj/cljs/core.clj",
          :lines [964 982]},
 :full-name "cljs.core/implements?",
 :docstring "EXPERIMENTAL"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/implements?"]))
```

-->
