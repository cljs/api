## cljs.core/ISeqable



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Seqable</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Seqable.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L336-L337):

```clj
(defprotocol ISeqable
  (^clj-or-nil -seq [o]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2814
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:336-337](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L336-L337)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Seqable` @ clojuredocs](http://clojuredocs.org/clojure.lang/Seqable)<br>
[`clojure.lang/Seqable` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Seqable/)<br>
[`clojure.lang/Seqable` @ crossclj](http://crossclj.info/fun/clojure.lang/Seqable.html)<br>
[`cljs.core/ISeqable` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ISeqable.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ISeqable.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ISeqable",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/ISeqable",
 :source {:code "(defprotocol ISeqable\n  (^clj-or-nil -seq [o]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/cljs/cljs/core.cljs",
          :lines [336 337]},
 :methods [{:name "-seq", :signature ["[o]"], :docstring nil}],
 :full-name "cljs.core/ISeqable",
 :clj-symbol "clojure.lang/Seqable"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISeqable"]))
```

-->
