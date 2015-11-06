## cljs.core/ILookup



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ILookup</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ILookup.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2411/src/cljs/cljs/core.cljs#L269-L270):

```clj
(defprotocol ILookup
  (-lookup [o k] [o k not-found]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2411
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:269-270](https://github.com/clojure/clojurescript/blob/r2411/src/cljs/cljs/core.cljs#L269-L270)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/ILookup` @ clojuredocs](http://clojuredocs.org/clojure.lang/ILookup)<br>
[`clojure.lang/ILookup` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/ILookup/)<br>
[`clojure.lang/ILookup` @ crossclj](http://crossclj.info/fun/clojure.lang/ILookup.html)<br>
[`cljs.core/ILookup` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ILookup.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ILookup.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ILookup",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/ILookup",
 :source {:code "(defprotocol ILookup\n  (-lookup [o k] [o k not-found]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2411",
          :filename "src/cljs/cljs/core.cljs",
          :lines [269 270]},
 :methods [{:name "-lookup",
            :signature ["[o k]" "[o k not-found]"],
            :docstring nil}],
 :full-name "cljs.core/ILookup",
 :clj-symbol "clojure.lang/ILookup"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ILookup"]))
```

-->
