## cljs.core/Symbol



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Symbol</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Symbol.java)
</td>
</tr>
</table>


 <samp>
(__Symbol.__ ns name str _hash _meta)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/core.cljs#L382-L406):

```clj
(deftype Symbol [ns name str ^:mutable _hash _meta]
  Object
  (toString [_] str)
  IEquiv
  (-equiv [_ other]
    (if (instance? Symbol other)
      (identical? str (.-str other))
      false))
  IFn
  (-invoke [sym coll]
    (-lookup coll sym nil))
  (-invoke [sym coll not-found]
    (-lookup coll sym not-found))
  IMeta
  (-meta [_] _meta)
  IWithMeta
  (-with-meta [_ new-meta] (Symbol. ns name str _hash new-meta))
  IHash
  (-hash [sym]
    (caching-hash sym hash-symbol _hash))
  INamed
  (-name [_] name)
  (-namespace [_] ns)
  IPrintWithWriter
  (-pr-writer [o writer _] (-write writer str)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1889
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:382-406](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/core.cljs#L382-L406)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Symbol` @ clojuredocs](http://clojuredocs.org/clojure.lang/Symbol)<br>
[`clojure.lang/Symbol` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Symbol/)<br>
[`clojure.lang/Symbol` @ crossclj](http://crossclj.info/fun/clojure.lang/Symbol.html)<br>
[`cljs.core/Symbol` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Symbol.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Symbol.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Symbol",
 :signature ["[ns name str _hash _meta]"],
 :history [["+" "0.0-1798"]],
 :type "type",
 :full-name-encode "cljs.core/Symbol",
 :source {:code "(deftype Symbol [ns name str ^:mutable _hash _meta]\n  Object\n  (toString [_] str)\n  IEquiv\n  (-equiv [_ other]\n    (if (instance? Symbol other)\n      (identical? str (.-str other))\n      false))\n  IFn\n  (-invoke [sym coll]\n    (-lookup coll sym nil))\n  (-invoke [sym coll not-found]\n    (-lookup coll sym not-found))\n  IMeta\n  (-meta [_] _meta)\n  IWithMeta\n  (-with-meta [_ new-meta] (Symbol. ns name str _hash new-meta))\n  IHash\n  (-hash [sym]\n    (caching-hash sym hash-symbol _hash))\n  INamed\n  (-name [_] name)\n  (-namespace [_] ns)\n  IPrintWithWriter\n  (-pr-writer [o writer _] (-write writer str)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/cljs/cljs/core.cljs",
          :lines [382 406]},
 :full-name "cljs.core/Symbol",
 :clj-symbol "clojure.lang/Symbol"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Symbol"]))
```

-->
