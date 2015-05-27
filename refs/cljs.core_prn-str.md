## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/prn-str

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1011"><img valign="middle" alt="[+] 0.0-1011" src="https://img.shields.io/badge/+-0.0--1011-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/prn-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/prn-str)
</td>
</tr>
</table>

 <samp>
(__prn-str__ & objs)<br>
</samp>

```
Same as pr-str followed by (newline)
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5706-5709](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L5706-L5709)</ins>
</pre>

```clj
(defn prn-str
  [& objs]
  (prn-str-with-opts objs (pr-opts)))
```


---

```clj
{:ns "cljs.core",
 :name "prn-str",
 :signature ["[& objs]"],
 :history [["+" "0.0-1011"]],
 :type "function",
 :full-name-encode "cljs.core_prn-str",
 :source {:code "(defn prn-str\n  [& objs]\n  (prn-str-with-opts objs (pr-opts)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5706 5709],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L5706-L5709"},
 :full-name "cljs.core/prn-str",
 :clj-symbol "clojure.core/prn-str",
 :docstring "Same as pr-str followed by (newline)"}

```
