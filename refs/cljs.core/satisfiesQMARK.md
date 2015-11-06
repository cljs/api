## cljs.core/satisfies?



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/satisfies?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/satisfies?)
</td>
</tr>
</table>


 <samp>
(__satisfies?__ psym x)<br>
</samp>
 <samp>
(__satisfies?__ psym x check-native)<br>
</samp>

---





Source docstring:

```
Returns true if x satisfies the protocol
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1835/src/clj/cljs/core.clj#L836-L860):

```clj
(defmacro satisfies?
  ([psym x] `(satisfies? ~psym ~x true))
  ([psym x check-native]
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
           (if (or ~(if bit `(unsafe-bit-and (. ~xsym ~msym) ~bit))
                 ~(bool-expr `(. ~xsym ~(symbol (core/str "-" prefix)))))
             true
             ~(if check-native
                `(if (coercive-not (. ~xsym ~msym))
                   (cljs.core/type_satisfies_ ~psym ~xsym)
                   false)
                false))
           ~(if check-native
              `(cljs.core/type_satisfies_ ~psym ~xsym)
              false))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1835
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:836-860](https://github.com/clojure/clojurescript/blob/r1835/src/clj/cljs/core.clj#L836-L860)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/satisfies?` @ clojuredocs](http://clojuredocs.org/clojure.core/satisfies_q)<br>
[`clojure.core/satisfies?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/satisfies%3F/)<br>
[`clojure.core/satisfies?` @ crossclj](http://crossclj.info/fun/clojure.core/satisfies%3F.html)<br>
[`cljs.core/satisfies?` @ crossclj](http://crossclj.info/fun/cljs.core/satisfies%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/satisfiesQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "satisfies?",
 :signature ["[psym x]" "[psym x check-native]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core/satisfiesQMARK",
 :source {:code "(defmacro satisfies?\n  ([psym x] `(satisfies? ~psym ~x true))\n  ([psym x check-native]\n    (let [p          (:name\n                       (cljs.analyzer/resolve-var\n                         (dissoc &env :locals) psym))\n          prefix     (protocol-prefix p)\n          xsym       (bool-expr (gensym))\n          [part bit] (fast-path-protocols p)\n          msym       (symbol\n                       (core/str \"-cljs$lang$protocol_mask$partition\" part \"$\"))]\n      `(let [~xsym ~x]\n         (if ~xsym\n           (if (or ~(if bit `(unsafe-bit-and (. ~xsym ~msym) ~bit))\n                 ~(bool-expr `(. ~xsym ~(symbol (core/str \"-\" prefix)))))\n             true\n             ~(if check-native\n                `(if (coercive-not (. ~xsym ~msym))\n                   (cljs.core/type_satisfies_ ~psym ~xsym)\n                   false)\n                false))\n           ~(if check-native\n              `(cljs.core/type_satisfies_ ~psym ~xsym)\n              false))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1835",
          :filename "src/clj/cljs/core.clj",
          :lines [836 860]},
 :full-name "cljs.core/satisfies?",
 :clj-symbol "clojure.core/satisfies?",
 :docstring "Returns true if x satisfies the protocol"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/satisfies?"]))
```

-->
