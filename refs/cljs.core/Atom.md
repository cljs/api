## cljs.core/Atom



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Atom</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Atom.java)
</td>
</tr>
</table>


 <samp>
(__Atom.__ state meta validator watches)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2913/src/cljs/cljs/core.cljs#L3491-L3518):

```clj
(deftype Atom [state meta validator watches]
  Object
  (equiv [this other]
    (-equiv this other))

  IAtom
  
  IEquiv
  (-equiv [o other] (identical? o other))

  IDeref
  (-deref [_] state)

  IMeta
  (-meta [_] meta)

  IWatchable
  (-notify-watches [this oldval newval]
    (doseq [[key f] watches]
      (f key this oldval newval)))
  (-add-watch [this key f]
    (set! (.-watches this) (assoc watches key f))
    this)
  (-remove-watch [this key]
    (set! (.-watches this) (dissoc watches key)))

  IHash
  (-hash [this] (goog/getUid this)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3491-3518](https://github.com/clojure/clojurescript/blob/r2913/src/cljs/cljs/core.cljs#L3491-L3518)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Atom` @ clojuredocs](http://clojuredocs.org/clojure.lang/Atom)<br>
[`clojure.lang/Atom` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Atom/)<br>
[`clojure.lang/Atom` @ crossclj](http://crossclj.info/fun/clojure.lang/Atom.html)<br>
[`cljs.core/Atom` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Atom.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Atom.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Atom",
 :signature ["[state meta validator watches]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core/Atom",
 :source {:code "(deftype Atom [state meta validator watches]\n  Object\n  (equiv [this other]\n    (-equiv this other))\n\n  IAtom\n  \n  IEquiv\n  (-equiv [o other] (identical? o other))\n\n  IDeref\n  (-deref [_] state)\n\n  IMeta\n  (-meta [_] meta)\n\n  IWatchable\n  (-notify-watches [this oldval newval]\n    (doseq [[key f] watches]\n      (f key this oldval newval)))\n  (-add-watch [this key f]\n    (set! (.-watches this) (assoc watches key f))\n    this)\n  (-remove-watch [this key]\n    (set! (.-watches this) (dissoc watches key)))\n\n  IHash\n  (-hash [this] (goog/getUid this)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3491 3518]},
 :full-name "cljs.core/Atom",
 :clj-symbol "clojure.lang/Atom"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Atom"]))
```

-->
