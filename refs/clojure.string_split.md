## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/split

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/split</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/split)
</td>
</tr>
</table>

 <samp>
(__split__ s re)<br>
(__split__ s re limit)<br>
</samp>

```
Splits string on a regular expression. Optional argument limit is
the maximum number of splits. Not lazy. Returns vector of the splits.
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:81-99](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/string.cljs#L81-L99)</ins>
</pre>

```clj
(defn split
  ([s re]
     (vec (.split (str s) re)))
  ([s re limit]
     (if (< limit 1)
       (vec (.split (str s) re))
       (loop [s s
              limit limit
              parts []]
         (if (= limit 1)
           (conj parts s)
           (if-let [m (re-find re s)]
             (let [index (.indexOf s m)]
               (recur (.substring s (+ index (count m)))
                      (dec limit)
                      (conj parts (.substring s 0 index))))
             (conj parts s)))))))
```


---

```clj
{:ns "clojure.string",
 :name "split",
 :signature ["[s re]" "[s re limit]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_split",
 :source {:code "(defn split\n  ([s re]\n     (vec (.split (str s) re)))\n  ([s re limit]\n     (if (< limit 1)\n       (vec (.split (str s) re))\n       (loop [s s\n              limit limit\n              parts []]\n         (if (= limit 1)\n           (conj parts s)\n           (if-let [m (re-find re s)]\n             (let [index (.indexOf s m)]\n               (recur (.substring s (+ index (count m)))\n                      (dec limit)\n                      (conj parts (.substring s 0 index))))\n             (conj parts s)))))))",
          :filename "clojurescript/src/cljs/clojure/string.cljs",
          :lines [81 99],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/string.cljs#L81-L99"},
 :full-name "clojure.string/split",
 :clj-symbol "clojure.string/split",
 :docstring "Splits string on a regular expression. Optional argument limit is\nthe maximum number of splits. Not lazy. Returns vector of the splits."}

```
