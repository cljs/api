## cljs.core/array?



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__array?__ x)<br>
</samp>

---

Returns true if `x` is a JavaScript array, false otherwise.



---

###### Examples:

```clj
(array? #js [1 2 3])
;;=> true

(array? [1 2 3])
;;=> false

(array? "hi")
;;=> false
```



---

###### See Also:

[`cljs.core/object?`](../cljs.core/objectQMARK.md)<br>

---




Function code @ [github](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L88-L89):

```clj
(defn ^boolean array? [x]
  (cljs.core/array? x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:88-89](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L88-L89)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2511/src/clj/cljs/core.clj#L301-L304):

```clj
(defmacro array? [x]
  (if (= :nodejs (:target @env/*compiler*))
    (bool-expr `(.isArray js/Array ~x))
    (bool-expr (core/list 'js* "~{} instanceof Array" x))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2511
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:301-304](https://github.com/clojure/clojurescript/blob/r2511/src/clj/cljs/core.clj#L301-L304)</ins>
</pre>
-->

---


###### External doc links:

[`cljs.core/array?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/array%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/arrayQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` is a JavaScript array, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "array?",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :related ["cljs.core/object?"],
 :full-name-encode "cljs.core/arrayQMARK",
 :source {:code "(defn ^boolean array? [x]\n  (cljs.core/array? x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/core.cljs",
          :lines [88 89]},
 :extra-sources [{:code "(defmacro array? [x]\n  (if (= :nodejs (:target @env/*compiler*))\n    (bool-expr `(.isArray js/Array ~x))\n    (bool-expr (core/list 'js* \"~{} instanceof Array\" x))))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2511",
                  :filename "src/clj/cljs/core.clj",
                  :lines [301 304]}],
 :examples [{:id "39913c",
             :content "```clj\n(array? #js [1 2 3])\n;;=> true\n\n(array? [1 2 3])\n;;=> false\n\n(array? \"hi\")\n;;=> false\n```"}],
 :full-name "cljs.core/array?"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array?"]))
```

-->
