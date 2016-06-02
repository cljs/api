## cljs.test/assert-any



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.8.51"><img valign="middle" alt="[+] 1.8.51" title="Added in 1.8.51" src="https://img.shields.io/badge/+-1.8.51-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/assert-any</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/assert-any)
</td>
</tr>
</table>

<samp>(assert-any msg form)</samp><br>

---

 <samp>
(__assert-any__ msg form)<br>
</samp>

---





Source docstring:

```
Returns generic assertion code for any test, including macros, Java
method calls, or isolated symbols.
```


Source code @ [github]():

```clj
(defn assert-any
  [msg form]
  `(let [value# ~form]
     (if value#
       (cljs.test/do-report
         {:type :pass, :message ~msg,
          :expected '~form, :actual value#})
       (cljs.test/do-report
         {:type :fail, :message ~msg,
          :expected '~form, :actual value#}))
     value#))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.test/assert-any` @ clojuredocs](http://clojuredocs.org/clojure.test/assert-any)<br>
[`clojure.test/assert-any` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/assert-any/)<br>
[`clojure.test/assert-any` @ crossclj](http://crossclj.info/fun/clojure.test/assert-any.html)<br>
[`cljs.test/assert-any` @ crossclj](http://crossclj.info/fun/cljs.test/assert-any.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/assert-any.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "assert-any",
 :signature ["[msg form]"],
 :name-encode "assert-any",
 :history [["+" "1.8.51"]],
 :type "function",
 :clj-equiv {:full-name "clojure.test/assert-any",
             :url "http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/assert-any"},
 :full-name-encode "cljs.test/assert-any",
 :source {:code "(defn assert-any\n  [msg form]\n  `(let [value# ~form]\n     (if value#\n       (cljs.test/do-report\n         {:type :pass, :message ~msg,\n          :expected '~form, :actual value#})\n       (cljs.test/do-report\n         {:type :fail, :message ~msg,\n          :expected '~form, :actual value#}))\n     value#))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/test.cljc",
          :lines [45 57],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/test.cljc#L45-L57"},
 :usage ["(assert-any msg form)"],
 :full-name "cljs.test/assert-any",
 :docstring "Returns generic assertion code for any test, including macros, Java\nmethod calls, or isolated symbols.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/assert-any.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/assert-any"]))
```

-->
