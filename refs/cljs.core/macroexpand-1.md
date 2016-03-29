## cljs.core/macroexpand-1



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3165"><img valign="middle" alt="[+] 0.0-3165" title="Added in 0.0-3165" src="https://img.shields.io/badge/+-0.0--3165-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/macroexpand-1</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/macroexpand-1)
</td>
</tr>
</table>

<samp>(macroexpand-1 quoted)</samp><br>

---

 <samp>
(__macroexpand-1__ quoted)<br>
</samp>

---

(only intended as a REPL utility)

If the given quoted form is a macro call, expand it once. NOTE: subforms are
_not_ expanded.

See [`macroexpand`][doc:cljs.core/macroexpand] if you wish to repeatedly expand a form.

[doc:cljs.core/macroexpand]:../cljs.core/macroexpand.md

---

###### Examples:

See how `(-> 2 inc)` is progressively expanded:

```clj
(macroexpand-1 '(-> 2 inc))
;;=> (inc 2)

(macroexpand-1 '(inc 2))
;;=> (cljs.core/+ 2 1)

(macroexpand-1 '(cljs.core/+ 2 1))
;;=> (js* "(~{} + ~{})" 2 1)
```

Notice how the nested `inc` form is not expanded:

```clj
(macroexpand-1 '(inc (inc 2)))
;;=> (cljs.core/+ (inc 2) 1)
```



---

###### See Also:

[`cljs.core/macroexpand`](../cljs.core/macroexpand.md)<br>
[`cljs.core/defmacro`](../cljs.core/defmacro.md)<br>

---


Source docstring:

```
If form represents a macro form, returns its expansion,
else returns form.
```


Source code @ [github]():

```clj
(core/defmacro macroexpand-1
  [quoted]
  (core/assert (core/= (core/first quoted) 'quote)
    "Argument to macroexpand-1 must be quoted")
  (core/let [form (second quoted)]
    `(quote ~(ana/macroexpand-1 &env form))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/macroexpand-1` @ clojuredocs](http://clojuredocs.org/clojure.core/macroexpand-1)<br>
[`clojure.core/macroexpand-1` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/macroexpand-1/)<br>
[`clojure.core/macroexpand-1` @ crossclj](http://crossclj.info/fun/clojure.core/macroexpand-1.html)<br>
[`cljs.core/macroexpand-1` @ crossclj](http://crossclj.info/fun/cljs.core/macroexpand-1.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/macroexpand-1.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "(only intended as a REPL utility)\n\nIf the given quoted form is a macro call, expand it once. NOTE: subforms are\n_not_ expanded.\n\nSee [doc:cljs.core/macroexpand] if you wish to repeatedly expand a form.",
 :ns "cljs.core",
 :name "macroexpand-1",
 :signature ["[quoted]"],
 :name-encode "macroexpand-1",
 :history [["+" "0.0-3165"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.core/macroexpand-1",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/macroexpand-1"},
 :related ["cljs.core/macroexpand" "cljs.core/defmacro"],
 :full-name-encode "cljs.core/macroexpand-1",
 :source {:code "(core/defmacro macroexpand-1\n  [quoted]\n  (core/assert (core/= (core/first quoted) 'quote)\n    \"Argument to macroexpand-1 must be quoted\")\n  (core/let [form (second quoted)]\n    `(quote ~(ana/macroexpand-1 &env form))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [2679 2686],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/core.cljc#L2679-L2686"},
 :usage ["(macroexpand-1 quoted)"],
 :examples [{:id "1bc6af",
             :content "See how `(-> 2 inc)` is progressively expanded:\n\n```clj\n(macroexpand-1 '(-> 2 inc))\n;;=> (inc 2)\n\n(macroexpand-1 '(inc 2))\n;;=> (cljs.core/+ 2 1)\n\n(macroexpand-1 '(cljs.core/+ 2 1))\n;;=> (js* \"(~{} + ~{})\" 2 1)\n```\n\nNotice how the nested `inc` form is not expanded:\n\n```clj\n(macroexpand-1 '(inc (inc 2)))\n;;=> (cljs.core/+ (inc 2) 1)\n```"}],
 :full-name "cljs.core/macroexpand-1",
 :docstring "If form represents a macro form, returns its expansion,\nelse returns form.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/macroexpand-1.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/macroexpand-1"]))
```

-->
