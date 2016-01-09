## #() function



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>

<samp>#(...)</samp><br>

---


Shorthand for creating an anonymous function:

`#(...)` = `(fn [args] (...))`

Use the following to access the implicit function arguments:

- `%` or `%1` for first argument.
- `%2`, `%3` and so on for subsequent arguments
- `%&` for the rest of the arguments after the highest individually referenced argument

Note that `#(1)` does not create a function that returns `1`, for the same
reason that `(1)` does evaluate to `1`.

`#()` forms cannot be nested, since this would create an ambiguity between the
automatically assigned `%` argument names.



---

###### Examples:

```clj
(map #(* 2 %) [1 2 3])
;;=> (2 4 6)

(def f #(println %1 %2 %&))
(f 1 2 3 4 5)
;; prints: 1 2 (3 4 5)
```



---

###### See Also:

[`% arg`](../syntax/arg.md)<br>
[`cljs.core/fn`](../cljs.core/fn.md)<br>
[`cljs.core/defn`](../cljs.core/defn.md)<br>
[`cljs.core/partial`](../cljs.core/partial.md)<br>

---





Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha1/src/main/clojure/clojure/tools/reader.clj#L524-L543):

```clj
(defn- read-fn
  [rdr _ opts pending-forms]
  (if (thread-bound? #'arg-env)
    (throw (IllegalStateException. "Nested #()s are not allowed")))
  (binding [arg-env (sorted-map)]
    (let [form (read* (doto rdr (unread \()) true nil opts pending-forms) ;; this sets bindings
          rargs (rseq arg-env)
          args (if rargs
                 (let [higharg (key (first rargs))]
                   (let [args (loop [i 1 args (transient [])]
                                (if (> i higharg)
                                  (persistent! args)
                                  (recur (inc i) (conj! args (or (get arg-env i)
                                                                 (garg i))))))
                         args (if (arg-env -1)
                                (conj args '& (arg-env -1))
                                args)]
                     args))
                 [])]
      (list 'fn* args form))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-1.0.0-alpha1
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:524-543](https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha1/src/main/clojure/clojure/tools/reader.clj#L524-L543)</ins>
</pre>
-->

---
Reader table @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha1/src/main/clojure/clojure/tools/reader.clj#L764-L776):

```clj
(defn- dispatch-macros [ch]
  (case ch
    \^ read-meta                ;deprecated
    \' (wrapping-reader 'var)
    \( read-fn
    \= read-eval
    \{ read-set
    \< (throwing-reader "Unreadable form")
    \" read-regex
    \! read-comment
    \_ read-discard
    \? read-cond
    nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-1.0.0-alpha1
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:764-776](https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha1/src/main/clojure/clojure/tools/reader.clj#L764-L776)</ins>
</pre>
-->

---



 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/function.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Shorthand for creating an anonymous function:\n\n`#(...)` = `(fn [args] (...))`\n\nUse the following to access the implicit function arguments:\n\n- `%` or `%1` for first argument.\n- `%2`, `%3` and so on for subsequent arguments\n- `%&` for the rest of the arguments after the highest individually referenced argument\n\nNote that `#(1)` does not create a function that returns `1`, for the same\nreason that `(1)` does evaluate to `1`.\n\n`#()` forms cannot be nested, since this would create an ambiguity between the\nautomatically assigned `%` argument names.",
 :ns "syntax",
 :name "function",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/arg"
           "cljs.core/fn"
           "cljs.core/defn"
           "cljs.core/partial"],
 :full-name-encode "syntax/function",
 :extra-sources ({:code "(defn- read-fn\n  [rdr _ opts pending-forms]\n  (if (thread-bound? #'arg-env)\n    (throw (IllegalStateException. \"Nested #()s are not allowed\")))\n  (binding [arg-env (sorted-map)]\n    (let [form (read* (doto rdr (unread \\()) true nil opts pending-forms) ;; this sets bindings\n          rargs (rseq arg-env)\n          args (if rargs\n                 (let [higharg (key (first rargs))]\n                   (let [args (loop [i 1 args (transient [])]\n                                (if (> i higharg)\n                                  (persistent! args)\n                                  (recur (inc i) (conj! args (or (get arg-env i)\n                                                                 (garg i))))))\n                         args (if (arg-env -1)\n                                (conj args '& (arg-env -1))\n                                args)]\n                     args))\n                 [])]\n      (list 'fn* args form))))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-alpha1",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [524 543]}
                 {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    \\? read-cond\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-alpha1",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [764 776]}),
 :usage ["#(...)"],
 :examples [{:id "6a87de",
             :content "```clj\n(map #(* 2 %) [1 2 3])\n;;=> (2 4 6)\n\n(def f #(println %1 %2 %&))\n(f 1 2 3 4 5)\n;; prints: 1 2 (3 4 5)\n```"}],
 :full-name "syntax/function",
 :display "#() function",
 :clj-doc "http://clojure.org/reader#toc2"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/function"]))
```

-->
