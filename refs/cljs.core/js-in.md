## cljs.core/js-in



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2411"><img valign="middle" alt="[+] 0.0-2411" title="Added in 0.0-2411" src="https://img.shields.io/badge/+-0.0--2411-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__js-in__ key obj)<br>
</samp>

---

Determines if property `key` is in JavaScript object `obj`.

Equivalent to `key in obj` in JavaScript.



---

###### Examples:

```clj
(def a #js {:foo 1 :bar 2})

(js-in "foo" a)
;;=> true

(js-in "hello" a)
;;=> false
```

Properties inherited from prototype chain are also detected:

```clj
(js-in "toString" a)
;;=> true
```



---

###### See Also:

[`cljs.core/contains?`](../cljs.core/containsQMARK.md)<br>

---




Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/clojure/cljs/core.cljc#L863-L864):

```clj
(core/defmacro js-in [key obj]
  (core/list 'js* "~{} in ~{}" key obj))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.170
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.cljc:863-864](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/clojure/cljs/core.cljc#L863-L864)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/js-in` @ crossclj](http://crossclj.info/fun/cljs.core/js-in.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/js-in.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Determines if property `key` is in JavaScript object `obj`.\n\nEquivalent to `key in obj` in JavaScript.",
 :ns "cljs.core",
 :name "js-in",
 :signature ["[key obj]"],
 :history [["+" "0.0-2411"]],
 :type "macro",
 :related ["cljs.core/contains?"],
 :full-name-encode "cljs.core/js-in",
 :source {:code "(core/defmacro js-in [key obj]\n  (core/list 'js* \"~{} in ~{}\" key obj))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.170",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [863 864]},
 :examples [{:id "a45b18",
             :content "```clj\n(def a #js {:foo 1 :bar 2})\n\n(js-in \"foo\" a)\n;;=> true\n\n(js-in \"hello\" a)\n;;=> false\n```\n\nProperties inherited from prototype chain are also detected:\n\n```clj\n(js-in \"toString\" a)\n;;=> true\n```"}],
 :full-name "cljs.core/js-in"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-in"]))
```

-->
