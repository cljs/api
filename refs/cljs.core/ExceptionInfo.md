## cljs.core/ExceptionInfo



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" title="Added in 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ExceptionInfo</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ExceptionInfo.java)
</td>
</tr>
</table>


 <samp>
(__ExceptionInfo.__ message data cause)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L10137-L10153):

```clj
(defn ^{:jsdoc ["@constructor"]}
  ExceptionInfo [message data cause]
  (let [e (js/Error. message)]
    (this-as this
      (set! (.-message this) message)
      (set! (.-data this) data)
      (set! (.-cause this) cause)
      (do
        (set! (.-name this) (.-name e))
        ;; non-standard
        (set! (.-description this) (.-description e))
        (set! (.-number this) (.-number e))
        (set! (.-fileName this) (.-fileName e))
        (set! (.-lineNumber this) (.-lineNumber e))
        (set! (.-columnNumber this) (.-columnNumber e))
        (set! (.-stack this) (.-stack e)))
      this)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:10137-10153](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L10137-L10153)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/ExceptionInfo` @ clojuredocs](http://clojuredocs.org/clojure.lang/ExceptionInfo)<br>
[`clojure.lang/ExceptionInfo` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/ExceptionInfo/)<br>
[`clojure.lang/ExceptionInfo` @ crossclj](http://crossclj.info/fun/clojure.lang/ExceptionInfo.html)<br>
[`cljs.core/ExceptionInfo` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ExceptionInfo.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ExceptionInfo.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ExceptionInfo",
 :signature ["[message data cause]"],
 :history [["+" "0.0-1576"]],
 :type "type",
 :full-name-encode "cljs.core/ExceptionInfo",
 :source {:code "(defn ^{:jsdoc [\"@constructor\"]}\n  ExceptionInfo [message data cause]\n  (let [e (js/Error. message)]\n    (this-as this\n      (set! (.-message this) message)\n      (set! (.-data this) data)\n      (set! (.-cause this) cause)\n      (do\n        (set! (.-name this) (.-name e))\n        ;; non-standard\n        (set! (.-description this) (.-description e))\n        (set! (.-number this) (.-number e))\n        (set! (.-fileName this) (.-fileName e))\n        (set! (.-lineNumber this) (.-lineNumber e))\n        (set! (.-columnNumber this) (.-columnNumber e))\n        (set! (.-stack this) (.-stack e)))\n      this)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [10137 10153]},
 :full-name "cljs.core/ExceptionInfo",
 :clj-symbol "clojure.lang/ExceptionInfo"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ExceptionInfo"]))
```

-->
