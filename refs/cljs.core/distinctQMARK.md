## cljs.core/distinct?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/distinct?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/distinct?)
</td>
</tr>
</table>


 <samp>
(__distinct?__ x)<br>
</samp>
 <samp>
(__distinct?__ x y)<br>
</samp>
 <samp>
(__distinct?__ x y & more)<br>
</samp>

---

Returns true if no two of the arguments are `=`



---

###### Examples:

```clj
(distinct? 1)
;;=> true

(distinct? 1 2)
;;=> true

(distinct? 1 1)
;;=> false

(distinct? 1 2 3)
;;=> true

(distinct? 1 2 1)
;;=> false
```

Apply it a collection:

```clj
(apply distinct? [1 2 3])
;;=> true

(apply distinct? [1 2 1])
;;=> false
```



---

###### See Also:

[`cljs.core/distinct`](../cljs.core/distinct.md)<br>

---


Source docstring:

```
Returns true if no two of the arguments are =
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L1904-L1918):

```clj
(defn ^boolean distinct?
  ([x] true)
  ([x y] (not (= x y)))
  ([x y & more]
     (if (not (= x y))
     (loop [s #{x y} xs more]
       (let [x (first xs)
             etc (next xs)]
         (if xs
           (if (contains? s x)
             false
             (recur (conj s x) etc))
           true)))
     false)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1904-1918](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L1904-L1918)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/distinct?` @ clojuredocs](http://clojuredocs.org/clojure.core/distinct_q)<br>
[`clojure.core/distinct?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/distinct%3F/)<br>
[`clojure.core/distinct?` @ crossclj](http://crossclj.info/fun/clojure.core/distinct%3F.html)<br>
[`cljs.core/distinct?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/distinct%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/distinctQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if no two of the arguments are `=`",
 :return-type boolean,
 :ns "cljs.core",
 :name "distinct?",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/distinct"],
 :full-name-encode "cljs.core/distinctQMARK",
 :source {:code "(defn ^boolean distinct?\n  ([x] true)\n  ([x y] (not (= x y)))\n  ([x y & more]\n     (if (not (= x y))\n     (loop [s #{x y} xs more]\n       (let [x (first xs)\n             etc (next xs)]\n         (if xs\n           (if (contains? s x)\n             false\n             (recur (conj s x) etc))\n           true)))\n     false)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1904 1918]},
 :examples [{:id "b32799",
             :content "```clj\n(distinct? 1)\n;;=> true\n\n(distinct? 1 2)\n;;=> true\n\n(distinct? 1 1)\n;;=> false\n\n(distinct? 1 2 3)\n;;=> true\n\n(distinct? 1 2 1)\n;;=> false\n```\n\nApply it a collection:\n\n```clj\n(apply distinct? [1 2 3])\n;;=> true\n\n(apply distinct? [1 2 1])\n;;=> false\n```"}],
 :full-name "cljs.core/distinct?",
 :clj-symbol "clojure.core/distinct?",
 :docstring "Returns true if no two of the arguments are ="}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/distinct?"]))
```

-->
