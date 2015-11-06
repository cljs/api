## cljs.core/TaggedLiteral



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/TaggedLiteral</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/TaggedLiteral.java)
</td>
</tr>
</table>


 <samp>
(__TaggedLiteral.__ tag form)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L9623-L9645):

```clj
(deftype TaggedLiteral [tag form]

  IEquiv
  (-equiv [this other]
    (and (instance? TaggedLiteral other)
         (= tag (.-tag other))
         (= form (.-form other))))

  IHash
  (-hash [this]
    (+ (* 31 (hash tag))
       (hash form)))

  ILookup
  (-lookup [this v]
    (-lookup this v nil))
  (-lookup [this v not-found]
    (case v
      :tag tag
      :form form
      not-found))

  )
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9623-9645](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L9623-L9645)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/TaggedLiteral` @ clojuredocs](http://clojuredocs.org/clojure.lang/TaggedLiteral)<br>
[`clojure.lang/TaggedLiteral` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/TaggedLiteral/)<br>
[`clojure.lang/TaggedLiteral` @ crossclj](http://crossclj.info/fun/clojure.lang/TaggedLiteral.html)<br>
[`cljs.core/TaggedLiteral` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/TaggedLiteral.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/TaggedLiteral.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "TaggedLiteral",
 :signature ["[tag form]"],
 :history [["+" "0.0-3255"]],
 :type "type",
 :full-name-encode "cljs.core/TaggedLiteral",
 :source {:code "(deftype TaggedLiteral [tag form]\n\n  IEquiv\n  (-equiv [this other]\n    (and (instance? TaggedLiteral other)\n         (= tag (.-tag other))\n         (= form (.-form other))))\n\n  IHash\n  (-hash [this]\n    (+ (* 31 (hash tag))\n       (hash form)))\n\n  ILookup\n  (-lookup [this v]\n    (-lookup this v nil))\n  (-lookup [this v not-found]\n    (case v\n      :tag tag\n      :form form\n      not-found))\n\n  )",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9623 9645]},
 :full-name "cljs.core/TaggedLiteral",
 :clj-symbol "clojure.lang/TaggedLiteral"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/TaggedLiteral"]))
```

-->
