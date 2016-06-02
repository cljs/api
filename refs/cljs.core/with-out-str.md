## cljs.core/with-out-str



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1535"><img valign="middle" alt="[+] 0.0-1535" title="Added in 0.0-1535" src="https://img.shields.io/badge/+-0.0--1535-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/with-out-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-out-str)
</td>
</tr>
</table>

<samp>(with-out-str & body)</samp><br>

---

 <samp>
(__with-out-str__ & body)<br>
</samp>

---





Source docstring:

```
Evaluates exprs in a context in which *print-fn* is bound to .append
on a fresh StringBuffer.  Returns the string created by any nested
printing calls.
```


Source code @ [github]():

```clj
(core/defmacro with-out-str
  [& body]
  `(let [sb# (js/goog.string.StringBuffer.)]
     (binding [cljs.core/*print-newline* true
               cljs.core/*print-fn* (fn [x#] (.append sb# x#))]
       ~@body)
     (cljs.core/str sb#)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/with-out-str` @ clojuredocs](http://clojuredocs.org/clojure.core/with-out-str)<br>
[`clojure.core/with-out-str` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/with-out-str/)<br>
[`clojure.core/with-out-str` @ crossclj](http://crossclj.info/fun/clojure.core/with-out-str.html)<br>
[`cljs.core/with-out-str` @ crossclj](http://crossclj.info/fun/cljs.core/with-out-str.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/with-out-str.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "with-out-str",
 :signature ["[& body]"],
 :name-encode "with-out-str",
 :history [["+" "0.0-1535"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.core/with-out-str",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-out-str"},
 :full-name-encode "cljs.core/with-out-str",
 :source {:code "(core/defmacro with-out-str\n  [& body]\n  `(let [sb# (js/goog.string.StringBuffer.)]\n     (binding [cljs.core/*print-newline* true\n               cljs.core/*print-fn* (fn [x#] (.append sb# x#))]\n       ~@body)\n     (cljs.core/str sb#)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [2627 2636],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/clojure/cljs/core.cljc#L2627-L2636"},
 :usage ["(with-out-str & body)"],
 :full-name "cljs.core/with-out-str",
 :docstring "Evaluates exprs in a context in which *print-fn* is bound to .append\non a fresh StringBuffer.  Returns the string created by any nested\nprinting calls.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/with-out-str.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/with-out-str"]))
```

-->
