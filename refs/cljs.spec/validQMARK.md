## cljs.spec/valid?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/valid?</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/valid?)
</td>
</tr>
</table>

<samp>(valid? spec x)</samp><br>
<samp>(valid? spec x form)</samp><br>

---

 <samp>
(__valid?__ spec x)<br>
</samp>
 <samp>
(__valid?__ spec x form)<br>
</samp>

---





Source docstring:

```
Helper function that returns true when x is valid for spec.
```


Source code @ [github]():

```clj
(defn valid?
  ([spec x]
   (not= ::invalid (dt spec x ::unknown)))
  ([spec x form]
   (not= ::invalid (dt spec x form))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/valid?` @ clojuredocs](http://clojuredocs.org/clojure.spec/valid_q)<br>
[`clojure.spec/valid?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/valid%3F/)<br>
[`clojure.spec/valid?` @ crossclj](http://crossclj.info/fun/clojure.spec/valid%3F.html)<br>
[`cljs.spec/valid?` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/valid%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/validQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "valid?",
 :signature ["[spec x]" "[spec x form]"],
 :name-encode "validQMARK",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec/valid?",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/valid?"},
 :full-name-encode "cljs.spec/validQMARK",
 :source {:code "(defn valid?\n  ([spec x]\n   (not= ::invalid (dt spec x ::unknown)))\n  ([spec x form]\n   (not= ::invalid (dt spec x form))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [365 370],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljs#L365-L370"},
 :usage ["(valid? spec x)" "(valid? spec x form)"],
 :full-name "cljs.spec/valid?",
 :docstring "Helper function that returns true when x is valid for spec.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/validQMARK.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/valid?"]))
```

-->
