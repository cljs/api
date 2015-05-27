## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/project

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/project</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/project)
</td>
</tr>
</table>

 <samp>
(__project__ xrel ks)<br>
</samp>

```
Returns a rel of the elements of xrel with only the keys in ks
```

---

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:67-70](https://github.com/clojure/clojurescript/blob/r993/src/cljs/clojure/set.cljs#L67-L70)</ins>
</pre>

```clj
(defn project
  [xrel ks]
    (set (map #(select-keys % ks) xrel)))
```


---

```clj
{:ns "clojure.set",
 :name "project",
 :signature ["[xrel ks]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_project",
 :source {:code "(defn project\n  [xrel ks]\n    (set (map #(select-keys % ks) xrel)))",
          :filename "clojurescript/src/cljs/clojure/set.cljs",
          :lines [67 70],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/clojure/set.cljs#L67-L70"},
 :full-name "clojure.set/project",
 :clj-symbol "clojure.set/project",
 :docstring "Returns a rel of the elements of xrel with only the keys in ks"}

```
