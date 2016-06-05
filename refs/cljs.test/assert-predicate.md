## cljs.test/assert-predicate



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.8.51"><img valign="middle" alt="[+] 1.8.51" title="Added in 1.8.51" src="https://img.shields.io/badge/+-1.8.51-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/assert-predicate</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/assert-predicate)
</td>
</tr>
</table>

<samp>(assert-predicate msg form)</samp><br>

---

 <samp>
(__assert-predicate__ msg form)<br>
</samp>

---





Source docstring:

```
Returns generic assertion code for any functional predicate.  The
'expected' argument to 'report' will contains the original form, the
'actual' argument will contain the form with all its sub-forms
evaluated.  If the predicate returns false, the 'actual' form will
be wrapped in (not...).
```


Source code @ [github]():

```clj
(defn assert-predicate
  [msg form]
  (let [args (rest form)
        pred (first form)]
    `(let [values# (list ~@args)
           result# (apply ~pred values#)]
       (if result#
         (cljs.test/do-report
           {:type :pass, :message ~msg,
            :expected '~form, :actual (cons ~pred values#)})
         (cljs.test/do-report
           {:type :fail, :message ~msg,
            :expected '~form, :actual (list '~'not (cons '~pred values#))}))
       result#)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.test/assert-predicate` @ clojuredocs](http://clojuredocs.org/clojure.test/assert-predicate)<br>
[`clojure.test/assert-predicate` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/assert-predicate/)<br>
[`clojure.test/assert-predicate` @ crossclj](http://crossclj.info/fun/clojure.test/assert-predicate.html)<br>
[`cljs.test/assert-predicate` @ crossclj](http://crossclj.info/fun/cljs.test/assert-predicate.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/assert-predicate.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "assert-predicate",
 :signature ["[msg form]"],
 :name-encode "assert-predicate",
 :history [["+" "1.8.51"]],
 :type "function",
 :clj-equiv {:full-name "clojure.test/assert-predicate",
             :url "http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/assert-predicate"},
 :full-name-encode "cljs.test/assert-predicate",
 :source {:code "(defn assert-predicate\n  [msg form]\n  (let [args (rest form)\n        pred (first form)]\n    `(let [values# (list ~@args)\n           result# (apply ~pred values#)]\n       (if result#\n         (cljs.test/do-report\n           {:type :pass, :message ~msg,\n            :expected '~form, :actual (cons ~pred values#)})\n         (cljs.test/do-report\n           {:type :fail, :message ~msg,\n            :expected '~form, :actual (list '~'not (cons '~pred values#))}))\n       result#)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/test.cljc",
          :lines [25 43],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/test.cljc#L25-L43"},
 :usage ["(assert-predicate msg form)"],
 :full-name "cljs.test/assert-predicate",
 :docstring "Returns generic assertion code for any functional predicate.  The\n'expected' argument to 'report' will contains the original form, the\n'actual' argument will contain the form with all its sub-forms\nevaluated.  If the predicate returns false, the 'actual' form will\nbe wrapped in (not...).",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/assert-predicate.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/assert-predicate"]))
```

-->
