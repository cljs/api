## cljs.core/nth



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nth</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nth)
</td>
</tr>
</table>


 <samp>
(__nth__ coll n)<br>
</samp>
 <samp>
(__nth__ coll n not-found)<br>
</samp>

---

Returns the value at index `n` or `not-found` if the index is out of bounds.

`nth` will throw an exception if `n` is out of bounds and `not-found` is not
supplied.

`nth` works for Strings, Arrays, Regex Matchers, Lists, and Sequences. For
Sequences, `nth` takes O(n) time.



---


###### See Also:

[`cljs.core/first`](../cljs.core/first.md)<br>
[`cljs.core/second`](../cljs.core/second.md)<br>
[`cljs.core/nthnext`](../cljs.core/nthnext.md)<br>
[`cljs.core/get`](../cljs.core/get.md)<br>

---


Source docstring:

```
Returns the value at the index. get returns nil if index out of
bounds, nth throws an exception unless not-found is supplied.  nth
also works for strings, arrays, regex Matchers and Lists, and,
in O(n) time, for sequences.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L744-L759):

```clj
(defn nth
  ([coll n]
     (when-not (nil? coll)
       (if (satisfies? IIndexed coll)
         (-nth coll (.floor js/Math n))
         (linear-traversal-nth coll (.floor js/Math n)))))
  ([coll n not-found]
     (if-not (nil? coll)
       (if (satisfies? IIndexed coll)
         (-nth coll (.floor js/Math n) not-found)
         (linear-traversal-nth coll (.floor js/Math n) not-found))
       not-found)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:744-759](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L744-L759)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/nth` @ clojuredocs](http://clojuredocs.org/clojure.core/nth)<br>
[`clojure.core/nth` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/nth/)<br>
[`clojure.core/nth` @ crossclj](http://crossclj.info/fun/clojure.core/nth.html)<br>
[`cljs.core/nth` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/nth.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/nth.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the value at index `n` or `not-found` if the index is out of bounds.\n\n`nth` will throw an exception if `n` is out of bounds and `not-found` is not\nsupplied.\n\n`nth` works for Strings, Arrays, Regex Matchers, Lists, and Sequences. For\nSequences, `nth` takes O(n) time.",
 :ns "cljs.core",
 :name "nth",
 :signature ["[coll n]" "[coll n not-found]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/first"
           "cljs.core/second"
           "cljs.core/nthnext"
           "cljs.core/get"],
 :full-name-encode "cljs.core/nth",
 :source {:code "(defn nth\n  ([coll n]\n     (when-not (nil? coll)\n       (if (satisfies? IIndexed coll)\n         (-nth coll (.floor js/Math n))\n         (linear-traversal-nth coll (.floor js/Math n)))))\n  ([coll n not-found]\n     (if-not (nil? coll)\n       (if (satisfies? IIndexed coll)\n         (-nth coll (.floor js/Math n) not-found)\n         (linear-traversal-nth coll (.floor js/Math n) not-found))\n       not-found)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/cljs/cljs/core.cljs",
          :lines [744 759]},
 :full-name "cljs.core/nth",
 :clj-symbol "clojure.core/nth",
 :docstring "Returns the value at the index. get returns nil if index out of\nbounds, nth throws an exception unless not-found is supplied.  nth\nalso works for strings, arrays, regex Matchers and Lists, and,\nin O(n) time, for sequences."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/nth"]))
```

-->
