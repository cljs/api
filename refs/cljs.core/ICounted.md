## cljs.core/ICounted



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Counted</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Counted.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L140-L141):

```clj
(defprotocol ICounted
  (-count [coll] "constant time count"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:140-141](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L140-L141)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Counted` @ clojuredocs](http://clojuredocs.org/clojure.lang/Counted)<br>
[`clojure.lang/Counted` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Counted/)<br>
[`clojure.lang/Counted` @ crossclj](http://crossclj.info/fun/clojure.lang/Counted.html)<br>
[`cljs.core/ICounted` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ICounted.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ICounted.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ICounted",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/ICounted",
 :source {:code "(defprotocol ICounted\n  (-count [coll] \"constant time count\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [140 141]},
 :methods [{:name "-count",
            :signature ["[coll]"],
            :docstring "constant time count"}],
 :full-name "cljs.core/ICounted",
 :clj-symbol "clojure.lang/Counted"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ICounted"]))
```

-->
