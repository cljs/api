## cljs.core/aclone



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/aclone</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aclone)
</td>
</tr>
</table>


 <samp>
(__aclone__ arr)<br>
</samp>

---

Creates a clone of the given JavaScript array `arr`.  The result is a new
JavaScript array, which is a shallow copy, not a deep copy.



---

###### Examples:

```clj
(def a #js [1 2 3])
(def b (aclone a))
(aset b 0 4)

a
;;=> #js [1 2 3]

b
;;=> #js [4 2 3]
```



---

###### See Also:

[`cljs.core/array`](../cljs.core/array.md)<br>
[`cljs.core/make-array`](../cljs.core/make-array.md)<br>

---


Source docstring:

```
Returns a javascript array, cloned from the passed in array
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L246-L253):

```clj
(defn aclone
  [arr]
  (let [len (alength arr)
        new-arr (make-array len)]
    (dotimes [i len]
      (aset new-arr i (aget arr i)))
    new-arr))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:246-253](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L246-L253)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/aclone` @ clojuredocs](http://clojuredocs.org/clojure.core/aclone)<br>
[`clojure.core/aclone` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/aclone/)<br>
[`clojure.core/aclone` @ crossclj](http://crossclj.info/fun/clojure.core/aclone.html)<br>
[`cljs.core/aclone` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/aclone.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/aclone.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Creates a clone of the given JavaScript array `arr`.  The result is a new\nJavaScript array, which is a shallow copy, not a deep copy.",
 :ns "cljs.core",
 :name "aclone",
 :signature ["[arr]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/array" "cljs.core/make-array"],
 :full-name-encode "cljs.core/aclone",
 :source {:code "(defn aclone\n  [arr]\n  (let [len (alength arr)\n        new-arr (make-array len)]\n    (dotimes [i len]\n      (aset new-arr i (aget arr i)))\n    new-arr))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/cljs/core.cljs",
          :lines [246 253]},
 :examples [{:id "422c4e",
             :content "```clj\n(def a #js [1 2 3])\n(def b (aclone a))\n(aset b 0 4)\n\na\n;;=> #js [1 2 3]\n\nb\n;;=> #js [4 2 3]\n```"}],
 :full-name "cljs.core/aclone",
 :clj-symbol "clojure.core/aclone",
 :docstring "Returns a javascript array, cloned from the passed in array"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/aclone"]))
```

-->
