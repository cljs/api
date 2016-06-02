## cljs.spec.impl.gen/delay



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec.gen/delay</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.gen/delay)
</td>
</tr>
</table>

<samp>(delay & body)</samp><br>

---

 <samp>
(__delay__ & body)<br>
</samp>

---





Source docstring:

```
given body that returns a generator, returns a
generator that delegates to that, but delays
creation until used.
```


Source code @ [github]():

```clj
(defmacro delay
  [& body]
  `(cljs.spec.impl.gen/delay-impl (c/delay ~@body)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec.gen/delay` @ clojuredocs](http://clojuredocs.org/clojure.spec.gen/delay)<br>
[`clojure.spec.gen/delay` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec.gen/delay/)<br>
[`clojure.spec.gen/delay` @ crossclj](http://crossclj.info/fun/clojure.spec.gen/delay.html)<br>
[`cljs.spec.impl.gen/delay` @ crossclj](http://crossclj.info/fun/cljs.spec.impl.gen/delay.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/delay.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec.impl.gen",
 :name "delay",
 :signature ["[& body]"],
 :name-encode "delay",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec.gen/delay",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.gen/delay"},
 :full-name-encode "cljs.spec.impl.gen/delay",
 :source {:code "(defmacro delay\n  [& body]\n  `(cljs.spec.impl.gen/delay-impl (c/delay ~@body)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec/impl/gen.cljc",
          :lines [32 37],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec/impl/gen.cljc#L32-L37"},
 :usage ["(delay & body)"],
 :full-name "cljs.spec.impl.gen/delay",
 :docstring "given body that returns a generator, returns a\ngenerator that delegates to that, but delays\ncreation until used.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/delay.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec.impl.gen/delay"]))
```

-->
