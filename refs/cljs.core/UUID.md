## cljs.core/UUID



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__UUID.__ uuid __hash)<br>
</samp>

---

A type representing a universally unique identifier ([UUID]).

Use [`uuid`][doc:cljs.core/uuid] or [`uuid-literal`][doc:syntax/uuid-literal] to create one.

[UUID]:https://en.wikipedia.org/wiki/Universally_unique_identifier

[doc:cljs.core/uuid]:../cljs.core/uuid.md
[doc:syntax/uuid-literal]:../syntax/uuid-literal.md

---


###### See Also:

[`#uuid literal`](../syntax/uuid-literal.md)<br>
[`cljs.core/random-uuid`](../cljs.core/random-uuid.md)<br>
[`cljs.core/uuid`](../cljs.core/uuid.md)<br>

---




Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/core.cljs#L9808-L9830):

```clj
(deftype UUID [uuid ^:mutable __hash]
  Object
  (toString [_] uuid)
  (equiv [this other]
    (-equiv this other))

  IEquiv
  (-equiv [_ other]
    (and (instance? UUID other) (identical? uuid (.-uuid other))))

  IPrintWithWriter
  (-pr-writer [_ writer _]
    (-write writer (str "#uuid \"" uuid "\"")))

  IHash
  (-hash [this]
    (when (nil? __hash)
      (set! __hash (goog.string/hashCode uuid)))
    __hash)

  IComparable
  (-compare [_ other]
    (garray/defaultCompare uuid (.-uuid other))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.58
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9808-9830](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/core.cljs#L9808-L9830)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/UUID` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/UUID.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/UUID.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "A type representing a universally unique identifier ([UUID]).\n\nUse [doc:cljs.core/uuid] or [doc:syntax/uuid-literal] to create one.\n\n[UUID]:https://en.wikipedia.org/wiki/Universally_unique_identifier",
 :ns "cljs.core",
 :name "UUID",
 :signature ["[uuid __hash]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :related ["syntax/uuid-literal"
           "cljs.core/random-uuid"
           "cljs.core/uuid"],
 :full-name-encode "cljs.core/UUID",
 :source {:code "(deftype UUID [uuid ^:mutable __hash]\n  Object\n  (toString [_] uuid)\n  (equiv [this other]\n    (-equiv this other))\n\n  IEquiv\n  (-equiv [_ other]\n    (and (instance? UUID other) (identical? uuid (.-uuid other))))\n\n  IPrintWithWriter\n  (-pr-writer [_ writer _]\n    (-write writer (str \"#uuid \\\"\" uuid \"\\\"\")))\n\n  IHash\n  (-hash [this]\n    (when (nil? __hash)\n      (set! __hash (goog.string/hashCode uuid)))\n    __hash)\n\n  IComparable\n  (-compare [_ other]\n    (garray/defaultCompare uuid (.-uuid other))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.58",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9808 9830]},
 :full-name "cljs.core/UUID"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/UUID"]))
```

-->
