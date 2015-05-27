## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/time

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/time</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/time)
</td>
</tr>
</table>

 <samp>
(__time__ expr)<br>
</samp>

```
Evaluates expr and prints the time it took. Returns the value of expr.
```

---

 <pre>
clojurescript @ r1211
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:908-914](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L908-L914)</ins>
</pre>

```clj
(defmacro time
  [expr]
  `(let [start# (.getTime (js/Date.) ())
         ret# ~expr]
     (prn (core/str "Elapsed time: " (- (.getTime (js/Date.) ()) start#) " msecs"))
     ret#))
```


---

```clj
{:ns "cljs.core",
 :name "time",
 :signature ["[expr]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_time",
 :source {:code "(defmacro time\n  [expr]\n  `(let [start# (.getTime (js/Date.) ())\n         ret# ~expr]\n     (prn (core/str \"Elapsed time: \" (- (.getTime (js/Date.) ()) start#) \" msecs\"))\n     ret#))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [908 914],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L908-L914"},
 :full-name "cljs.core/time",
 :clj-symbol "clojure.core/time",
 :docstring "Evaluates expr and prints the time it took. Returns the value of expr."}

```
