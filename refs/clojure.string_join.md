## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/join

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/join</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/join)
</td>
</tr>
</table>

 <samp>
(__join__ coll)<br>
(__join__ separator coll)<br>
</samp>

```
Returns a string of all elements in coll, as returned by (seq coll),
separated by an optional separator.
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:45-51](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/clojure/string.cljs#L45-L51)</ins>
</pre>

```clj
(defn join
  ([coll]
     (apply str coll))
  ([separator coll]
     (apply str (interpose separator coll))))
```


---

```clj
{:ns "clojure.string",
 :name "join",
 :signature ["[coll]" "[separator coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_join",
 :source {:code "(defn join\n  ([coll]\n     (apply str coll))\n  ([separator coll]\n     (apply str (interpose separator coll))))",
          :filename "clojurescript/src/cljs/clojure/string.cljs",
          :lines [45 51],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/clojure/string.cljs#L45-L51"},
 :full-name "clojure.string/join",
 :clj-symbol "clojure.string/join",
 :docstring "Returns a string of all elements in coll, as returned by (seq coll),\nseparated by an optional separator."}

```
