## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/print-str

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1011"><img valign="middle" alt="[+] 0.0-1011" src="https://img.shields.io/badge/+-0.0--1011-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/print-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/print-str)
</td>
</tr>
</table>

 <samp>
(__print-str__ & objs)<br>
</samp>

```
print to a string, returning it
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6667-6670](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L6667-L6670)</ins>
</pre>

```clj
(defn print-str
  [& objs]
  (pr-str-with-opts objs (assoc (pr-opts) :readably false)))
```


---

```clj
{:ns "cljs.core",
 :name "print-str",
 :signature ["[& objs]"],
 :history [["+" "0.0-1011"]],
 :type "function",
 :full-name-encode "cljs.core_print-str",
 :source {:code "(defn print-str\n  [& objs]\n  (pr-str-with-opts objs (assoc (pr-opts) :readably false)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6667 6670],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L6667-L6670"},
 :full-name "cljs.core/print-str",
 :clj-symbol "clojure.core/print-str",
 :docstring "print to a string, returning it"}

```
