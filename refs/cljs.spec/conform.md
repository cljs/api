## cljs.spec/conform



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/conform</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/conform)
</td>
</tr>
</table>

<samp>(conform spec x)</samp><br>

---

 <samp>
(__conform__ spec x)<br>
</samp>

---





Source docstring:

```
Given a spec and a value, returns :clojure.spec/invalid if value does not match spec,
else the (possibly destructured) value.
```


Source code @ [github]():

```clj
(defn conform
  [spec x]
  (conform* (specize spec) x))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/conform` @ clojuredocs](http://clojuredocs.org/clojure.spec/conform)<br>
[`clojure.spec/conform` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/conform/)<br>
[`clojure.spec/conform` @ crossclj](http://crossclj.info/fun/clojure.spec/conform.html)<br>
[`cljs.spec/conform` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/conform.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/conform.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "conform",
 :signature ["[spec x]"],
 :name-encode "conform",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec/conform",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/conform"},
 :full-name-encode "cljs.spec/conform",
 :source {:code "(defn conform\n  [spec x]\n  (conform* (specize spec) x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [104 108],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljs#L104-L108"},
 :usage ["(conform spec x)"],
 :full-name "cljs.spec/conform",
 :docstring "Given a spec and a value, returns :clojure.spec/invalid if value does not match spec,\nelse the (possibly destructured) value.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/conform.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/conform"]))
```

-->
