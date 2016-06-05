## cljs.spec.impl.gen/fmap



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec.gen/fmap</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.gen/fmap)
</td>
</tr>
</table>

<samp>(fmap & args)</samp><br>

---

 <samp>
(__fmap__ & args)<br>
</samp>

---





Source docstring:

```
Lazy loaded version of clojure.test.check.generators/fmap
```


Source code @ [github]():

```clj
(lazy-combinators hash-map list map not-empty set vector fmap elements
  bind choose one-of such-that tuple sample return)
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec.gen/fmap` @ clojuredocs](http://clojuredocs.org/clojure.spec.gen/fmap)<br>
[`clojure.spec.gen/fmap` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec.gen/fmap/)<br>
[`clojure.spec.gen/fmap` @ crossclj](http://crossclj.info/fun/clojure.spec.gen/fmap.html)<br>
[`cljs.spec.impl.gen/fmap` @ crossclj](http://crossclj.info/fun/cljs.spec.impl.gen.cljs/fmap.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/fmap.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec.impl.gen",
 :name "fmap",
 :signature ["[& args]"],
 :name-encode "fmap",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec.gen/fmap",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.gen/fmap"},
 :full-name-encode "cljs.spec.impl.gen/fmap",
 :source {:code "(lazy-combinators hash-map list map not-empty set vector fmap elements\n  bind choose one-of such-that tuple sample return)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec/impl/gen.cljs",
          :lines [69 70],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec/impl/gen.cljs#L69-L70"},
 :usage ["(fmap & args)"],
 :full-name "cljs.spec.impl.gen/fmap",
 :docstring "Lazy loaded version of clojure.test.check.generators/fmap",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/fmap.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec.impl.gen/fmap"]))
```

-->
