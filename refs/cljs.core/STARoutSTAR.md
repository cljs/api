## cljs.core/\*out\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*out\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*out*)
</td>
</tr>
</table>









Source code @ [github]():

```clj
(def
  ^{:dynamic true
    :jsdoc ["@type {*}"]}
  *out* nil)
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/*out*` @ clojuredocs](http://clojuredocs.org/clojure.core/*out*)<br>
[`clojure.core/*out*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/*out*/)<br>
[`clojure.core/*out*` @ crossclj](http://crossclj.info/fun/clojure.core/*out*.html)<br>
[`cljs.core/*out*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*out*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARoutSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "*out*",
 :name-encode "STARoutSTAR",
 :history [["+" "1.7.10"]],
 :type "dynamic var",
 :clj-equiv {:full-name "clojure.core/*out*",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*out*"},
 :full-name-encode "cljs.core/STARoutSTAR",
 :source {:code "(def\n  ^{:dynamic true\n    :jsdoc [\"@type {*}\"]}\n  *out* nil)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [34 37],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/core.cljs#L34-L37"},
 :full-name "cljs.core/*out*",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARoutSTAR.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*out*"]))
```

-->
