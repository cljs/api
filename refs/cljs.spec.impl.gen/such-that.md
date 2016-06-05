## cljs.spec.impl.gen/such-that



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec.gen/such-that</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.gen/such-that)
</td>
</tr>
</table>

<samp>(such-that & args)</samp><br>

---

 <samp>
(__such-that__ & args)<br>
</samp>

---





Source docstring:

```
Lazy loaded version of clojure.test.check.generators/such-that
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

[`clojure.spec.gen/such-that` @ clojuredocs](http://clojuredocs.org/clojure.spec.gen/such-that)<br>
[`clojure.spec.gen/such-that` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec.gen/such-that/)<br>
[`clojure.spec.gen/such-that` @ crossclj](http://crossclj.info/fun/clojure.spec.gen/such-that.html)<br>
[`cljs.spec.impl.gen/such-that` @ crossclj](http://crossclj.info/fun/cljs.spec.impl.gen.cljs/such-that.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/such-that.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec.impl.gen",
 :name "such-that",
 :signature ["[& args]"],
 :name-encode "such-that",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec.gen/such-that",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.gen/such-that"},
 :full-name-encode "cljs.spec.impl.gen/such-that",
 :source {:code "(lazy-combinators hash-map list map not-empty set vector fmap elements\n  bind choose one-of such-that tuple sample return)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec/impl/gen.cljs",
          :lines [69 70],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec/impl/gen.cljs#L69-L70"},
 :usage ["(such-that & args)"],
 :full-name "cljs.spec.impl.gen/such-that",
 :docstring "Lazy loaded version of clojure.test.check.generators/such-that",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/such-that.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec.impl.gen/such-that"]))
```

-->
