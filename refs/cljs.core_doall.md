## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/doall

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/doall</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/doall)
</td>
</tr>
</table>

 <samp>
(__doall__ coll)<br>
(__doall__ n coll)<br>
</samp>

```
When lazy sequences are produced via functions that have side
effects, any effects other than those needed to produce the first
element in the seq do not occur until the seq is consumed. doall can
be used to force any effects. Walks through the successive nexts of
the seq, retains the head and returns it, thus causing the entire
seq to reside in memory at one time.
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2981-2993](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L2981-L2993)</ins>
</pre>

```clj
(defn doall
  ([coll]
   (dorun coll)
   coll)
  ([n coll]
   (dorun n coll)
   coll))
```


---

```clj
{:ns "cljs.core",
 :name "doall",
 :signature ["[coll]" "[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_doall",
 :source {:code "(defn doall\n  ([coll]\n   (dorun coll)\n   coll)\n  ([n coll]\n   (dorun n coll)\n   coll))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2981 2993],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L2981-L2993"},
 :full-name "cljs.core/doall",
 :clj-symbol "clojure.core/doall",
 :docstring "When lazy sequences are produced via functions that have side\neffects, any effects other than those needed to produce the first\nelement in the seq do not occur until the seq is consumed. doall can\nbe used to force any effects. Walks through the successive nexts of\nthe seq, retains the head and returns it, thus causing the entire\nseq to reside in memory at one time."}

```
