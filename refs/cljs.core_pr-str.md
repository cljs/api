## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr-str

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/pr-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pr-str)
</td>
</tr>
</table>

 <samp>
(__pr-str__ & objs)<br>
</samp>

```
pr to a string, returning it. Fundamental entrypoint to IPrintable.
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3111-3114](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L3111-L3114)</ins>
</pre>

```clj
(defn pr-str
  [& objs]
  (pr-str-with-opts objs (pr-opts)))
```


---

```clj
{:ns "cljs.core",
 :name "pr-str",
 :signature ["[& objs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_pr-str",
 :source {:code "(defn pr-str\n  [& objs]\n  (pr-str-with-opts objs (pr-opts)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3111 3114],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L3111-L3114"},
 :full-name "cljs.core/pr-str",
 :clj-symbol "clojure.core/pr-str",
 :docstring "pr to a string, returning it. Fundamental entrypoint to IPrintable."}

```
