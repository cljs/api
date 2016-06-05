## cljs.spec/\*fspec-iterations\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/\*fspec-iterations\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/*fspec-iterations*)
</td>
</tr>
</table>









Source code @ [github]():

```clj
(def ^:dynamic *fspec-iterations*
  "The number of times an anonymous fn specified by fspec will be (generatively) tested during conform"
  21)
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/*fspec-iterations*` @ clojuredocs](http://clojuredocs.org/clojure.spec/*fspec-iterations*)<br>
[`clojure.spec/*fspec-iterations*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/*fspec-iterations*/)<br>
[`clojure.spec/*fspec-iterations*` @ crossclj](http://crossclj.info/fun/clojure.spec/*fspec-iterations*.html)<br>
[`cljs.spec/*fspec-iterations*` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/*fspec-iterations*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/STARfspec-iterationsSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "*fspec-iterations*",
 :name-encode "STARfspec-iterationsSTAR",
 :history [["+" "1.9.14"]],
 :type "dynamic var",
 :clj-equiv {:full-name "clojure.spec/*fspec-iterations*",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/*fspec-iterations*"},
 :full-name-encode "cljs.spec/STARfspec-iterationsSTAR",
 :source {:code "(def ^:dynamic *fspec-iterations*\n  \"The number of times an anonymous fn specified by fspec will be (generatively) tested during conform\"\n  21)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [25 27],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljs#L25-L27"},
 :full-name "cljs.spec/*fspec-iterations*",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/STARfspec-iterationsSTAR.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/*fspec-iterations*"]))
```

-->
