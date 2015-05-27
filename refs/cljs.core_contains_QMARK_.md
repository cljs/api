## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/contains?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/contains?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/contains?)
</td>
</tr>
</table>

 <samp>
(__contains?__ coll v)<br>
</samp>

```
Returns true if key is present in the given collection, otherwise
returns false.  Note that for numerically indexed collections like
vectors and arrays, this tests if the numeric key is within the
range of indexes. 'contains?' operates constant or logarithmic time;
it will not perform a linear search for a value.  See also 'some'.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1178-1187](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1178-L1187)</ins>
</pre>

```clj
(defn ^boolean contains?
  [coll v]
  (if (identical? (get coll v lookup-sentinel) lookup-sentinel)
    false
    true))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "contains?",
 :signature ["[coll v]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_contains_QMARK_",
 :source {:code "(defn ^boolean contains?\n  [coll v]\n  (if (identical? (get coll v lookup-sentinel) lookup-sentinel)\n    false\n    true))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1178 1187],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1178-L1187"},
 :full-name "cljs.core/contains?",
 :clj-symbol "clojure.core/contains?",
 :docstring "Returns true if key is present in the given collection, otherwise\nreturns false.  Note that for numerically indexed collections like\nvectors and arrays, this tests if the numeric key is within the\nrange of indexes. 'contains?' operates constant or logarithmic time;\nit will not perform a linear search for a value.  See also 'some'."}

```
