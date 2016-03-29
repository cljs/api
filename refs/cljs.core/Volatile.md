## cljs.core/Volatile



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Volatile</samp>](https://github.com/clojure/clojure/blob/clojure-1.8.0/src/jvm/clojure/lang/Volatile.java)
</td>
</tr>
</table>

<samp>(Volatile. state)</samp><br>

---

 <samp>
(__Volatile.__ state)<br>
</samp>

---



###### See Also:

[`cljs.core/volatile!`](../cljs.core/volatileBANG.md)<br>
[`cljs.core/volatile?`](../cljs.core/volatileQMARK.md)<br>

---




Source code @ [github]():

```clj
(deftype Volatile [^:mutable state]
  IVolatile
  (-vreset! [_ new-state]
    (set! state new-state))

  IDeref
  (-deref [_] state))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.lang/Volatile` @ clojuredocs](http://clojuredocs.org/clojure.lang/Volatile)<br>
[`clojure.lang/Volatile` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Volatile/)<br>
[`clojure.lang/Volatile` @ crossclj](http://crossclj.info/fun/clojure.lang/Volatile.html)<br>
[`cljs.core/Volatile` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Volatile.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Volatile.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Volatile",
 :signature ["[state]"],
 :name-encode "Volatile",
 :history [["+" "0.0-2496"]],
 :type "type",
 :clj-equiv {:full-name "clojure.lang/Volatile",
             :url "https://github.com/clojure/clojure/blob/clojure-1.8.0/src/jvm/clojure/lang/Volatile.java"},
 :related ["cljs.core/volatile!" "cljs.core/volatile?"],
 :full-name-encode "cljs.core/Volatile",
 :source {:code "(deftype Volatile [^:mutable state]\n  IVolatile\n  (-vreset! [_ new-state]\n    (set! state new-state))\n\n  IDeref\n  (-deref [_] state))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4184 4190],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/core.cljs#L4184-L4190"},
 :usage ["(Volatile. state)"],
 :full-name "cljs.core/Volatile",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Volatile.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Volatile"]))
```

-->
