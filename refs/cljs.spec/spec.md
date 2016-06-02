## cljs.spec/spec



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/spec</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/spec)
</td>
</tr>
</table>

<samp>(spec form & {:keys \[gen\]})</samp><br>

---

 <samp>
(__spec__ form & {:keys \[gen\]})<br>
</samp>

---





Source docstring:

```
Takes a single predicate form, e.g. can be the name of a predicate,
like even?, or a fn literal like #(< % 42). Note that it is not
generally necessary to wrap predicates in spec when using the rest
of the spec macros, only to attach a unique generator

Can also be passed the result of one of the regex ops -
cat, alt, *, +, ?, in which case it will return a regex-conforming
spec, useful when nesting an independent regex.
---

Optionally takes :gen generator-fn, which must be a fn of no args that
returns a test.check generator.

Returns a spec.
```


Source code @ [github]():

```clj
(defmacro spec
  [form & {:keys [gen]}]
  `(cljs.spec/spec-impl '~(res &env form) ~form ~gen nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/spec` @ clojuredocs](http://clojuredocs.org/clojure.spec/spec)<br>
[`clojure.spec/spec` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/spec/)<br>
[`clojure.spec/spec` @ crossclj](http://crossclj.info/fun/clojure.spec/spec.html)<br>
[`cljs.spec/spec` @ crossclj](http://crossclj.info/fun/cljs.spec/spec.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/spec.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "spec",
 :signature ["[form & {:keys [gen]}]"],
 :name-encode "spec",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/spec",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/spec"},
 :full-name-encode "cljs.spec/spec",
 :source {:code "(defmacro spec\n  [form & {:keys [gen]}]\n  `(cljs.spec/spec-impl '~(res &env form) ~form ~gen nil))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [44 60],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljc#L44-L60"},
 :usage ["(spec form & {:keys [gen]})"],
 :full-name "cljs.spec/spec",
 :docstring "Takes a single predicate form, e.g. can be the name of a predicate,\nlike even?, or a fn literal like #(< % 42). Note that it is not\ngenerally necessary to wrap predicates in spec when using the rest\nof the spec macros, only to attach a unique generator\n\nCan also be passed the result of one of the regex ops -\ncat, alt, *, +, ?, in which case it will return a regex-conforming\nspec, useful when nesting an independent regex.\n---\n\nOptionally takes :gen generator-fn, which must be a fn of no args that\nreturns a test.check generator.\n\nReturns a spec.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/spec.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/spec"]))
```

-->
