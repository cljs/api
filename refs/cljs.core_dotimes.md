## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/dotimes

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/dotimes</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dotimes)
</td>
</tr>
</table>

 <samp>
(__dotimes__ bindings & body)<br>
</samp>

```
bindings => name n

Repeatedly executes body (presumably for side-effects) with name
bound to integers from 0 through n-1.
```

---

 <pre>
clojurescript @ r1449
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1019-1031](https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/core.clj#L1019-L1031)</ins>
</pre>

```clj
(defmacro dotimes
  [bindings & body]
  (let [i (first bindings)
        n (second bindings)]
    `(let [n# ~n]
       (loop [~i 0]
         (when (< ~i n#)
           ~@body
           (recur (inc ~i)))))))
```


---

```clj
{:ns "cljs.core",
 :name "dotimes",
 :signature ["[bindings & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_dotimes",
 :source {:code "(defmacro dotimes\n  [bindings & body]\n  (let [i (first bindings)\n        n (second bindings)]\n    `(let [n# ~n]\n       (loop [~i 0]\n         (when (< ~i n#)\n           ~@body\n           (recur (inc ~i)))))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [1019 1031],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/core.clj#L1019-L1031"},
 :full-name "cljs.core/dotimes",
 :clj-symbol "clojure.core/dotimes",
 :docstring "bindings => name n\n\nRepeatedly executes body (presumably for side-effects) with name\nbound to integers from 0 through n-1."}

```
