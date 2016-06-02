## cljs.spec/+



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/+</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/+)
</td>
</tr>
</table>

<samp>(+ pred-form)</samp><br>

---

 <samp>
(__+__ pred-form)<br>
</samp>

---





Source docstring:

```
Returns a regex op that matches one or more values matching
pred. Produces a vector of matches
```


Source code @ [github]():

```clj
(defmacro +
  [pred-form]
  `(cljs.spec/rep+impl '~(res &env pred-form) ~pred-form))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/+` @ clojuredocs](http://clojuredocs.org/clojure.spec/+)<br>
[`clojure.spec/+` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/%2B/)<br>
[`clojure.spec/+` @ crossclj](http://crossclj.info/fun/clojure.spec/%2B.html)<br>
[`cljs.spec/+` @ crossclj](http://crossclj.info/fun/cljs.spec/%2B.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/PLUS.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "+",
 :signature ["[pred-form]"],
 :name-encode "PLUS",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/+",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/+"},
 :full-name-encode "cljs.spec/PLUS",
 :source {:code "(defmacro +\n  [pred-form]\n  `(cljs.spec/rep+impl '~(res &env pred-form) ~pred-form))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [183 187],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljc#L183-L187"},
 :usage ["(+ pred-form)"],
 :full-name "cljs.spec/+",
 :docstring "Returns a regex op that matches one or more values matching\npred. Produces a vector of matches",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/PLUS.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/+"]))
```

-->
