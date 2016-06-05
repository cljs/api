## clojure.walk/postwalk-replace



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/postwalk-replace</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/postwalk-replace)
</td>
</tr>
</table>

<samp>(postwalk-replace smap form)</samp><br>

---

 <samp>
(__postwalk-replace__ smap form)<br>
</samp>

---





Source docstring:

```
Recursively transforms form by replacing keys in smap with their
values.  Like clojure/replace but works on any data structure.  Does
replacement at the leaves of the tree first.
```


Source code @ [github]():

```clj
(defn postwalk-replace
  [smap form]
  (postwalk (fn [x] (if (contains? smap x) (smap x) x)) form))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.walk/postwalk-replace` @ clojuredocs](http://clojuredocs.org/clojure.walk/postwalk-replace)<br>
[`clojure.walk/postwalk-replace` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.walk/postwalk-replace/)<br>
[`clojure.walk/postwalk-replace` @ crossclj](http://crossclj.info/fun/clojure.walk/postwalk-replace.html)<br>
[`clojure.walk/postwalk-replace` @ crossclj](http://crossclj.info/fun/clojure.walk.cljs/postwalk-replace.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.walk/postwalk-replace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.walk",
 :name "postwalk-replace",
 :signature ["[smap form]"],
 :name-encode "postwalk-replace",
 :history [["+" "0.0-927"]],
 :type "function",
 :clj-equiv {:full-name "clojure.walk/postwalk-replace",
             :url "http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/postwalk-replace"},
 :full-name-encode "clojure.walk/postwalk-replace",
 :source {:code "(defn postwalk-replace\n  [smap form]\n  (postwalk (fn [x] (if (contains? smap x) (smap x) x)) form))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/clojure/walk.cljs",
          :lines [90 96],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/clojure/walk.cljs#L90-L96"},
 :usage ["(postwalk-replace smap form)"],
 :full-name "clojure.walk/postwalk-replace",
 :docstring "Recursively transforms form by replacing keys in smap with their\nvalues.  Like clojure/replace but works on any data structure.  Does\nreplacement at the leaves of the tree first.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.walk/postwalk-replace.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.walk/postwalk-replace"]))
```

-->
