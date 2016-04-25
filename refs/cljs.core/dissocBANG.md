## cljs.core/dissoc!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/dissoc!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dissoc!)
</td>
</tr>
</table>

<samp>(dissoc! tcoll key)</samp><br>
<samp>(dissoc! tcoll key & ks)</samp><br>

---

 <samp>
(__dissoc!__ tcoll key)<br>
</samp>
 <samp>
(__dissoc!__ tcoll key & ks)<br>
</samp>

---





Source docstring:

```
Returns a transient map that doesn't contain a mapping for key(s).
```


Source code @ [github]():

```clj
(defn dissoc!
  ([tcoll key]
    (-dissoc! tcoll key))
  ([tcoll key & ks]
    (let [ntcoll (-dissoc! tcoll key)]
      (if ks
        (recur ntcoll (first ks) (next ks))
        ntcoll))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/dissoc!` @ clojuredocs](http://clojuredocs.org/clojure.core/dissoc!)<br>
[`clojure.core/dissoc!` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/dissoc%21/)<br>
[`clojure.core/dissoc!` @ crossclj](http://crossclj.info/fun/clojure.core/dissoc%21.html)<br>
[`cljs.core/dissoc!` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/dissoc%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/dissocBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "dissoc!",
 :signature ["[tcoll key]" "[tcoll key & ks]"],
 :name-encode "dissocBANG",
 :history [["+" "0.0-1211"]],
 :type "function",
 :clj-equiv {:full-name "clojure.core/dissoc!",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dissoc!"},
 :full-name-encode "cljs.core/dissocBANG",
 :source {:code "(defn dissoc!\n  ([tcoll key]\n    (-dissoc! tcoll key))\n  ([tcoll key & ks]\n    (let [ntcoll (-dissoc! tcoll key)]\n      (if ks\n        (recur ntcoll (first ks) (next ks))\n        ntcoll))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3523 3531],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/core.cljs#L3523-L3531"},
 :usage ["(dissoc! tcoll key)" "(dissoc! tcoll key & ks)"],
 :full-name "cljs.core/dissoc!",
 :docstring "Returns a transient map that doesn't contain a mapping for key(s).",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/dissocBANG.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/dissoc!"]))
```

-->
