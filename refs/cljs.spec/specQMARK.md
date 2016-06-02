## cljs.spec/spec?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/spec?</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/spec?)
</td>
</tr>
</table>

<samp>(spec? x)</samp><br>

---

 <samp>
(__spec?__ x)<br>
</samp>

---





Source docstring:

```
returns x if x is a spec object, else logical false
```


Source code @ [github]():

```clj
(defn spec?
  [x]
  (c/and (implements? Spec x) x))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/spec?` @ clojuredocs](http://clojuredocs.org/clojure.spec/spec_q)<br>
[`clojure.spec/spec?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/spec%3F/)<br>
[`clojure.spec/spec?` @ crossclj](http://crossclj.info/fun/clojure.spec/spec%3F.html)<br>
[`cljs.spec/spec?` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/spec%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/specQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "spec?",
 :signature ["[x]"],
 :name-encode "specQMARK",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec/spec?",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/spec?"},
 :full-name-encode "cljs.spec/specQMARK",
 :source {:code "(defn spec?\n  [x]\n  (c/and (implements? Spec x) x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [66 69],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljs#L66-L69"},
 :usage ["(spec? x)"],
 :full-name "cljs.spec/spec?",
 :docstring "returns x if x is a spec object, else logical false",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/specQMARK.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/spec?"]))
```

-->
