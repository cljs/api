## cljs.spec/instrument-all



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/instrument-all</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/instrument-all)
</td>
</tr>
</table>

<samp>(instrument-all)</samp><br>

---

 <samp>
(__instrument-all__)<br>
</samp>

---





Source docstring:

```
Call instrument for all speced-vars. Idempotent.
```


Source code @ [github]():

```clj
(defmacro instrument-all
  []
  `(do
     ~@(map #(list 'cljs.spec/instrument %) (speced-vars*))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/instrument-all` @ clojuredocs](http://clojuredocs.org/clojure.spec/instrument-all)<br>
[`clojure.spec/instrument-all` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/instrument-all/)<br>
[`clojure.spec/instrument-all` @ crossclj](http://crossclj.info/fun/clojure.spec/instrument-all.html)<br>
[`cljs.spec/instrument-all` @ crossclj](http://crossclj.info/fun/cljs.spec/instrument-all.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/instrument-all.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "instrument-all",
 :signature ["[]"],
 :name-encode "instrument-all",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/instrument-all",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/instrument-all"},
 :full-name-encode "cljs.spec/instrument-all",
 :source {:code "(defmacro instrument-all\n  []\n  `(do\n     ~@(map #(list 'cljs.spec/instrument %) (speced-vars*))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [413 417],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljc#L413-L417"},
 :usage ["(instrument-all)"],
 :full-name "cljs.spec/instrument-all",
 :docstring "Call instrument for all speced-vars. Idempotent.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/instrument-all.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/instrument-all"]))
```

-->
