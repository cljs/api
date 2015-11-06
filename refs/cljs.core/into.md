## cljs.core/into



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/into</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/into)
</td>
</tr>
</table>


 <samp>
(__into__ to from)<br>
</samp>
 <samp>
(__into__ to xform from)<br>
</samp>

---

Returns a new collection consisting of `to` with all of the items of `from`
"added" using `conj`.

A transducer may be supplied as `xform`.



---


###### See Also:

[`cljs.core/conj`](../cljs.core/conj.md)<br>

---


Source docstring:

```
Returns a new coll consisting of to-coll with all of the items of
from-coll conjoined.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/core.cljs#L2954-L2962):

```clj
(defn into
  [to from]
  (if-not (nil? to)
    (if (satisfies? IEditableCollection to false)
      (persistent! (reduce -conj! (transient to) from))
      (reduce -conj to from))
    (reduce conj () from)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1889
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2954-2962](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/core.cljs#L2954-L2962)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/into` @ clojuredocs](http://clojuredocs.org/clojure.core/into)<br>
[`clojure.core/into` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/into/)<br>
[`clojure.core/into` @ crossclj](http://crossclj.info/fun/clojure.core/into.html)<br>
[`cljs.core/into` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/into.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/into.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a new collection consisting of `to` with all of the items of `from`\n\"added\" using `conj`.\n\nA transducer may be supplied as `xform`.",
 :ns "cljs.core",
 :name "into",
 :signature ["[to from]" "[to xform from]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/conj"],
 :full-name-encode "cljs.core/into",
 :source {:code "(defn into\n  [to from]\n  (if-not (nil? to)\n    (if (satisfies? IEditableCollection to false)\n      (persistent! (reduce -conj! (transient to) from))\n      (reduce -conj to from))\n    (reduce conj () from)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2954 2962]},
 :full-name "cljs.core/into",
 :clj-symbol "clojure.core/into",
 :docstring "Returns a new coll consisting of to-coll with all of the items of\nfrom-coll conjoined."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/into"]))
```

-->
