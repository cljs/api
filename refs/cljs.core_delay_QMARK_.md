## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/delay?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/delay?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/delay?)
</td>
</tr>
</table>

 <samp>
(__delay?__ x)<br>
</samp>

```
returns true if x is a Delay created with delay
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6814-6816](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L6814-L6816)</ins>
</pre>

```clj
(defn ^boolean delay?
  [x] (instance? cljs.core.Delay x))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "delay?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_delay_QMARK_",
 :source {:code "(defn ^boolean delay?\n  [x] (instance? cljs.core.Delay x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6814 6816],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L6814-L6816"},
 :full-name "cljs.core/delay?",
 :clj-symbol "clojure.core/delay?",
 :docstring "returns true if x is a Delay created with delay"}

```
