## cljs.core/IAtom



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2173"><img valign="middle" alt="[+] 0.0-2173" title="Added in 0.0-2173" src="https://img.shields.io/badge/+-0.0--2173-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IAtom</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IAtom.java)
</td>
</tr>
</table>







Source docstring:

```
Marker protocol indicating an atom.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/core.cljs#L708-L709):

```clj
(defprotocol IAtom
  "Marker protocol indicating an atom.")
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:708-709](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/core.cljs#L708-L709)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/IAtom` @ clojuredocs](http://clojuredocs.org/clojure.lang/IAtom)<br>
[`clojure.lang/IAtom` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/IAtom/)<br>
[`clojure.lang/IAtom` @ crossclj](http://crossclj.info/fun/clojure.lang/IAtom.html)<br>
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
 :history [["+" "0.0-2173"]],
 :type "protocol",
 :full-name-encode "cljs.core/IAtom",
 :source {:code "(defprotocol IAtom\n  \"Marker protocol indicating an atom.\")",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [708 709]},
 :full-name "cljs.core/IAtom",
 :clj-symbol "clojure.lang/IAtom",
 :docstring "Marker protocol indicating an atom."}

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
