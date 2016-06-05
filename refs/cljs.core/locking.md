## cljs.core/locking



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/locking</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/locking)
</td>
</tr>
</table>

<samp>(locking x & forms)</samp><br>

---

 <samp>
(__locking__ x & forms)<br>
</samp>

---







Source code @ [github]():

```clj
(core/defmacro locking
  [x & forms]
  `(do ~@forms))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/locking` @ clojuredocs](http://clojuredocs.org/clojure.core/locking)<br>
[`clojure.core/locking` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/locking/)<br>
[`clojure.core/locking` @ crossclj](http://crossclj.info/fun/clojure.core/locking.html)<br>
[`cljs.core/locking` @ crossclj](http://crossclj.info/fun/cljs.core/locking.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/locking.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "locking",
 :signature ["[x & forms]"],
 :name-encode "locking",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.core/locking",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/locking"},
 :full-name-encode "cljs.core/locking",
 :source {:code "(core/defmacro locking\n  [x & forms]\n  `(do ~@forms))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [2699 2701],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/clojure/cljs/core.cljc#L2699-L2701"},
 :usage ["(locking x & forms)"],
 :full-name "cljs.core/locking",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/locking.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/locking"]))
```

-->
