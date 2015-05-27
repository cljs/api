## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/re-pattern

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/re-pattern</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/re-pattern)
</td>
</tr>
</table>

 <samp>
(__re-pattern__ s)<br>
</samp>

```
Returns an instance of RegExp which has compiled the provided string.
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6205-6209](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L6205-L6209)</ins>
</pre>

```clj
(defn re-pattern
  [s]
  (let [[_ flags pattern] (re-find #"^(?:\(\?([idmsux]*)\))?(.*)" s)]
    (js/RegExp. pattern flags)))
```


---

```clj
{:ns "cljs.core",
 :name "re-pattern",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_re-pattern",
 :source {:code "(defn re-pattern\n  [s]\n  (let [[_ flags pattern] (re-find #\"^(?:\\(\\?([idmsux]*)\\))?(.*)\" s)]\n    (js/RegExp. pattern flags)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6205 6209],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L6205-L6209"},
 :full-name "cljs.core/re-pattern",
 :clj-symbol "clojure.core/re-pattern",
 :docstring "Returns an instance of RegExp which has compiled the provided string."}

```
