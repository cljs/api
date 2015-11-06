## cljs.core/js-str



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2341"><img valign="middle" alt="[+] 0.0-2341" title="Added in 0.0-2341" src="https://img.shields.io/badge/+-0.0--2341-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__js-str__ s)<br>
</samp>

---

Convert `s` to string using JavaScript's coercion behavior.

Equivalent to `''+s` in JavaScript.



---

###### Examples:

```clj
(js-str 23)
;;=> "23"

(js-str #js {:foo 1})
;;=> "[Object object]"
```



---

###### See Also:

[`cljs.core/str`](../cljs.core/str.md)<br>

---




Source code @ [github](https://github.com/clojure/clojurescript/blob/r2629/src/clj/cljs/core.clj#L1666-L1667):

```clj
(defmacro js-str [s]
  (core/list 'js* "''+~{}" s))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2629
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1666-1667](https://github.com/clojure/clojurescript/blob/r2629/src/clj/cljs/core.clj#L1666-L1667)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/js-str` @ crossclj](http://crossclj.info/fun/cljs.core/js-str.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/js-str.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Convert `s` to string using JavaScript's coercion behavior.\n\nEquivalent to `''+s` in JavaScript.",
 :ns "cljs.core",
 :name "js-str",
 :signature ["[s]"],
 :history [["+" "0.0-2341"]],
 :type "macro",
 :related ["cljs.core/str"],
 :full-name-encode "cljs.core/js-str",
 :source {:code "(defmacro js-str [s]\n  (core/list 'js* \"''+~{}\" s))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/clj/cljs/core.clj",
          :lines [1666 1667]},
 :examples [{:id "e92009",
             :content "```clj\n(js-str 23)\n;;=> \"23\"\n\n(js-str #js {:foo 1})\n;;=> \"[Object object]\"\n```"}],
 :full-name "cljs.core/js-str"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-str"]))
```

-->
