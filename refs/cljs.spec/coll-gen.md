## cljs.spec/coll-gen



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/coll-gen</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/coll-gen)
</td>
</tr>
</table>

<samp>(coll-gen pred init-coll)</samp><br>

---

 <samp>
(__coll-gen__ pred init-coll)<br>
</samp>

---





Source docstring:

```
returns a function of no args that returns a generator of
collections of items conforming to pred, with the same shape as
init-coll
```


Source code @ [github]():

```clj
(defn coll-gen
  [pred init-coll]
  (let [init (empty init-coll)]
    (fn []
      (gen/fmap
        #(if (vector? init) % (into init %))
        (gen/vector (gen pred))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/coll-gen` @ clojuredocs](http://clojuredocs.org/clojure.spec/coll-gen)<br>
[`clojure.spec/coll-gen` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/coll-gen/)<br>
[`clojure.spec/coll-gen` @ crossclj](http://crossclj.info/fun/clojure.spec/coll-gen.html)<br>
[`cljs.spec/coll-gen` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/coll-gen.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/coll-gen.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "coll-gen",
 :signature ["[pred init-coll]"],
 :name-encode "coll-gen",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec/coll-gen",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/coll-gen"},
 :full-name-encode "cljs.spec/coll-gen",
 :source {:code "(defn coll-gen\n  [pred init-coll]\n  (let [init (empty init-coll)]\n    (fn []\n      (gen/fmap\n        #(if (vector? init) % (into init %))\n        (gen/vector (gen pred))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [1045 1054],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljs#L1045-L1054"},
 :usage ["(coll-gen pred init-coll)"],
 :full-name "cljs.spec/coll-gen",
 :docstring "returns a function of no args that returns a generator of\ncollections of items conforming to pred, with the same shape as\ninit-coll",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/coll-gen.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/coll-gen"]))
```

-->
