## cljs.test/testing



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/testing</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/testing)
</td>
</tr>
</table>


 <samp>
(__testing__ string & body)<br>
</samp>

---





Source docstring:

```
Adds a new string to the list of testing contexts.  May be nested,
but must occur inside a test function (deftest).
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/test.clj#L191-L199):

```clj
(defmacro testing
  ([string & body]
   `(do
      (cljs.test/update-current-env! [:testing-contexts] conj ~string)
      (let [ret# (do ~@body)]
        (cljs.test/update-current-env! [:testing-contexts] rest)
        ret#))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.clj:191-199](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/test.clj#L191-L199)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.test/testing` @ clojuredocs](http://clojuredocs.org/clojure.test/testing)<br>
[`clojure.test/testing` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/testing/)<br>
[`clojure.test/testing` @ crossclj](http://crossclj.info/fun/clojure.test/testing.html)<br>
[`cljs.test/testing` @ crossclj](http://crossclj.info/fun/cljs.test/testing.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/testing.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "testing",
 :signature ["[string & body]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.test/testing",
 :source {:code "(defmacro testing\n  ([string & body]\n   `(do\n      (cljs.test/update-current-env! [:testing-contexts] conj ~string)\n      (let [ret# (do ~@body)]\n        (cljs.test/update-current-env! [:testing-contexts] rest)\n        ret#))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/test.clj",
          :lines [191 199]},
 :full-name "cljs.test/testing",
 :clj-symbol "clojure.test/testing",
 :docstring "Adds a new string to the list of testing contexts.  May be nested,\nbut must occur inside a test function (deftest)."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/testing"]))
```

-->
