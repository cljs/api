## cljs.spec/unstrument-all



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/unstrument-all</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/unstrument-all)
</td>
</tr>
</table>

<samp>(unstrument-all)</samp><br>

---

 <samp>
(__unstrument-all__)<br>
</samp>

---





Source docstring:

```
Call unstrument for all speced-vars. Idempotent
```


Source code @ [github]():

```clj
(defmacro unstrument-all
  []
  `(do
     ~@(map #(list 'cljs.spec/unstrument %) (speced-vars*))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/unstrument-all` @ clojuredocs](http://clojuredocs.org/clojure.spec/unstrument-all)<br>
[`clojure.spec/unstrument-all` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/unstrument-all/)<br>
[`clojure.spec/unstrument-all` @ crossclj](http://crossclj.info/fun/clojure.spec/unstrument-all.html)<br>
[`cljs.spec/unstrument-all` @ crossclj](http://crossclj.info/fun/cljs.spec/unstrument-all.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/unstrument-all.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "unstrument-all",
 :signature ["[]"],
 :name-encode "unstrument-all",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/unstrument-all",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/unstrument-all"},
 :full-name-encode "cljs.spec/unstrument-all",
 :source {:code "(defmacro unstrument-all\n  []\n  `(do\n     ~@(map #(list 'cljs.spec/unstrument %) (speced-vars*))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [419 423],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljc#L419-L423"},
 :usage ["(unstrument-all)"],
 :full-name "cljs.spec/unstrument-all",
 :docstring "Call unstrument for all speced-vars. Idempotent",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/unstrument-all.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/unstrument-all"]))
```

-->
