## cljs.spec.impl.gen/int



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec.gen/int</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.gen/int)
</td>
</tr>
</table>

<samp>(int & args)</samp><br>

---

 <samp>
(__int__ & args)<br>
</samp>

---





Source docstring:

```
Fn returning clojure.test.check.generators/int
```


Source code @ [github]():

```clj
(lazy-prims any any-printable boolean char char-alpha char-alphanumeric char-ascii double
  int keyword keyword-ns large-integer ratio simple-type simple-type-printable
  string string-ascii string-alphanumeric symbol symbol-ns uuid)
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec.gen/int` @ clojuredocs](http://clojuredocs.org/clojure.spec.gen/int)<br>
[`clojure.spec.gen/int` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec.gen/int/)<br>
[`clojure.spec.gen/int` @ crossclj](http://crossclj.info/fun/clojure.spec.gen/int.html)<br>
[`cljs.spec.impl.gen/int` @ crossclj](http://crossclj.info/fun/cljs.spec.impl.gen.cljs/int.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/int.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec.impl.gen",
 :name "int",
 :signature ["[& args]"],
 :name-encode "int",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec.gen/int",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.gen/int"},
 :full-name-encode "cljs.spec.impl.gen/int",
 :source {:code "(lazy-prims any any-printable boolean char char-alpha char-alphanumeric char-ascii double\n  int keyword keyword-ns large-integer ratio simple-type simple-type-printable\n  string string-ascii string-alphanumeric symbol symbol-ns uuid)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec/impl/gen.cljs",
          :lines [72 74],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec/impl/gen.cljs#L72-L74"},
 :usage ["(int & args)"],
 :full-name "cljs.spec.impl.gen/int",
 :docstring "Fn returning clojure.test.check.generators/int",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/int.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec.impl.gen/int"]))
```

-->
