## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/spread

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__spread__ arglist)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1341-1347](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L1341-L1347)</ins>
</pre>

```clj
(defn spread
  [arglist]
  (cond
   (nil? arglist) nil
   (nil? (next arglist)) (seq (first arglist))
   :else (cons (first arglist)
               (spread (next arglist)))))
```


---

```clj
{:full-name "cljs.core/spread",
 :ns "cljs.core",
 :name "spread",
 :type "function",
 :signature ["[arglist]"],
 :source {:code "(defn spread\n  [arglist]\n  (cond\n   (nil? arglist) nil\n   (nil? (next arglist)) (seq (first arglist))\n   :else (cons (first arglist)\n               (spread (next arglist)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1341 1347],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L1341-L1347"},
 :full-name-encode "cljs.core_spread",
 :history [["+" "0.0-927"]]}

```
