## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/println-str

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1011"><img valign="middle" alt="[+] 0.0-1011" src="https://img.shields.io/badge/+-0.0--1011-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/println-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/println-str)
</td>
</tr>
</table>

 <samp>
(__println-str__ & objs)<br>
</samp>

```
println to a string, returning it
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3147-3150](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L3147-L3150)</ins>
</pre>

```clj
(defn println-str
  [& objs]
  (prn-str-with-opts objs (assoc (pr-opts) :readably false)))
```


---

```clj
{:ns "cljs.core",
 :name "println-str",
 :signature ["[& objs]"],
 :history [["+" "0.0-1011"]],
 :type "function",
 :full-name-encode "cljs.core_println-str",
 :source {:code "(defn println-str\n  [& objs]\n  (prn-str-with-opts objs (assoc (pr-opts) :readably false)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3147 3150],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L3147-L3150"},
 :full-name "cljs.core/println-str",
 :clj-symbol "clojure.core/println-str",
 :docstring "println to a string, returning it"}

```
