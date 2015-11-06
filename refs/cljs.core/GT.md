## cljs.core/>



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/></samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/%3E)
</td>
</tr>
</table>


 <samp>
(__>__ x)<br>
</samp>
 <samp>
(__>__ x y)<br>
</samp>
 <samp>
(__>__ x y & more)<br>
</samp>

---

Returns true if each successive number argument is less than the previous
one, false otherwise.



---

###### Examples:

```clj
(> 1 2)
;;=> false

(> 2 1)
;;=> true

(> 2 2)
;;=> false

(> 6 5 4 3 2)
;;=> true
```



---

###### See Also:

[`cljs.core/>=`](../cljs.core/GTEQ.md)<br>

---


Source docstring:

```
Returns non-nil if nums are in monotonically decreasing order,
otherwise false.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L1257-L1267):

```clj
(defn ^boolean >
  ([x] true)
  ([x y] (cljs.core/> x y))
  ([x y & more]
   (if (cljs.core/> x y)
     (if (next more)
       (recur y (first more) (next more))
       (cljs.core/> y (first more)))
     false)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1257-1267](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L1257-L1267)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/core.clj#L253-L256):

```clj
(defmacro >
  ([x] true)
  ([x y] (bool-expr (list 'js* "(~{} > ~{})" x y)))
  ([x y & more] `(and (> ~x ~y) (> ~y ~@more))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1535
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:253-256](https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/core.clj#L253-L256)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/>` @ clojuredocs](http://clojuredocs.org/clojure.core/>)<br>
[`clojure.core/>` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/%3E/)<br>
[`clojure.core/>` @ crossclj](http://crossclj.info/fun/clojure.core/%3E.html)<br>
[`cljs.core/>` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/%3E.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/GT.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if each successive number argument is less than the previous\none, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name ">",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/>="],
 :full-name-encode "cljs.core/GT",
 :source {:code "(defn ^boolean >\n  ([x] true)\n  ([x y] (cljs.core/> x y))\n  ([x y & more]\n   (if (cljs.core/> x y)\n     (if (next more)\n       (recur y (first more) (next more))\n       (cljs.core/> y (first more)))\n     false)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1535",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1257 1267]},
 :extra-sources [{:code "(defmacro >\n  ([x] true)\n  ([x y] (bool-expr (list 'js* \"(~{} > ~{})\" x y)))\n  ([x y & more] `(and (> ~x ~y) (> ~y ~@more))))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1535",
                  :filename "src/clj/cljs/core.clj",
                  :lines [253 256]}],
 :examples [{:id "67180c",
             :content "```clj\n(> 1 2)\n;;=> false\n\n(> 2 1)\n;;=> true\n\n(> 2 2)\n;;=> false\n\n(> 6 5 4 3 2)\n;;=> true\n```"}],
 :full-name "cljs.core/>",
 :clj-symbol "clojure.core/>",
 :docstring "Returns non-nil if nums are in monotonically decreasing order,\notherwise false."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/>"]))
```

-->