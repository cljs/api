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







Function code @ [github](https://github.com/clojure/clojurescript/blob/r1909/src/cljs/cljs/core.cljs#L1172-L1173):

```clj
(defn ^boolean undefined? [x]
  (cljs.core/undefined? x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1909
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1172-1173](https://github.com/clojure/clojurescript/blob/r1909/src/cljs/cljs/core.cljs#L1172-L1173)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1909/src/clj/cljs/core.clj#L243-L244):

```clj
(defmacro undefined? [x]
  (bool-expr (list 'js* "(void 0 === ~{})" x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1909
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:243-244](https://github.com/clojure/clojurescript/blob/r1909/src/clj/cljs/core.clj#L243-L244)</ins>
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
 :source {:code "(defn ^boolean undefined? [x]\n  (cljs.core/undefined? x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1909",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1172 1173]},
 :extra-sources [{:code "(defmacro undefined? [x]\n  (bool-expr (list 'js* \"(void 0 === ~{})\" x)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1909",
                  :filename "src/clj/cljs/core.clj",
                  :lines [243 244]}],
 :full-name "cljs.core/undefined?"}

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
