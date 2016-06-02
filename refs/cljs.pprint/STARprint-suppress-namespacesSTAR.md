## cljs.pprint/\*print-suppress-namespaces\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/\*print-suppress-namespaces\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-suppress-namespaces*)
</td>
</tr>
</table>







Source docstring:

```
Don't print namespaces with symbols. This is particularly useful when
pretty printing the results of macro expansions
```


Source code @ [github]():

```clj
(def ^:dynamic
^{:doc "Don't print namespaces with symbols. This is particularly useful when
pretty printing the results of macro expansions"
  :added "1.2"}
*print-suppress-namespaces* nil)
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.pprint/*print-suppress-namespaces*` @ clojuredocs](http://clojuredocs.org/clojure.pprint/*print-suppress-namespaces*)<br>
[`clojure.pprint/*print-suppress-namespaces*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/*print-suppress-namespaces*/)<br>
[`clojure.pprint/*print-suppress-namespaces*` @ crossclj](http://crossclj.info/fun/clojure.pprint/*print-suppress-namespaces*.html)<br>
[`cljs.pprint/*print-suppress-namespaces*` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/*print-suppress-namespaces*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/STARprint-suppress-namespacesSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "*print-suppress-namespaces*",
 :name-encode "STARprint-suppress-namespacesSTAR",
 :history [["+" "0.0-3255"]],
 :type "dynamic var",
 :clj-equiv {:full-name "clojure.pprint/*print-suppress-namespaces*",
             :url "http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-suppress-namespaces*"},
 :full-name-encode "cljs.pprint/STARprint-suppress-namespacesSTAR",
 :source {:code "(def ^:dynamic\n^{:doc \"Don't print namespaces with symbols. This is particularly useful when\npretty printing the results of macro expansions\"\n  :added \"1.2\"}\n*print-suppress-namespaces* nil)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [657 661],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/pprint.cljs#L657-L661"},
 :full-name "cljs.pprint/*print-suppress-namespaces*",
 :docstring "Don't print namespaces with symbols. This is particularly useful when\npretty printing the results of macro expansions",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/STARprint-suppress-namespacesSTAR.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/*print-suppress-namespaces*"]))
```

-->
