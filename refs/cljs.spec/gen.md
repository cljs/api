## cljs.spec/gen



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/gen</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/gen)
</td>
</tr>
</table>

<samp>(gen spec)</samp><br>
<samp>(gen spec overrides)</samp><br>

---

 <samp>
(__gen__ spec)<br>
</samp>
 <samp>
(__gen__ spec overrides)<br>
</samp>

---





Source docstring:

```
Given a spec, returns the generator for it, or throws if none can
be constructed. Optionally an overrides map can be provided which
should map paths (vectors of keywords) to generators. These will be
used instead of the generators at those paths. Note that parent
generator (in the spec or overrides map) will supersede those of any
subtrees. A generator for a regex op must always return a
sequential collection (i.e. a generator for s/? should return either
an empty sequence/vector or a sequence/vector with one item in it)
```


Source code @ [github]():

```clj
(defn gen
  ([spec] (gen spec nil))
  ([spec overrides] (gensub spec overrides [] {::recursion-limit *recursion-limit*} spec)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/gen` @ clojuredocs](http://clojuredocs.org/clojure.spec/gen)<br>
[`clojure.spec/gen` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/gen/)<br>
[`clojure.spec/gen` @ crossclj](http://crossclj.info/fun/clojure.spec/gen.html)<br>
[`cljs.spec/gen` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/gen.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/gen.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "gen",
 :signature ["[spec]" "[spec overrides]"],
 :name-encode "gen",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec/gen",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/gen"},
 :full-name-encode "cljs.spec/gen",
 :source {:code "(defn gen\n  ([spec] (gen spec nil))\n  ([spec overrides] (gensub spec overrides [] {::recursion-limit *recursion-limit*} spec)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [210 220],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljs#L210-L220"},
 :usage ["(gen spec)" "(gen spec overrides)"],
 :full-name "cljs.spec/gen",
 :docstring "Given a spec, returns the generator for it, or throws if none can\nbe constructed. Optionally an overrides map can be provided which\nshould map paths (vectors of keywords) to generators. These will be\nused instead of the generators at those paths. Note that parent\ngenerator (in the spec or overrides map) will supersede those of any\nsubtrees. A generator for a regex op must always return a\nsequential collection (i.e. a generator for s/? should return either\nan empty sequence/vector or a sequence/vector with one item in it)",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/gen.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/gen"]))
```

-->
