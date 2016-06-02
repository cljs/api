## cljs.spec/regex?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/regex?</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/regex?)
</td>
</tr>
</table>

<samp>(regex? x)</samp><br>

---

 <samp>
(__regex?__ x)<br>
</samp>

---





Source docstring:

```
returns x if x is a (clojure.spec) regex op, else logical false
```


Source code @ [github]():

```clj
(defn regex?
  [x]
  (c/and (::op x) x))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/regex?` @ clojuredocs](http://clojuredocs.org/clojure.spec/regex_q)<br>
[`clojure.spec/regex?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/regex%3F/)<br>
[`clojure.spec/regex?` @ crossclj](http://crossclj.info/fun/clojure.spec/regex%3F.html)<br>
[`cljs.spec/regex?` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/regex%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/regexQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "regex?",
 :signature ["[x]"],
 :name-encode "regexQMARK",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec/regex?",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/regex?"},
 :full-name-encode "cljs.spec/regexQMARK",
 :source {:code "(defn regex?\n  [x]\n  (c/and (::op x) x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [71 74],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljs#L71-L74"},
 :usage ["(regex? x)"],
 :full-name "cljs.spec/regex?",
 :docstring "returns x if x is a (clojure.spec) regex op, else logical false",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/regexQMARK.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/regex?"]))
```

-->
