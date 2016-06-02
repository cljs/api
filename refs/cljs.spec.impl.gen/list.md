## cljs.spec.impl.gen/list



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec.gen/list</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.gen/list)
</td>
</tr>
</table>

<samp>(list & args)</samp><br>

---

 <samp>
(__list__ & args)<br>
</samp>

---





Source docstring:

```
Lazy loaded version of clojure.test.check.generators/list
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

[`clojure.spec.gen/list` @ clojuredocs](http://clojuredocs.org/clojure.spec.gen/list)<br>
[`clojure.spec.gen/list` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec.gen/list/)<br>
[`clojure.spec.gen/list` @ crossclj](http://crossclj.info/fun/clojure.spec.gen/list.html)<br>
[`cljs.spec.impl.gen/list` @ crossclj](http://crossclj.info/fun/cljs.spec.impl.gen.cljs/list.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/list.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec.impl.gen",
 :name "list",
 :signature ["[& args]"],
 :name-encode "list",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec.gen/list",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.gen/list"},
 :full-name-encode "cljs.spec.impl.gen/list",
 :source {:code "(lazy-combinators hash-map list map not-empty set vector fmap elements\n  bind choose one-of such-that tuple sample return)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec/impl/gen.cljs",
          :lines [69 70],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec/impl/gen.cljs#L69-L70"},
 :usage ["(list & args)"],
 :full-name "cljs.spec.impl.gen/list",
 :docstring "Lazy loaded version of clojure.test.check.generators/list",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/list.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec.impl.gen/list"]))
```

-->
