## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/delay

 <table border="1">
<tr>
<td>macro</td>
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
(no docstring)
```

---

 <pre>
clojurescript @ r1552
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:751-756](https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/core.clj#L751-L756)</ins>
</pre>

```clj
(defmacro delay [& body]
  "Takes a body of expressions and yields a Delay object that will
  invoke the body only the first time it is forced (with force or deref/@), and
  will cache the result and return it on all subsequent force
  calls."
  `(new cljs.core/Delay (atom {:done false, :value nil}) (fn [] ~@body)))
```


---

```clj
{:full-name "cljs.core/delay",
 :ns "cljs.core",
 :name "delay",
 :type "macro",
 :signature ["[& body]"],
 :source {:code "(defmacro delay [& body]\n  \"Takes a body of expressions and yields a Delay object that will\n  invoke the body only the first time it is forced (with force or deref/@), and\n  will cache the result and return it on all subsequent force\n  calls.\"\n  `(new cljs.core/Delay (atom {:done false, :value nil}) (fn [] ~@body)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [751 756],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/core.clj#L751-L756"},
 :full-name-encode "cljs.core_delay",
 :clj-symbol "clojure.core/delay",
 :history [["+" "0.0-927"]]}

```
