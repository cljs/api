## cljs.core/Reduced



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Reduced</samp>](https://github.com/clojure/clojure/blob/clojure-1.8.0/src/jvm/clojure/lang/Reduced.java)
</td>
</tr>
</table>

<samp>(Reduced. val)</samp><br>

---

 <samp>
(__Reduced.__ val)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype Reduced [val]
  IDeref
  (-deref [o] val))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.lang/Reduced` @ clojuredocs](http://clojuredocs.org/clojure.lang/Reduced)<br>
[`clojure.lang/Reduced` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Reduced/)<br>
[`clojure.lang/Reduced` @ crossclj](http://crossclj.info/fun/clojure.lang/Reduced.html)<br>
[`cljs.core/Reduced` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Reduced.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Reduced.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Reduced",
 :signature ["[val]"],
 :name-encode "Reduced",
 :history [["+" "0.0-1211"]],
 :type "type",
 :clj-equiv {:full-name "clojure.lang/Reduced",
             :url "https://github.com/clojure/clojure/blob/clojure-1.8.0/src/jvm/clojure/lang/Reduced.java"},
 :full-name-encode "cljs.core/Reduced",
 :source {:code "(deftype Reduced [val]\n  IDeref\n  (-deref [o] val))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1283 1285],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/core.cljs#L1283-L1285"},
 :usage ["(Reduced. val)"],
 :full-name "cljs.core/Reduced",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Reduced.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Reduced"]))
```

-->
