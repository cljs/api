## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/edit

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/edit</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/edit)
</td>
</tr>
</table>

 <samp>
(__edit__ loc f & args)<br>
</samp>

```
Replaces the node at this loc with the value of (f node args)
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:189-192](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/zip.cljs#L189-L192)</ins>
</pre>

```clj
(defn edit
  [loc f & args]
    (replace loc (apply f (node loc) args)))
```


---

```clj
{:ns "clojure.zip",
 :name "edit",
 :signature ["[loc f & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_edit",
 :source {:code "(defn edit\n  [loc f & args]\n    (replace loc (apply f (node loc) args)))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [189 192],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/zip.cljs#L189-L192"},
 :full-name "clojure.zip/edit",
 :clj-symbol "clojure.zip/edit",
 :docstring "Replaces the node at this loc with the value of (f node args)"}

```
