## cljs.core/boolean



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/boolean</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/boolean)
</td>
</tr>
</table>


 <samp>
(__boolean__ x)<br>
</samp>

---

Return `false` if `x` is false or nil.  Otherwise return `true`.  This is the
truthiness condition used by `if` expressions.



---

###### Examples:

```clj
(boolean 1)
;;=> true

(boolean 0)
;;=> true

(boolean nil)
;;=> false
```



---

###### See Also:

[`if`](../special/if.md)<br>

---




Source code @ [github](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L1030-L1031):

```clj
(defn ^boolean boolean [x]
  (if x true false))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1030-1031](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L1030-L1031)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/boolean` @ clojuredocs](http://clojuredocs.org/clojure.core/boolean)<br>
[`clojure.core/boolean` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/boolean/)<br>
[`clojure.core/boolean` @ crossclj](http://crossclj.info/fun/clojure.core/boolean.html)<br>
[`cljs.core/boolean` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/boolean.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/boolean.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Return `false` if `x` is false or nil.  Otherwise return `true`.  This is the\ntruthiness condition used by `if` expressions.",
 :return-type boolean,
 :ns "cljs.core",
 :name "boolean",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["special/if"],
 :full-name-encode "cljs.core/boolean",
 :source {:code "(defn ^boolean boolean [x]\n  (if x true false))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1030 1031]},
 :examples [{:id "9edf3a",
             :content "```clj\n(boolean 1)\n;;=> true\n\n(boolean 0)\n;;=> true\n\n(boolean nil)\n;;=> false\n```"}],
 :full-name "cljs.core/boolean",
 :clj-symbol "clojure.core/boolean"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/boolean"]))
```

-->
