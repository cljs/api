## cljs.spec.test/check-fn



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec.test/check-fn</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.test/check-fn)
</td>
</tr>
</table>

<samp>(check-fn f specs & {:keys \[num-tests seed max-size reporter-fn\], :or {num-tests 100, max-size 200, reporter-fn (constantly nil)}})</samp><br>

---

 <samp>
(__check-fn__ f specs & {:keys \[num-tests seed max-size reporter-fn\], :or {num-tests 100, max-size 200, reporter-fn (constantly nil)}})<br>
</samp>

---





Source docstring:

```
Check a function using provided specs and test.check.
Same options and return as check-var
```


Source code @ [github]():

```clj
(defn check-fn
  [f specs
   & {:keys [num-tests seed max-size reporter-fn]
      :or {num-tests 100 max-size 200 reporter-fn (constantly nil)}}]
  (let [g (spec/gen (:args specs))
        prop (gen/for-all* [g] #(check-call f specs %))]
    (let [ret (gen/quick-check num-tests prop :seed seed :max-size max-size :reporter-fn reporter-fn)]
      (if-let [[smallest] (-> ret :shrunk :smallest)]
        (unwrap-failing ret)
        ret))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec.test/check-fn` @ clojuredocs](http://clojuredocs.org/clojure.spec.test/check-fn)<br>
[`clojure.spec.test/check-fn` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec.test/check-fn/)<br>
[`clojure.spec.test/check-fn` @ crossclj](http://crossclj.info/fun/clojure.spec.test/check-fn.html)<br>
[`cljs.spec.test/check-fn` @ crossclj](http://crossclj.info/fun/cljs.spec.test.cljs/check-fn.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.test/check-fn.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec.test",
 :name "check-fn",
 :signature ["[f specs & {:keys [num-tests seed max-size reporter-fn], :or {num-tests 100, max-size 200, reporter-fn (constantly nil)}}]"],
 :name-encode "check-fn",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec.test/check-fn",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.test/check-fn"},
 :full-name-encode "cljs.spec.test/check-fn",
 :source {:code "(defn check-fn\n  [f specs\n   & {:keys [num-tests seed max-size reporter-fn]\n      :or {num-tests 100 max-size 200 reporter-fn (constantly nil)}}]\n  (let [g (spec/gen (:args specs))\n        prop (gen/for-all* [g] #(check-call f specs %))]\n    (let [ret (gen/quick-check num-tests prop :seed seed :max-size max-size :reporter-fn reporter-fn)]\n      (if-let [[smallest] (-> ret :shrunk :smallest)]\n        (unwrap-failing ret)\n        ret))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec/test.cljs",
          :lines [55 66],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec/test.cljs#L55-L66"},
 :usage ["(check-fn f specs & {:keys [num-tests seed max-size reporter-fn], :or {num-tests 100, max-size 200, reporter-fn (constantly nil)}})"],
 :full-name "cljs.spec.test/check-fn",
 :docstring "Check a function using provided specs and test.check.\nSame options and return as check-var",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.test/check-fn.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec.test/check-fn"]))
```

-->
