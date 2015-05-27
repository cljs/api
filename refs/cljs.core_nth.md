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
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:868-907](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L868-L907)</ins>
</pre>

```clj
(defn nth
  ([coll n]
     (when-not (nil? coll)
       (cond
         (satisfies? IIndexed coll false)
         (-nth ^not-native coll (.floor js/Math n))

         (array? coll)
         (when (< n (.-length coll))
           (aget coll n))
         
         (string? coll)
         (when (< n (.-length coll))
           (aget coll n))
         
         :else
         (linear-traversal-nth coll (.floor js/Math n)))))
  ([coll n not-found]
     (if-not (nil? coll)
       (cond
         (satisfies? IIndexed coll false)
         (-nth ^not-native coll (.floor js/Math n) not-found)

         (array? coll)
         (if (< n (.-length coll))
           (aget coll n)
           not-found)
         
         (string? coll)
         (if (< n (.-length coll))
           (aget coll n)
           not-found)
         
         :else
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
 :source {:code "(defn nth\n  ([coll n]\n     (when-not (nil? coll)\n       (cond\n         (satisfies? IIndexed coll false)\n         (-nth ^not-native coll (.floor js/Math n))\n\n         (array? coll)\n         (when (< n (.-length coll))\n           (aget coll n))\n         \n         (string? coll)\n         (when (< n (.-length coll))\n           (aget coll n))\n         \n         :else\n         (linear-traversal-nth coll (.floor js/Math n)))))\n  ([coll n not-found]\n     (if-not (nil? coll)\n       (cond\n         (satisfies? IIndexed coll false)\n         (-nth ^not-native coll (.floor js/Math n) not-found)\n\n         (array? coll)\n         (if (< n (.-length coll))\n           (aget coll n)\n           not-found)\n         \n         (string? coll)\n         (if (< n (.-length coll))\n           (aget coll n)\n           not-found)\n         \n         :else\n         (linear-traversal-nth coll (.floor js/Math n) not-found))\n       not-found)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [868 907],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L868-L907"},
 :full-name "cljs.core/nth",
 :clj-symbol "clojure.core/nth",
 :docstring "Returns the value at the index. get returns nil if index out of\nbounds, nth throws an exception unless not-found is supplied.  nth\nalso works for strings, arrays, regex Matchers and Lists, and,\nin O(n) time, for sequences."}

```
