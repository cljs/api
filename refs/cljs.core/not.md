## cljs.core/not



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not)
</td>
</tr>
</table>


 <samp>
(__not__ x)<br>
</samp>

---

Returns true if `x` is logical false, false otherwise.



---


###### See Also:

[`cljs.core/complement`](../cljs.core/complement.md)<br>
[`cljs.core/false?`](../cljs.core/falseQMARK.md)<br>

---


Source docstring:

```
Returns true if x is logical false, false otherwise.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3030/src/cljs/cljs/core.cljs#L108-L110):

```clj
(defn ^boolean not
  [x] (if x false true))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:108-110](https://github.com/clojure/clojurescript/blob/r3030/src/cljs/cljs/core.cljs#L108-L110)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/not` @ clojuredocs](http://clojuredocs.org/clojure.core/not)<br>
[`clojure.core/not` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/not/)<br>
[`clojure.core/not` @ crossclj](http://crossclj.info/fun/clojure.core/not.html)<br>
[`cljs.core/not` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/not.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/not.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` is logical false, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "not",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/complement" "cljs.core/false?"],
 :full-name-encode "cljs.core/not",
 :source {:code "(defn ^boolean not\n  [x] (if x false true))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [108 110]},
 :full-name "cljs.core/not",
 :clj-symbol "clojure.core/not",
 :docstring "Returns true if x is logical false, false otherwise."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/not"]))
```

-->
