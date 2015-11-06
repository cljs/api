## cljs.core/not=



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not=</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not=)
</td>
</tr>
</table>


 <samp>
(__not=__ x)<br>
</samp>
 <samp>
(__not=__ x y)<br>
</samp>
 <samp>
(__not=__ x y & more)<br>
</samp>

---

Returns the opposite of `=`.

Same as `(not (= x y))`



---


###### See Also:

[`cljs.core/=`](../cljs.core/EQ.md)<br>
[`cljs.core/not`](../cljs.core/not.md)<br>

---


Source docstring:

```
Same as (not (= obj1 obj2))
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1896/src/cljs/cljs/core.cljs#L2482-L2487):

```clj
(defn ^boolean not=
  ([x] false)
  ([x y] (not (= x y)))
  ([x y & more]
   (not (apply = x y more))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1896
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2482-2487](https://github.com/clojure/clojurescript/blob/r1896/src/cljs/cljs/core.cljs#L2482-L2487)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/not=` @ clojuredocs](http://clojuredocs.org/clojure.core/not=)<br>
[`clojure.core/not=` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/not%3D/)<br>
[`clojure.core/not=` @ crossclj](http://crossclj.info/fun/clojure.core/not%3D.html)<br>
[`cljs.core/not=` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/not%3D.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/notEQ.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the opposite of `=`.\n\nSame as `(not (= x y))`",
 :return-type boolean,
 :ns "cljs.core",
 :name "not=",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/=" "cljs.core/not"],
 :full-name-encode "cljs.core/notEQ",
 :source {:code "(defn ^boolean not=\n  ([x] false)\n  ([x y] (not (= x y)))\n  ([x y & more]\n   (not (apply = x y more))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1896",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2482 2487]},
 :full-name "cljs.core/not=",
 :clj-symbol "clojure.core/not=",
 :docstring "Same as (not (= obj1 obj2))"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/not="]))
```

-->
