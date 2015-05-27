## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/delay

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/delay</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/delay)
</td>
</tr>
</table>

 <samp>
(__delay__ & body)<br>
</samp>

```
Takes a body of expressions and yields a Delay object that will
invoke the body only the first time it is forced (with force or deref/@), and
will cache the result and return it on all subsequent force
calls.
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3192-3198](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L3192-L3198)</ins>
</pre>

```clj
(defn delay
  [& body]
  (Delay. (fn [] (apply identity body)) (atom nil)))
```


---

```clj
{:ns "cljs.core",
 :name "delay",
 :signature ["[& body]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_delay",
 :source {:code "(defn delay\n  [& body]\n  (Delay. (fn [] (apply identity body)) (atom nil)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3192 3198],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L3192-L3198"},
 :full-name "cljs.core/delay",
 :clj-symbol "clojure.core/delay",
 :docstring "Takes a body of expressions and yields a Delay object that will\ninvoke the body only the first time it is forced (with force or deref/@), and\nwill cache the result and return it on all subsequent force\ncalls."}

```
