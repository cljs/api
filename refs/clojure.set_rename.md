## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/rename

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/rename</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/rename)
</td>
</tr>
</table>

 <samp>
(__rename__ xrel kmap)<br>
</samp>

```
Returns a rel of the maps in xrel with the keys in kmap renamed to the vals in kmap
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:83-86](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/set.cljs#L83-L86)</ins>
</pre>

```clj
(defn rename
  [xrel kmap]
    (set (map #(rename-keys % kmap) xrel)))
```


---

```clj
{:ns "clojure.set",
 :name "rename",
 :signature ["[xrel kmap]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_rename",
 :source {:code "(defn rename\n  [xrel kmap]\n    (set (map #(rename-keys % kmap) xrel)))",
          :filename "clojurescript/src/cljs/clojure/set.cljs",
          :lines [83 86],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/set.cljs#L83-L86"},
 :full-name "clojure.set/rename",
 :clj-symbol "clojure.set/rename",
 :docstring "Returns a rel of the maps in xrel with the keys in kmap renamed to the vals in kmap"}

```
