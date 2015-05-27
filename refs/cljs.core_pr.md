## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/pr</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pr)
</td>
</tr>
</table>

 <samp>
(__pr__ & objs)<br>
</samp>

```
Prints the object(s) using string-print.  Prints the
object(s), separated by spaces if there is more than one.
By default, pr and prn print in a way that objects can be
read by the reader
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6208-6214](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L6208-L6214)</ins>
</pre>

```clj
(defn pr
  [& objs]
  (pr-with-opts objs (pr-opts)))
```


---

```clj
{:ns "cljs.core",
 :name "pr",
 :signature ["[& objs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_pr",
 :source {:code "(defn pr\n  [& objs]\n  (pr-with-opts objs (pr-opts)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6208 6214],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L6208-L6214"},
 :full-name "cljs.core/pr",
 :clj-symbol "clojure.core/pr",
 :docstring "Prints the object(s) using string-print.  Prints the\nobject(s), separated by spaces if there is more than one.\nBy default, pr and prn print in a way that objects can be\nread by the reader"}

```
