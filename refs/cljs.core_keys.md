## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/keys

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keys</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keys)
</td>
</tr>
</table>

 <samp>
(__keys__ hash-map)<br>
</samp>

```
Returns a sequence of the map's keys.
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5786-5790](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L5786-L5790)</ins>
</pre>

```clj
(defn keys
  [hash-map]
  (when-let [mseq (seq hash-map)]
    (KeySeq. mseq nil)))
```


---

```clj
{:ns "cljs.core",
 :name "keys",
 :signature ["[hash-map]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_keys",
 :source {:code "(defn keys\n  [hash-map]\n  (when-let [mseq (seq hash-map)]\n    (KeySeq. mseq nil)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5786 5790],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L5786-L5790"},
 :full-name "cljs.core/keys",
 :clj-symbol "clojure.core/keys",
 :docstring "Returns a sequence of the map's keys."}

```
