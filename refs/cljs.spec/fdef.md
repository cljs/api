## cljs.spec/fdef



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/fdef</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/fdef)
</td>
</tr>
</table>

<samp>(fdef fn-sym & {:keys \[args ret fn\], :as m})</samp><br>

---

 <samp>
(__fdef__ fn-sym & {:keys \[args ret fn\], :as m})<br>
</samp>

---





Source docstring:

```
Takes a symbol naming a function, and one or more of the following:

:args A regex spec for the function arguments as they were a list to be
  passed to apply - in this way, a single spec can handle functions with
  multiple arities
:ret A spec for the function's return value
:fn A spec of the relationship between args and ret - the
  value passed is {:args conformed-args :ret conformed-ret} and is
  expected to contain predicates that relate those values

Qualifies fn-sym with resolve, or using *ns* if no resolution found.
Registers specs in the global registry, where they can be retrieved
by calling fn-specs.

Once registered, function specs are included in doc, checked by
instrument, tested by the runner clojure.spec.test/run-tests, and (if
a macro) used to explain errors during macroexpansion.

Note that :fn specs require the presence of :args and :ret specs to
conform values, and so :fn specs will be ignored if :args or :ret
are missing.

Returns the qualified fn-sym.

For example, to register function specs for the symbol function:

(s/fdef clojure.core/symbol
  :args (s/alt :separate (s/cat :ns string? :n string?)
               :str string?
               :sym symbol?)
  :ret symbol?)
```


Source code @ [github]():

```clj
(defmacro fdef
  [fn-sym & {:keys [args ret fn] :as m}]
  (swap! _speced_vars conj (:name (resolve &env fn-sym)))
  (let [env &env
        qn  (ns-qualify env fn-sym)]
    `(do ~@(reduce
             (clojure.core/fn [defns role]
               (if (contains? m role)
                 (let [s (fn-spec-sym env qn (name role))]
                   (conj defns `(cljs.spec/def '~s ~(get m role))))
                 defns))
             [] [:args :ret :fn])
         '~qn)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/fdef` @ clojuredocs](http://clojuredocs.org/clojure.spec/fdef)<br>
[`clojure.spec/fdef` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/fdef/)<br>
[`clojure.spec/fdef` @ crossclj](http://crossclj.info/fun/clojure.spec/fdef.html)<br>
[`cljs.spec/fdef` @ crossclj](http://crossclj.info/fun/cljs.spec/fdef.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/fdef.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "fdef",
 :signature ["[fn-sym & {:keys [args ret fn], :as m}]"],
 :name-encode "fdef",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/fdef",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/fdef"},
 :full-name-encode "cljs.spec/fdef",
 :source {:code "(defmacro fdef\n  [fn-sym & {:keys [args ret fn] :as m}]\n  (swap! _speced_vars conj (:name (resolve &env fn-sym)))\n  (let [env &env\n        qn  (ns-qualify env fn-sym)]\n    `(do ~@(reduce\n             (clojure.core/fn [defns role]\n               (if (contains? m role)\n                 (let [s (fn-spec-sym env qn (name role))]\n                   (conj defns `(cljs.spec/def '~s ~(get m role))))\n                 defns))\n             [] [:args :ret :fn])\n         '~qn)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [296 339],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljc#L296-L339"},
 :usage ["(fdef fn-sym & {:keys [args ret fn], :as m})"],
 :full-name "cljs.spec/fdef",
 :docstring "Takes a symbol naming a function, and one or more of the following:\n\n:args A regex spec for the function arguments as they were a list to be\n  passed to apply - in this way, a single spec can handle functions with\n  multiple arities\n:ret A spec for the function's return value\n:fn A spec of the relationship between args and ret - the\n  value passed is {:args conformed-args :ret conformed-ret} and is\n  expected to contain predicates that relate those values\n\nQualifies fn-sym with resolve, or using *ns* if no resolution found.\nRegisters specs in the global registry, where they can be retrieved\nby calling fn-specs.\n\nOnce registered, function specs are included in doc, checked by\ninstrument, tested by the runner clojure.spec.test/run-tests, and (if\na macro) used to explain errors during macroexpansion.\n\nNote that :fn specs require the presence of :args and :ret specs to\nconform values, and so :fn specs will be ignored if :args or :ret\nare missing.\n\nReturns the qualified fn-sym.\n\nFor example, to register function specs for the symbol function:\n\n(s/fdef clojure.core/symbol\n  :args (s/alt :separate (s/cat :ns string? :n string?)\n               :str string?\n               :sym symbol?)\n  :ret symbol?)",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/fdef.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/fdef"]))
```

-->
