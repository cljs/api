## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/seq

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/seq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/seq)
</td>
</tr>
</table>

 <samp>
(__seq__ coll)<br>
</samp>

```
Returns a seq on the collection. If the collection is
empty, returns nil.  (seq nil) returns nil. seq also works on
Strings.
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:389-408](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L389-L408)</ins>
</pre>

```clj
(defn ^seq seq
  [coll]
  (when-not (nil? coll)
    (cond
      (satisfies? ISeqable coll false)
      (-seq ^not-native coll)

      (array? coll)
      (IndexedSeq. coll 0)

      (string? coll)
      (IndexedSeq. coll 0)

      (type_satisfies_ ILookup coll)
      (-seq coll)

      :else (throw (js/Error. (str coll "is not ISeqable"))))))
```


---

```clj
{:return-type seq,
 :ns "cljs.core",
 :name "seq",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_seq",
 :source {:code "(defn ^seq seq\n  [coll]\n  (when-not (nil? coll)\n    (cond\n      (satisfies? ISeqable coll false)\n      (-seq ^not-native coll)\n\n      (array? coll)\n      (IndexedSeq. coll 0)\n\n      (string? coll)\n      (IndexedSeq. coll 0)\n\n      (type_satisfies_ ILookup coll)\n      (-seq coll)\n\n      :else (throw (js/Error. (str coll \"is not ISeqable\"))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [389 408],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L389-L408"},
 :full-name "cljs.core/seq",
 :clj-symbol "clojure.core/seq",
 :docstring "Returns a seq on the collection. If the collection is\nempty, returns nil.  (seq nil) returns nil. seq also works on\nStrings."}

```
