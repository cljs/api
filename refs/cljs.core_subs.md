## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/subs

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/subs</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/subs)
</td>
</tr>
</table>

 <samp>
(__subs__ s start)<br>
(__subs__ s start end)<br>
</samp>

```
Returns the substring of s beginning at start inclusive, and ending
at end (defaults to length of string), exclusive.
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1699-1703](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1699-L1703)</ins>
</pre>

```clj
(defn subs
  ([s start] (.substring s start))
  ([s start end] (.substring s start end)))
```


---

```clj
{:ns "cljs.core",
 :name "subs",
 :signature ["[s start]" "[s start end]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_subs",
 :source {:code "(defn subs\n  ([s start] (.substring s start))\n  ([s start end] (.substring s start end)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1699 1703],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1699-L1703"},
 :full-name "cljs.core/subs",
 :clj-symbol "clojure.core/subs",
 :docstring "Returns the substring of s beginning at start inclusive, and ending\nat end (defaults to length of string), exclusive."}

```
