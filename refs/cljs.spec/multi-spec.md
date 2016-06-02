## cljs.spec/multi-spec



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/multi-spec</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/multi-spec)
</td>
</tr>
</table>

<samp>(multi-spec mm retag)</samp><br>

---

 <samp>
(__multi-spec__ mm retag)<br>
</samp>

---





Source docstring:

```
Takes the name of a spec/predicate-returning multimethod and a
tag-restoring keyword or fn (retag).  Returns a spec that when
conforming or explaining data will pass it to the multimethod to get
an appropriate spec. You can e.g. use multi-spec to dynamically and
extensibly associate specs with 'tagged' data (i.e. data where one
of the fields indicates the shape of the rest of the structure).

(defmulti mspec :tag)

The methods should ignore their argument and return a predicate/spec:
(defmethod mspec :int [_] (s/keys :req-un [::tag ::i]))

retag is used during generation to retag generated values with
matching tags. retag can either be a keyword, at which key the
dispatch-tag will be assoc'ed, or a fn of generated value and
dispatch-tag that should return an appropriately retagged value.

Note that because the tags themselves comprise an open set,
the tag key spec cannot enumerate the values, but can e.g.
test for keyword?.

Note also that the dispatch values of the multimethod will be
included in the path, i.e. in reporting and gen overrides, even
though those values are not evident in the spec.
```


Source code @ [github]():

```clj
(defmacro multi-spec
  [mm retag]
  `(cljs.spec/multi-spec-impl '~(res &env mm) (var ~mm) ~retag))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/multi-spec` @ clojuredocs](http://clojuredocs.org/clojure.spec/multi-spec)<br>
[`clojure.spec/multi-spec` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/multi-spec/)<br>
[`clojure.spec/multi-spec` @ crossclj](http://crossclj.info/fun/clojure.spec/multi-spec.html)<br>
[`cljs.spec/multi-spec` @ crossclj](http://crossclj.info/fun/cljs.spec/multi-spec.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/multi-spec.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "multi-spec",
 :signature ["[mm retag]"],
 :name-encode "multi-spec",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/multi-spec",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/multi-spec"},
 :full-name-encode "cljs.spec/multi-spec",
 :source {:code "(defmacro multi-spec\n  [mm retag]\n  `(cljs.spec/multi-spec-impl '~(res &env mm) (var ~mm) ~retag))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [62 89],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljc#L62-L89"},
 :usage ["(multi-spec mm retag)"],
 :full-name "cljs.spec/multi-spec",
 :docstring "Takes the name of a spec/predicate-returning multimethod and a\ntag-restoring keyword or fn (retag).  Returns a spec that when\nconforming or explaining data will pass it to the multimethod to get\nan appropriate spec. You can e.g. use multi-spec to dynamically and\nextensibly associate specs with 'tagged' data (i.e. data where one\nof the fields indicates the shape of the rest of the structure).\n\n(defmulti mspec :tag)\n\nThe methods should ignore their argument and return a predicate/spec:\n(defmethod mspec :int [_] (s/keys :req-un [::tag ::i]))\n\nretag is used during generation to retag generated values with\nmatching tags. retag can either be a keyword, at which key the\ndispatch-tag will be assoc'ed, or a fn of generated value and\ndispatch-tag that should return an appropriately retagged value.\n\nNote that because the tags themselves comprise an open set,\nthe tag key spec cannot enumerate the values, but can e.g.\ntest for keyword?.\n\nNote also that the dispatch values of the multimethod will be\nincluded in the path, i.e. in reporting and gen overrides, even\nthough those values are not evident in the spec.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/multi-spec.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/multi-spec"]))
```

-->
