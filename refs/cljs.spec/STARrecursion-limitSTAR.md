## cljs.spec/\*recursion-limit\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/\*recursion-limit\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/*recursion-limit*)
</td>
</tr>
</table>









Source code @ [github]():

```clj
(def ^:dynamic *recursion-limit*
  "A soft limit on how many times a branching spec (or/alt/*/opt-keys/multi-spec)
  can be recursed through during generation. After this a
  non-recursive branch will be chosen."
  4)
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/*recursion-limit*` @ clojuredocs](http://clojuredocs.org/clojure.spec/*recursion-limit*)<br>
[`clojure.spec/*recursion-limit*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/*recursion-limit*/)<br>
[`clojure.spec/*recursion-limit*` @ crossclj](http://crossclj.info/fun/clojure.spec/*recursion-limit*.html)<br>
[`cljs.spec/*recursion-limit*` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/*recursion-limit*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/STARrecursion-limitSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "*recursion-limit*",
 :name-encode "STARrecursion-limitSTAR",
 :history [["+" "1.9.14"]],
 :type "dynamic var",
 :clj-equiv {:full-name "clojure.spec/*recursion-limit*",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/*recursion-limit*"},
 :full-name-encode "cljs.spec/STARrecursion-limitSTAR",
 :source {:code "(def ^:dynamic *recursion-limit*\n  \"A soft limit on how many times a branching spec (or/alt/*/opt-keys/multi-spec)\n  can be recursed through during generation. After this a\n  non-recursive branch will be chosen.\"\n  4)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [19 23],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljs#L19-L23"},
 :full-name "cljs.spec/*recursion-limit*",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/STARrecursion-limitSTAR.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/*recursion-limit*"]))
```

-->
