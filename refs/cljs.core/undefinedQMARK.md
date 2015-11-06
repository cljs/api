## cljs.core/undefined?



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__undefined?__ x)<br>
</samp>

---





Source docstring:

```
Returns true if x identical to the JavaScript undefined value.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/core.cljs#L1966-L1969):

```clj
(defn ^boolean undefined?
  [x]
  (cljs.core/undefined? x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1966-1969](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/core.cljs#L1966-L1969)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/clojure/cljs/core.cljc#L857-L860):

```clj
(core/defmacro undefined?
  [x]
  (bool-expr (core/list 'js* "(void 0 === ~{})" x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.cljc:857-860](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/clojure/cljs/core.cljc#L857-L860)</ins>
</pre>
-->

---


###### External doc links:

[`cljs.core/undefined?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/undefined%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/undefinedQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "undefined?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :full-name-encode "cljs.core/undefinedQMARK",
 :source {:code "(defn ^boolean undefined?\n  [x]\n  (cljs.core/undefined? x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1966 1969]},
 :extra-sources [{:code "(core/defmacro undefined?\n  [x]\n  (bool-expr (core/list 'js* \"(void 0 === ~{})\" x)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1.7.10",
                  :filename "src/main/clojure/cljs/core.cljc",
                  :lines [857 860]}],
 :full-name "cljs.core/undefined?",
 :docstring "Returns true if x identical to the JavaScript undefined value."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/undefined?"]))
```

-->
