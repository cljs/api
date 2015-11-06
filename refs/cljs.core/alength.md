## cljs.core/alength



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/alength</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/alength)
</td>
</tr>
</table>


 <samp>
(__alength__ a)<br>
</samp>

---

For interop, it returns the length of a JavaScript array or string.



---

###### Examples:

```clj
(def a #js [1 2 3])

(alength a)
;;=> 3

(.-length a)
;;=> 3

(aget a "length")
;;=> 3

(count a)
;;=> 3
```



---

###### See Also:

[`cljs.core/count`](../cljs.core/count.md)<br>

---


Source docstring:

```
Returns the length of the array. Works on arrays of all types.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L188-L191):

```clj
(defn ^number alength
  [array]
  (cljs.core/alength array))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2280
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:188-191](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L188-L191)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2280/src/clj/cljs/core.clj#L1470-L1473):

```clj
(defmacro alength [a]
  (vary-meta
    (core/list 'js* "~{}.length" a)
    assoc :tag 'number))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2280
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1470-1473](https://github.com/clojure/clojurescript/blob/r2280/src/clj/cljs/core.clj#L1470-L1473)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/alength` @ clojuredocs](http://clojuredocs.org/clojure.core/alength)<br>
[`clojure.core/alength` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/alength/)<br>
[`clojure.core/alength` @ crossclj](http://crossclj.info/fun/clojure.core/alength.html)<br>
[`cljs.core/alength` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/alength.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/alength.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "For interop, it returns the length of a JavaScript array or string.",
 :return-type number,
 :ns "cljs.core",
 :name "alength",
 :signature ["[a]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/count"],
 :full-name-encode "cljs.core/alength",
 :source {:code "(defn ^number alength\n  [array]\n  (cljs.core/alength array))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/cljs/cljs/core.cljs",
          :lines [188 191]},
 :extra-sources [{:code "(defmacro alength [a]\n  (vary-meta\n    (core/list 'js* \"~{}.length\" a)\n    assoc :tag 'number))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2280",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1470 1473]}],
 :examples [{:id "26f79f",
             :content "```clj\n(def a #js [1 2 3])\n\n(alength a)\n;;=> 3\n\n(.-length a)\n;;=> 3\n\n(aget a \"length\")\n;;=> 3\n\n(count a)\n;;=> 3\n```"}],
 :full-name "cljs.core/alength",
 :clj-symbol "clojure.core/alength",
 :docstring "Returns the length of the array. Works on arrays of all types."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/alength"]))
```

-->
