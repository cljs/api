## clojure.string/starts-with?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.145"><img valign="middle" alt="[+] 1.7.145" title="Added in 1.7.145" src="https://img.shields.io/badge/+-1.7.145-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/starts-with?</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/starts-with?)
</td>
</tr>
</table>

<samp>(starts-with? s substr)</samp><br>

---

 <samp>
(__starts-with?__ s substr)<br>
</samp>

---





Source docstring:

```
True if s starts with substr.
```


Source code @ [github]():

```clj
(defn ^boolean starts-with?
  [s substr]
  (gstring/startsWith s substr))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.string/starts-with?` @ clojuredocs](http://clojuredocs.org/clojure.string/starts-with_q)<br>
[`clojure.string/starts-with?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/starts-with%3F/)<br>
[`clojure.string/starts-with?` @ crossclj](http://crossclj.info/fun/clojure.string/starts-with%3F.html)<br>
[`clojure.string/starts-with?` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/starts-with%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/starts-withQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "clojure.string",
 :name "starts-with?",
 :signature ["[s substr]"],
 :name-encode "starts-withQMARK",
 :history [["+" "1.7.145"]],
 :type "function",
 :clj-equiv {:full-name "clojure.string/starts-with?",
             :url "http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/starts-with?"},
 :full-name-encode "clojure.string/starts-withQMARK",
 :source {:code "(defn ^boolean starts-with?\n  [s substr]\n  (gstring/startsWith s substr))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/clojure/string.cljs",
          :lines [245 248],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/clojure/string.cljs#L245-L248"},
 :usage ["(starts-with? s substr)"],
 :full-name "clojure.string/starts-with?",
 :docstring "True if s starts with substr.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/starts-withQMARK.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/starts-with?"]))
```

-->
