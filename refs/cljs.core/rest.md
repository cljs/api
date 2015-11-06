## cljs.core/rest



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rest</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rest)
</td>
</tr>
</table>


 <samp>
(__rest__ coll)<br>
</samp>

---

Returns a possibly empty sequence of the items after the first item.

Calls `seq` on its argument.



---

###### Examples:

```clj
(rest [1 2 3])
;;=> (2 3)

(rest [1 2])
;;=> (2)

(rest [1])
;;=> ()

(rest [])
;;=> ()
```



---

###### See Also:

[`cljs.core/next`](../cljs.core/next.md)<br>
[`cljs.core/first`](../cljs.core/first.md)<br>
[`cljs.core/drop`](../cljs.core/drop.md)<br>
[`cljs.core/pop`](../cljs.core/pop.md)<br>

---


Source docstring:

```
Returns a possibly empty seq of the items after the first. Calls seq on its
argument.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2758/src/cljs/cljs/core.cljs#L736-L747):

```clj
(defn ^seq rest
  [coll]
  (if-not (nil? coll)
    (if (implements? ISeq coll)
      (-rest ^not-native coll)
      (let [s (seq coll)]
        (if s
          (-rest ^not-native s)
          ())))
    ()))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2758
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:736-747](https://github.com/clojure/clojurescript/blob/r2758/src/cljs/cljs/core.cljs#L736-L747)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/rest` @ clojuredocs](http://clojuredocs.org/clojure.core/rest)<br>
[`clojure.core/rest` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/rest/)<br>
[`clojure.core/rest` @ crossclj](http://crossclj.info/fun/clojure.core/rest.html)<br>
[`cljs.core/rest` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/rest.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/rest.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a possibly empty sequence of the items after the first item.\n\nCalls `seq` on its argument.",
 :return-type seq,
 :ns "cljs.core",
 :name "rest",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/next"
           "cljs.core/first"
           "cljs.core/drop"
           "cljs.core/pop"],
 :full-name-encode "cljs.core/rest",
 :source {:code "(defn ^seq rest\n  [coll]\n  (if-not (nil? coll)\n    (if (implements? ISeq coll)\n      (-rest ^not-native coll)\n      (let [s (seq coll)]\n        (if s\n          (-rest ^not-native s)\n          ())))\n    ()))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2758",
          :filename "src/cljs/cljs/core.cljs",
          :lines [736 747]},
 :examples [{:id "0869af",
             :content "```clj\n(rest [1 2 3])\n;;=> (2 3)\n\n(rest [1 2])\n;;=> (2)\n\n(rest [1])\n;;=> ()\n\n(rest [])\n;;=> ()\n```"}],
 :full-name "cljs.core/rest",
 :clj-symbol "clojure.core/rest",
 :docstring "Returns a possibly empty seq of the items after the first. Calls seq on its\nargument."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/rest"]))
```

-->
