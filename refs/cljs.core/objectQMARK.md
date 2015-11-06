## cljs.core/object?



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2120"><img valign="middle" alt="[+] 0.0-2120" title="Added in 0.0-2120" src="https://img.shields.io/badge/+-0.0--2120-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__object?__ x)<br>
</samp>

---

Returns true if `x` is a JavaScript object, false otherwise.



---


###### See Also:

[`cljs.core/array?`](../cljs.core/arrayQMARK.md)<br>

---




Function code @ [github](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/cljs/core.cljs#L91-L92):

```clj
(defn ^boolean object? [x]
  (cljs.core/object? x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2120
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:91-92](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/cljs/core.cljs#L91-L92)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2120/src/clj/cljs/core.clj#L282-L283):

```clj
(defmacro object? [x]
  (bool-expr (core/list 'js* "~{}.constructor === Object" x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2120
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:282-283](https://github.com/clojure/clojurescript/blob/r2120/src/clj/cljs/core.clj#L282-L283)</ins>
</pre>
-->

---


###### External doc links:

[`cljs.core/object?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/object%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/objectQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` is a JavaScript object, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "object?",
 :signature ["[x]"],
 :history [["+" "0.0-2120"]],
 :type "function/macro",
 :related ["cljs.core/array?"],
 :full-name-encode "cljs.core/objectQMARK",
 :source {:code "(defn ^boolean object? [x]\n  (cljs.core/object? x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2120",
          :filename "src/cljs/cljs/core.cljs",
          :lines [91 92]},
 :extra-sources [{:code "(defmacro object? [x]\n  (bool-expr (core/list 'js* \"~{}.constructor === Object\" x)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2120",
                  :filename "src/clj/cljs/core.clj",
                  :lines [282 283]}],
 :full-name "cljs.core/object?"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/object?"]))
```

-->
