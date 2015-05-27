## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/special-symbol?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1803"><img valign="middle" alt="[+] 0.0-1803" src="https://img.shields.io/badge/+-0.0--1803-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/special-symbol?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/special-symbol?)
</td>
</tr>
</table>

 <samp>
(__special-symbol?__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7452-7456](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L7452-L7456)</ins>
</pre>

```clj
(defn ^boolean special-symbol? [x]
  (contains?
    '#{if def fn* do let* loop* letfn* throw try*
       recur new set! ns deftype* defrecord* . js* & quote}
    x))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "special-symbol?",
 :signature ["[x]"],
 :history [["+" "0.0-1803"]],
 :type "function",
 :full-name-encode "cljs.core_special-symbol_QMARK_",
 :source {:code "(defn ^boolean special-symbol? [x]\n  (contains?\n    '#{if def fn* do let* loop* letfn* throw try*\n       recur new set! ns deftype* defrecord* . js* & quote}\n    x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7452 7456],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L7452-L7456"},
 :full-name "cljs.core/special-symbol?",
 :clj-symbol "clojure.core/special-symbol?"}

```
