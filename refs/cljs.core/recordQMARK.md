## cljs.core/record?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/record?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/record?)
</td>
</tr>
</table>

<samp>(record? x)</samp><br>

---

 <samp>
(__record?__ x)<br>
</samp>

---





Source docstring:

```
Return true if x satisfies IRecord
```


Source code @ [github]():

```clj
(defn ^boolean record?
  [x]
  (satisfies? IRecord x))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/record?` @ clojuredocs](http://clojuredocs.org/clojure.core/record_q)<br>
[`clojure.core/record?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/record%3F/)<br>
[`clojure.core/record?` @ crossclj](http://crossclj.info/fun/clojure.core/record%3F.html)<br>
[`cljs.core/record?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/record%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/recordQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "record?",
 :signature ["[x]"],
 :name-encode "recordQMARK",
 :history [["+" "0.0-3255"]],
 :type "function",
 :clj-equiv {:full-name "clojure.core/record?",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/record?"},
 :full-name-encode "cljs.core/recordQMARK",
 :source {:code "(defn ^boolean record?\n  [x]\n  (satisfies? IRecord x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1997 2000],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/core.cljs#L1997-L2000"},
 :usage ["(record? x)"],
 :full-name "cljs.core/record?",
 :docstring "Return true if x satisfies IRecord",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/recordQMARK.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/record?"]))
```

-->
