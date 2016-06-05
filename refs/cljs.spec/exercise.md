## cljs.spec/exercise



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/exercise</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/exercise)
</td>
</tr>
</table>

<samp>(exercise spec)</samp><br>
<samp>(exercise spec n)</samp><br>
<samp>(exercise spec n overrides)</samp><br>

---

 <samp>
(__exercise__ spec)<br>
</samp>
 <samp>
(__exercise__ spec n)<br>
</samp>
 <samp>
(__exercise__ spec n overrides)<br>
</samp>

---





Source docstring:

```
generates a number (default 10) of values compatible with spec and maps conform over them,
returning a sequence of [val conformed-val] tuples. Optionally takes
a generator overrides map as per gen
```


Source code @ [github]():

```clj
(defn exercise
  ([spec] (exercise spec 10))
  ([spec n] (exercise spec n nil))
  ([spec n overrides]
   (map #(vector % (conform spec %)) (gen/sample (gen spec overrides) n))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/exercise` @ clojuredocs](http://clojuredocs.org/clojure.spec/exercise)<br>
[`clojure.spec/exercise` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/exercise/)<br>
[`clojure.spec/exercise` @ crossclj](http://crossclj.info/fun/clojure.spec/exercise.html)<br>
[`cljs.spec/exercise` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/exercise.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/exercise.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "exercise",
 :signature ["[spec]" "[spec n]" "[spec n overrides]"],
 :name-encode "exercise",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec/exercise",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/exercise"},
 :full-name-encode "cljs.spec/exercise",
 :source {:code "(defn exercise\n  ([spec] (exercise spec 10))\n  ([spec n] (exercise spec n nil))\n  ([spec n overrides]\n   (map #(vector % (conform spec %)) (gen/sample (gen spec overrides) n))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [1026 1033],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljs#L1026-L1033"},
 :usage ["(exercise spec)"
         "(exercise spec n)"
         "(exercise spec n overrides)"],
 :full-name "cljs.spec/exercise",
 :docstring "generates a number (default 10) of values compatible with spec and maps conform over them,\nreturning a sequence of [val conformed-val] tuples. Optionally takes\na generator overrides map as per gen",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/exercise.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/exercise"]))
```

-->
