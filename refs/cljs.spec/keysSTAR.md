## cljs.spec/keys\*



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/keys\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/keys*)
</td>
</tr>
</table>

<samp>(keys\* & kspecs)</samp><br>

---

 <samp>
(__keys\*__ & kspecs)<br>
</samp>

---





Source docstring:

```
takes the same arguments as spec/keys and returns a regex op that matches sequences of key/values,
converts them into a map, and conforms that map with a corresponding
spec/keys call:

user=> (s/conform (s/keys :req-un [::a ::c]) {:a 1 :c 2})
{:a 1, :c 2}
user=> (s/conform (s/keys* :req-un [::a ::c]) [:a 1 :c 2])
{:a 1, :c 2}

the resulting regex op can be composed into a larger regex:

user=> (s/conform (s/cat :i1 integer? :m (s/keys* :req-un [::a ::c]) :i2 integer?) [42 :a 1 :c 2 :d 4 99])
{:i1 42, :m {:a 1, :c 2, :d 4}, :i2 99}
```


Source code @ [github]():

```clj
(defmacro keys*
  [& kspecs]
  `(& (* (cat ::k keyword? ::v ::any)) ::kvs->map (keys ~@kspecs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/keys*` @ clojuredocs](http://clojuredocs.org/clojure.spec/keys*)<br>
[`clojure.spec/keys*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/keys*/)<br>
[`clojure.spec/keys*` @ crossclj](http://crossclj.info/fun/clojure.spec/keys*.html)<br>
[`cljs.spec/keys*` @ crossclj](http://crossclj.info/fun/cljs.spec/keys*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/keysSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "keys*",
 :signature ["[& kspecs]"],
 :name-encode "keysSTAR",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/keys*",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/keys*"},
 :full-name-encode "cljs.spec/keysSTAR",
 :source {:code "(defmacro keys*\n  [& kspecs]\n  `(& (* (cat ::k keyword? ::v ::any)) ::kvs->map (keys ~@kspecs)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [347 362],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljc#L347-L362"},
 :usage ["(keys* & kspecs)"],
 :full-name "cljs.spec/keys*",
 :docstring "takes the same arguments as spec/keys and returns a regex op that matches sequences of key/values,\nconverts them into a map, and conforms that map with a corresponding\nspec/keys call:\n\nuser=> (s/conform (s/keys :req-un [::a ::c]) {:a 1 :c 2})\n{:a 1, :c 2}\nuser=> (s/conform (s/keys* :req-un [::a ::c]) [:a 1 :c 2])\n{:a 1, :c 2}\n\nthe resulting regex op can be composed into a larger regex:\n\nuser=> (s/conform (s/cat :i1 integer? :m (s/keys* :req-un [::a ::c]) :i2 integer?) [42 :a 1 :c 2 :d 4 99])\n{:i1 42, :m {:a 1, :c 2, :d 4}, :i2 99}",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/keysSTAR.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/keys*"]))
```

-->
