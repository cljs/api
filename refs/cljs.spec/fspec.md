## cljs.spec/fspec



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/fspec</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/fspec)
</td>
</tr>
</table>

<samp>(fspec & {:keys \[args ret fn gen\]})</samp><br>

---

 <samp>
(__fspec__ & {:keys \[args ret fn gen\]})<br>
</samp>

---





Source docstring:

```
takes :args :ret and (optional) :fn kwargs whose values are preds
and returns a spec whose conform/explain take a fn and validates it
using generative testing. The conformed value is always the fn itself.

Optionally takes :gen generator-fn, which must be a fn of no args
that returns a test.check generator.
```


Source code @ [github]():

```clj
(defmacro fspec
  [& {:keys [args ret fn gen]}]
  (let [env &env]
    `(cljs.spec/fspec-impl ~args '~(res env args) ~ret '~(res env ret) ~fn '~(res env fn) ~gen)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/fspec` @ clojuredocs](http://clojuredocs.org/clojure.spec/fspec)<br>
[`clojure.spec/fspec` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/fspec/)<br>
[`clojure.spec/fspec` @ crossclj](http://crossclj.info/fun/clojure.spec/fspec.html)<br>
[`cljs.spec/fspec` @ crossclj](http://crossclj.info/fun/cljs.spec/fspec.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/fspec.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "fspec",
 :signature ["[& {:keys [args ret fn gen]}]"],
 :name-encode "fspec",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/fspec",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/fspec"},
 :full-name-encode "cljs.spec/fspec",
 :source {:code "(defmacro fspec\n  [& {:keys [args ret fn gen]}]\n  (let [env &env]\n    `(cljs.spec/fspec-impl ~args '~(res env args) ~ret '~(res env ret) ~fn '~(res env fn) ~gen)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [241 250],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljc#L241-L250"},
 :usage ["(fspec & {:keys [args ret fn gen]})"],
 :full-name "cljs.spec/fspec",
 :docstring "takes :args :ret and (optional) :fn kwargs whose values are preds\nand returns a spec whose conform/explain take a fn and validates it\nusing generative testing. The conformed value is always the fn itself.\n\nOptionally takes :gen generator-fn, which must be a fn of no args\nthat returns a test.check generator.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/fspec.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/fspec"]))
```

-->
