## cljs.core/divide



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__divide__ x)<br>
</samp>
 <samp>
(__divide__ x y)<br>
</samp>
 <samp>
(__divide__ x y & more)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2644/src/clj/cljs/core.clj#L429-L432):

```clj
(defmacro ^::ana/numeric divide
  ([x] `(/ 1 ~x))
  ([x y] (core/list 'js* "(~{} / ~{})" x y))
  ([x y & more] `(/ (/ ~x ~y) ~@more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2644
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:429-432](https://github.com/clojure/clojurescript/blob/r2644/src/clj/cljs/core.clj#L429-L432)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/divide` @ crossclj](http://crossclj.info/fun/cljs.core/divide.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/divide.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "divide",
 :type "macro",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :source {:code "(defmacro ^::ana/numeric divide\n  ([x] `(/ 1 ~x))\n  ([x y] (core/list 'js* \"(~{} / ~{})\" x y))\n  ([x y & more] `(/ (/ ~x ~y) ~@more)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/clj/cljs/core.clj",
          :lines [429 432]},
 :full-name "cljs.core/divide",
 :full-name-encode "cljs.core/divide",
 :history [["+" "0.0-1798"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/divide"]))
```

-->
