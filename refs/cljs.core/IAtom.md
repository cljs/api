## cljs.core/IAtom



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2173"><img valign="middle" alt="[+] 0.0-2173" title="Added in 0.0-2173" src="https://img.shields.io/badge/+-0.0--2173-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Marker protocol indicating an atom.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L614-L615):

```clj
(defprotocol IAtom
  "Marker protocol indicating an atom.")
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:614-615](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L614-L615)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IAtom` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IAtom.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IAtom.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IAtom",
 :type "protocol",
 :full-name-encode "cljs.core/IAtom",
 :source {:code "(defprotocol IAtom\n  \"Marker protocol indicating an atom.\")",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/core.cljs",
          :lines [614 615]},
 :full-name "cljs.core/IAtom",
 :docstring "Marker protocol indicating an atom.",
 :history [["+" "0.0-2173"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IAtom"]))
```

-->
