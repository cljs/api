## cljs.core/list\*



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/list\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/list*)
</td>
</tr>
</table>


 <samp>
(__list\*__ args)<br>
</samp>
 <samp>
(__list\*__ a args)<br>
</samp>
 <samp>
(__list\*__ a b args)<br>
</samp>
 <samp>
(__list\*__ a b c args)<br>
</samp>
 <samp>
(__list\*__ a b c d & more)<br>
</samp>

---

Creates a new list containing the items prepended to the rest, the last of which
will be treated as a sequence.



---


###### See Also:

[`cljs.core/list`](../cljs.core/list.md)<br>

---


Source docstring:

```
Creates a new list containing the items prepended to the rest, the
last of which will be treated as a sequence.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/cljs/core.cljs#L2386-L2394):

```clj
(defn list*
  ([args] (seq args))
  ([a args] (cons a args))
  ([a b args] (cons a (cons b args)))
  ([a b c args] (cons a (cons b (cons c args))))
  ([a b c d & more]
     (cons a (cons b (cons c (cons d (spread more)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1886
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2386-2394](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/cljs/core.cljs#L2386-L2394)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/list*` @ clojuredocs](http://clojuredocs.org/clojure.core/list*)<br>
[`clojure.core/list*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/list*/)<br>
[`clojure.core/list*` @ crossclj](http://crossclj.info/fun/clojure.core/list*.html)<br>
[`cljs.core/list*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/list*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/listSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Creates a new list containing the items prepended to the rest, the last of which\nwill be treated as a sequence.",
 :ns "cljs.core",
 :name "list*",
 :signature ["[args]"
             "[a args]"
             "[a b args]"
             "[a b c args]"
             "[a b c d & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/list"],
 :full-name-encode "cljs.core/listSTAR",
 :source {:code "(defn list*\n  ([args] (seq args))\n  ([a args] (cons a args))\n  ([a b args] (cons a (cons b args)))\n  ([a b c args] (cons a (cons b (cons c args))))\n  ([a b c d & more]\n     (cons a (cons b (cons c (cons d (spread more)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1886",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2386 2394]},
 :full-name "cljs.core/list*",
 :clj-symbol "clojure.core/list*",
 :docstring "Creates a new list containing the items prepended to the rest, the\nlast of which will be treated as a sequence."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/list*"]))
```

-->
