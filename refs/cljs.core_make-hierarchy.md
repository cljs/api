## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/make-hierarchy

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/make-hierarchy</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/make-hierarchy)
</td>
</tr>
</table>

 <samp>
(__make-hierarchy__)<br>
</samp>

```
Creates a hierarchy object for use with derive, isa? etc.
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6618-6620](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L6618-L6620)</ins>
</pre>

```clj
(defn make-hierarchy
  [] {:parents {} :descendants {} :ancestors {}})
```


---

```clj
{:ns "cljs.core",
 :name "make-hierarchy",
 :signature ["[]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_make-hierarchy",
 :source {:code "(defn make-hierarchy\n  [] {:parents {} :descendants {} :ancestors {}})",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6618 6620],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L6618-L6620"},
 :full-name "cljs.core/make-hierarchy",
 :clj-symbol "clojure.core/make-hierarchy",
 :docstring "Creates a hierarchy object for use with derive, isa? etc."}

```
