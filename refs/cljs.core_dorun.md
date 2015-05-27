## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/dorun

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/dorun</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dorun)
</td>
</tr>
</table>

 <samp>
(__dorun__ coll)<br>
(__dorun__ n coll)<br>
</samp>

```
When lazy sequences are produced via functions that have side
effects, any effects other than those needed to produce the first
element in the seq do not occur until the seq is consumed. dorun can
be used to force any effects. Walks through the successive nexts of
the seq, does not retain the head and returns nil.
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2735-2746](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L2735-L2746)</ins>
</pre>

```clj
(defn dorun
  ([coll]
   (when (seq coll)
     (recur (next coll))))
  ([n coll]
   (when (and (seq coll) (pos? n))
     (recur (dec n) (next coll)))))
```


---

```clj
{:ns "cljs.core",
 :name "dorun",
 :signature ["[coll]" "[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_dorun",
 :source {:code "(defn dorun\n  ([coll]\n   (when (seq coll)\n     (recur (next coll))))\n  ([n coll]\n   (when (and (seq coll) (pos? n))\n     (recur (dec n) (next coll)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2735 2746],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L2735-L2746"},
 :full-name "cljs.core/dorun",
 :clj-symbol "clojure.core/dorun",
 :docstring "When lazy sequences are produced via functions that have side\neffects, any effects other than those needed to produce the first\nelement in the seq do not occur until the seq is consumed. dorun can\nbe used to force any effects. Walks through the successive nexts of\nthe seq, does not retain the head and returns nil."}

```
