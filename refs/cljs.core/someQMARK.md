## cljs.core/some?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" title="Added in 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/some?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/some?)
</td>
</tr>
</table>


 <samp>
(__some?__ x)<br>
</samp>

---

Returns true if `x` is not nil, false otherwise.



---


###### See Also:

[`cljs.core/true?`](../cljs.core/trueQMARK.md)<br>
[`cljs.core/nil?`](../cljs.core/nilQMARK.md)<br>

---


Source docstring:

```
Returns true if x is not nil, false otherwise.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2301/src/cljs/cljs/core.cljs#L98-L100):

```clj
(defn ^boolean some?
  [x] (not (nil? x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2301
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:98-100](https://github.com/clojure/clojurescript/blob/r2301/src/cljs/cljs/core.cljs#L98-L100)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/some?` @ clojuredocs](http://clojuredocs.org/clojure.core/some_q)<br>
[`clojure.core/some?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/some%3F/)<br>
[`clojure.core/some?` @ crossclj](http://crossclj.info/fun/clojure.core/some%3F.html)<br>
[`cljs.core/some?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/some%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/someQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` is not nil, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "some?",
 :signature ["[x]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :related ["cljs.core/true?" "cljs.core/nil?"],
 :full-name-encode "cljs.core/someQMARK",
 :source {:code "(defn ^boolean some?\n  [x] (not (nil? x)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2301",
          :filename "src/cljs/cljs/core.cljs",
          :lines [98 100]},
 :full-name "cljs.core/some?",
 :clj-symbol "clojure.core/some?",
 :docstring "Returns true if x is not nil, false otherwise."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/some?"]))
```

-->
