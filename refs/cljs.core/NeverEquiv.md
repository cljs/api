## cljs.core/NeverEquiv



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__NeverEquiv.__)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L4981-L4986):

```clj
(deftype NeverEquiv []
  Object
  (equiv [this other]
    (-equiv this other))
  IEquiv
  (-equiv [o other] false))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4981-4986](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L4981-L4986)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/NeverEquiv` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/NeverEquiv.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/NeverEquiv.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "NeverEquiv",
 :type "type",
 :signature ["[]"],
 :source {:code "(deftype NeverEquiv []\n  Object\n  (equiv [this other]\n    (-equiv this other))\n  IEquiv\n  (-equiv [o other] false))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4981 4986]},
 :full-name "cljs.core/NeverEquiv",
 :full-name-encode "cljs.core/NeverEquiv",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/NeverEquiv"]))
```

-->
