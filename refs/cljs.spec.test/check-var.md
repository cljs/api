## cljs.spec.test/check-var



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec.test/check-var</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.test/check-var)
</td>
</tr>
</table>

<samp>(check-var v & opts)</samp><br>

---

 <samp>
(__check-var__ v & opts)<br>
</samp>

---





Source docstring:

```
Checks a var's specs using test.check. Optional args are
passed through to test.check/quick-check:

  num-tests     number of tests to run, default 100
  seed          random seed
  max-size      how large an input to generate, max 200
  reporter-fn   reporting fn

Returns a map as quick-check, with :explain-data added if
:result is false.
```


Source code @ [github]():

```clj
(defn check-var
  [v & opts]
  (let [specs (spec/fn-specs v)]
    (if (:args specs)
      (apply check-fn @v specs opts)
      (throw (js/Error. (str  "No :args spec for " v))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec.test/check-var` @ clojuredocs](http://clojuredocs.org/clojure.spec.test/check-var)<br>
[`clojure.spec.test/check-var` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec.test/check-var/)<br>
[`clojure.spec.test/check-var` @ crossclj](http://crossclj.info/fun/clojure.spec.test/check-var.html)<br>
[`cljs.spec.test/check-var` @ crossclj](http://crossclj.info/fun/cljs.spec.test.cljs/check-var.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.test/check-var.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec.test",
 :name "check-var",
 :signature ["[v & opts]"],
 :name-encode "check-var",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec.test/check-var",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.test/check-var"},
 :full-name-encode "cljs.spec.test/check-var",
 :source {:code "(defn check-var\n  [v & opts]\n  (let [specs (spec/fn-specs v)]\n    (if (:args specs)\n      (apply check-fn @v specs opts)\n      (throw (js/Error. (str  \"No :args spec for \" v))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec/test.cljs",
          :lines [68 83],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec/test.cljs#L68-L83"},
 :usage ["(check-var v & opts)"],
 :full-name "cljs.spec.test/check-var",
 :docstring "Checks a var's specs using test.check. Optional args are\npassed through to test.check/quick-check:\n\n  num-tests     number of tests to run, default 100\n  seed          random seed\n  max-size      how large an input to generate, max 200\n  reporter-fn   reporting fn\n\nReturns a map as quick-check, with :explain-data added if\n:result is false.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.test/check-var.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec.test/check-var"]))
```

-->
