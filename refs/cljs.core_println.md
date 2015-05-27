## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/println

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/println</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/println)
</td>
</tr>
</table>

 <samp>
(__println__ & objs)<br>
</samp>

```
Same as print followed by (newline)
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6331-6335](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L6331-L6335)</ins>
</pre>

```clj
(defn println
  [& objs]
  (pr-with-opts objs (assoc (pr-opts) :readably false))
  (newline (pr-opts)))
```


---

```clj
{:ns "cljs.core",
 :name "println",
 :signature ["[& objs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_println",
 :source {:code "(defn println\n  [& objs]\n  (pr-with-opts objs (assoc (pr-opts) :readably false))\n  (newline (pr-opts)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6331 6335],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L6331-L6335"},
 :full-name "cljs.core/println",
 :clj-symbol "clojure.core/println",
 :docstring "Same as print followed by (newline)"}

```
