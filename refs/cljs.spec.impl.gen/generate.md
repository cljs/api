## cljs.spec.impl.gen/generate



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec.gen/generate</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.gen/generate)
</td>
</tr>
</table>

<samp>(generate generator)</samp><br>

---

 <samp>
(__generate__ generator)<br>
</samp>

---





Source docstring:

```
Generate a single value using generator.
```


Source code @ [github]():

```clj
(defn generate
    [generator]
    (@g generator))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec.gen/generate` @ clojuredocs](http://clojuredocs.org/clojure.spec.gen/generate)<br>
[`clojure.spec.gen/generate` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec.gen/generate/)<br>
[`clojure.spec.gen/generate` @ crossclj](http://crossclj.info/fun/clojure.spec.gen/generate.html)<br>
[`cljs.spec.impl.gen/generate` @ crossclj](http://crossclj.info/fun/cljs.spec.impl.gen.cljs/generate.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/generate.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec.impl.gen",
 :name "generate",
 :signature ["[generator]"],
 :name-encode "generate",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec.gen/generate",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.gen/generate"},
 :full-name-encode "cljs.spec.impl.gen/generate",
 :source {:code "(defn generate\n    [generator]\n    (@g generator))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec/impl/gen.cljs",
          :lines [50 53],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec/impl/gen.cljs#L50-L53"},
 :usage ["(generate generator)"],
 :full-name "cljs.spec.impl.gen/generate",
 :docstring "Generate a single value using generator.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/generate.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec.impl.gen/generate"]))
```

-->
