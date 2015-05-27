## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/next

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/next</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/next)
</td>
</tr>
</table>

 <samp>
(__next__ loc)<br>
</samp>

```
Moves to the next loc in the hierarchy, depth-first. When reaching
the end, returns a distinguished loc detectable via end?. If already
at the end, stays there.
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:206-219](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/zip.cljs#L206-L219)</ins>
</pre>

```clj
(defn next
  [loc]
    (if (= :end (loc 1))
      loc
      (or 
       (and (branch? loc) (down loc))
       (right loc)
       (loop [p loc]
         (if (up p)
           (or (right (up p)) (recur (up p)))
           [(node p) :end])))))
```


---

```clj
{:ns "clojure.zip",
 :name "next",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_next",
 :source {:code "(defn next\n  [loc]\n    (if (= :end (loc 1))\n      loc\n      (or \n       (and (branch? loc) (down loc))\n       (right loc)\n       (loop [p loc]\n         (if (up p)\n           (or (right (up p)) (recur (up p)))\n           [(node p) :end])))))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [206 219],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/zip.cljs#L206-L219"},
 :full-name "clojure.zip/next",
 :clj-symbol "clojure.zip/next",
 :docstring "Moves to the next loc in the hierarchy, depth-first. When reaching\nthe end, returns a distinguished loc detectable via end?. If already\nat the end, stays there."}

```
