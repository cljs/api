## cljs.core/deref



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/deref</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/deref)
</td>
</tr>
</table>


 <samp>
(__deref__ x)<br>
</samp>

---

Returns the current value of atom `x`.

The `@` reader macro is often used instead of `deref`. `@foo` is the same thing
as `(deref foo)`.



---


###### See Also:

[`cljs.core/atom`](../cljs.core/atom.md)<br>

---




Source code @ [github](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L851-L853):

```clj
(defn deref
  [o]
  (-deref o))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2505
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:851-853](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L851-L853)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/deref` @ clojuredocs](http://clojuredocs.org/clojure.core/deref)<br>
[`clojure.core/deref` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/deref/)<br>
[`clojure.core/deref` @ crossclj](http://crossclj.info/fun/clojure.core/deref.html)<br>
[`cljs.core/deref` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/deref.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/deref.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the current value of atom `x`.\n\nThe `@` reader macro is often used instead of `deref`. `@foo` is the same thing\nas `(deref foo)`.",
 :ns "cljs.core",
 :name "deref",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/atom"],
 :full-name-encode "cljs.core/deref",
 :source {:code "(defn deref\n  [o]\n  (-deref o))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2505",
          :filename "src/cljs/cljs/core.cljs",
          :lines [851 853]},
 :full-name "cljs.core/deref",
 :clj-symbol "clojure.core/deref"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/deref"]))
```

-->
