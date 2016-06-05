## cljs.test/function?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.8.51"><img valign="middle" alt="[+] 1.8.51" title="Added in 1.8.51" src="https://img.shields.io/badge/+-1.8.51-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/function?</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/function?)
</td>
</tr>
</table>

<samp>(function? menv x)</samp><br>

---

 <samp>
(__function?__ menv x)<br>
</samp>

---





Source docstring:

```
Returns true if argument is a function or a symbol that resolves to
a function (not a macro).
```


Source code @ [github]():

```clj
(defn function?
  [menv x]
  (and (symbol? x) (:fn-var (ana-api/resolve menv x))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.test/function?` @ clojuredocs](http://clojuredocs.org/clojure.test/function_q)<br>
[`clojure.test/function?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/function%3F/)<br>
[`clojure.test/function?` @ crossclj](http://crossclj.info/fun/clojure.test/function%3F.html)<br>
[`cljs.test/function?` @ crossclj](http://crossclj.info/fun/cljs.test/function%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/functionQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "function?",
 :signature ["[menv x]"],
 :name-encode "functionQMARK",
 :history [["+" "1.8.51"]],
 :type "function",
 :clj-equiv {:full-name "clojure.test/function?",
             :url "http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/function?"},
 :full-name-encode "cljs.test/functionQMARK",
 :source {:code "(defn function?\n  [menv x]\n  (and (symbol? x) (:fn-var (ana-api/resolve menv x))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/test.cljc",
          :lines [19 23],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/test.cljc#L19-L23"},
 :usage ["(function? menv x)"],
 :full-name "cljs.test/function?",
 :docstring "Returns true if argument is a function or a symbol that resolves to\na function (not a macro).",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/functionQMARK.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/function?"]))
```

-->
