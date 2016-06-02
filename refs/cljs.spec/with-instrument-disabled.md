## cljs.spec/with-instrument-disabled



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/with-instrument-disabled</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/with-instrument-disabled)
</td>
</tr>
</table>

<samp>(with-instrument-disabled & body)</samp><br>

---

 <samp>
(__with-instrument-disabled__ & body)<br>
</samp>

---





Source docstring:

```
Disables instrument's checking of calls, within a scope.
```


Source code @ [github]():

```clj
(defmacro with-instrument-disabled
  [& body]
  `(binding [*instrument-enabled* nil]
     ~@body))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/with-instrument-disabled` @ clojuredocs](http://clojuredocs.org/clojure.spec/with-instrument-disabled)<br>
[`clojure.spec/with-instrument-disabled` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/with-instrument-disabled/)<br>
[`clojure.spec/with-instrument-disabled` @ crossclj](http://crossclj.info/fun/clojure.spec/with-instrument-disabled.html)<br>
[`cljs.spec/with-instrument-disabled` @ crossclj](http://crossclj.info/fun/cljs.spec/with-instrument-disabled.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/with-instrument-disabled.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "with-instrument-disabled",
 :signature ["[& body]"],
 :name-encode "with-instrument-disabled",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/with-instrument-disabled",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/with-instrument-disabled"},
 :full-name-encode "cljs.spec/with-instrument-disabled",
 :source {:code "(defmacro with-instrument-disabled\n  [& body]\n  `(binding [*instrument-enabled* nil]\n     ~@body))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [341 345],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljc#L341-L345"},
 :usage ["(with-instrument-disabled & body)"],
 :full-name "cljs.spec/with-instrument-disabled",
 :docstring "Disables instrument's checking of calls, within a scope.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/with-instrument-disabled.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/with-instrument-disabled"]))
```

-->
