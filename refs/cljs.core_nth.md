## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/nth

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nth</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nth)
</td>
</tr>
</table>

 <samp>
(__nth__ coll n)<br>
(__nth__ coll n not-found)<br>
</samp>

```
Returns the value at the index. get returns nil if index out of
bounds, nth throws an exception unless not-found is supplied.  nth
also works for strings, arrays, regex Matchers and Lists, and,
in O(n) time, for sequences.
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:793-808](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L793-L808)</ins>
</pre>

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


---

```clj
{:ns "cljs.core",
 :name "nth",
 :signature ["[coll n]" "[coll n not-found]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_nth",
 :source {:code "(defn nth\n  ([coll n]\n     (when-not (nil? coll)\n       (if (satisfies? IIndexed coll)\n         (-nth coll (.floor js/Math n))\n         (linear-traversal-nth coll (.floor js/Math n)))))\n  ([coll n not-found]\n     (if-not (nil? coll)\n       (if (satisfies? IIndexed coll)\n         (-nth coll (.floor js/Math n) not-found)\n         (linear-traversal-nth coll (.floor js/Math n) not-found))\n       not-found)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [793 808],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L793-L808"},
 :full-name "cljs.core/nth",
 :clj-symbol "clojure.core/nth",
 :docstring "Returns the value at the index. get returns nil if index out of\nbounds, nth throws an exception unless not-found is supplied.  nth\nalso works for strings, arrays, regex Matchers and Lists, and,\nin O(n) time, for sequences."}

```
