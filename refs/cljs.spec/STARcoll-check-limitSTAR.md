## cljs.spec/\*coll-check-limit\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/\*coll-check-limit\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/*coll-check-limit*)
</td>
</tr>
</table>









Source code @ [github]():

```clj
(def ^:dynamic *coll-check-limit*
  "The number of items validated in a collection spec'ed with 'coll'"
  100)
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/*coll-check-limit*` @ clojuredocs](http://clojuredocs.org/clojure.spec/*coll-check-limit*)<br>
[`clojure.spec/*coll-check-limit*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/*coll-check-limit*/)<br>
[`clojure.spec/*coll-check-limit*` @ crossclj](http://crossclj.info/fun/clojure.spec/*coll-check-limit*.html)<br>
[`cljs.spec/*coll-check-limit*` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/*coll-check-limit*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/STARcoll-check-limitSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "*coll-check-limit*",
 :name-encode "STARcoll-check-limitSTAR",
 :history [["+" "1.9.14"]],
 :type "dynamic var",
 :clj-equiv {:full-name "clojure.spec/*coll-check-limit*",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/*coll-check-limit*"},
 :full-name-encode "cljs.spec/STARcoll-check-limitSTAR",
 :source {:code "(def ^:dynamic *coll-check-limit*\n  \"The number of items validated in a collection spec'ed with 'coll'\"\n  100)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [28 30],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljs#L28-L30"},
 :full-name "cljs.spec/*coll-check-limit*",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/STARcoll-check-limitSTAR.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/*coll-check-limit*"]))
```

-->
