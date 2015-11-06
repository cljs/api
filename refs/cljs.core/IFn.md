## cljs.core/IFn



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-971"><img valign="middle" alt="[+] 0.0-971" title="Added in 0.0-971" src="https://img.shields.io/badge/+-0.0--971-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IFn</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IFn.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L202-L224):

```clj
(defprotocol IFn
  (-invoke
    [this]
    [this a]
    [this a b]
    [this a b c]
    [this a b c d]
    [this a b c d e]
    [this a b c d e f]
    [this a b c d e f g]
    [this a b c d e f g h]
    [this a b c d e f g h i]
    [this a b c d e f g h i j]
    [this a b c d e f g h i j k]
    [this a b c d e f g h i j k l]
    [this a b c d e f g h i j k l m]
    [this a b c d e f g h i j k l m n]
    [this a b c d e f g h i j k l m n o]
    [this a b c d e f g h i j k l m n o p]
    [this a b c d e f g h i j k l m n o p q]
    [this a b c d e f g h i j k l m n o p q s]
    [this a b c d e f g h i j k l m n o p q s t]
    [this a b c d e f g h i j k l m n o p q s t rest]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:202-224](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L202-L224)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/IFn` @ clojuredocs](http://clojuredocs.org/clojure.lang/IFn)<br>
[`clojure.lang/IFn` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/IFn/)<br>
[`clojure.lang/IFn` @ crossclj](http://crossclj.info/fun/clojure.lang/IFn.html)<br>
[`cljs.core/IFn` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IFn.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IFn.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IFn",
 :history [["+" "0.0-971"]],
 :type "protocol",
 :full-name-encode "cljs.core/IFn",
 :source {:code "(defprotocol IFn\n  (-invoke\n    [this]\n    [this a]\n    [this a b]\n    [this a b c]\n    [this a b c d]\n    [this a b c d e]\n    [this a b c d e f]\n    [this a b c d e f g]\n    [this a b c d e f g h]\n    [this a b c d e f g h i]\n    [this a b c d e f g h i j]\n    [this a b c d e f g h i j k]\n    [this a b c d e f g h i j k l]\n    [this a b c d e f g h i j k l m]\n    [this a b c d e f g h i j k l m n]\n    [this a b c d e f g h i j k l m n o]\n    [this a b c d e f g h i j k l m n o p]\n    [this a b c d e f g h i j k l m n o p q]\n    [this a b c d e f g h i j k l m n o p q s]\n    [this a b c d e f g h i j k l m n o p q s t]\n    [this a b c d e f g h i j k l m n o p q s t rest]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/core.cljs",
          :lines [202 224]},
 :methods [{:name "-invoke",
            :signature ["[this]"
                        "[this a]"
                        "[this a b]"
                        "[this a b c]"
                        "[this a b c d]"
                        "[this a b c d e]"
                        "[this a b c d e f]"
                        "[this a b c d e f g]"
                        "[this a b c d e f g h]"
                        "[this a b c d e f g h i]"
                        "[this a b c d e f g h i j]"
                        "[this a b c d e f g h i j k]"
                        "[this a b c d e f g h i j k l]"
                        "[this a b c d e f g h i j k l m]"
                        "[this a b c d e f g h i j k l m n]"
                        "[this a b c d e f g h i j k l m n o]"
                        "[this a b c d e f g h i j k l m n o p]"
                        "[this a b c d e f g h i j k l m n o p q]"
                        "[this a b c d e f g h i j k l m n o p q s]"
                        "[this a b c d e f g h i j k l m n o p q s t]"
                        "[this a b c d e f g h i j k l m n o p q s t rest]"],
            :docstring nil}],
 :full-name "cljs.core/IFn",
 :clj-symbol "clojure.lang/IFn"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IFn"]))
```

-->
