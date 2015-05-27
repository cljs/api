## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/parents

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/parents</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/parents)
</td>
</tr>
</table>

 <samp>
(__parents__ tag)<br>
(__parents__ h tag)<br>
</samp>

```
Returns the immediate parents of tag, either via a JavaScript type
inheritance relationship or a relationship established via derive. h
must be a hierarchy obtained from make-hierarchy, if not supplied
defaults to the global hierarchy
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6871-6877](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L6871-L6877)</ins>
</pre>

```clj
(defn parents
  ([tag] (parents @(get-global-hierarchy) tag))
  ([h tag] (not-empty (get (:parents h) tag))))
```


---

```clj
{:ns "cljs.core",
 :name "parents",
 :signature ["[tag]" "[h tag]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_parents",
 :source {:code "(defn parents\n  ([tag] (parents @(get-global-hierarchy) tag))\n  ([h tag] (not-empty (get (:parents h) tag))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6871 6877],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L6871-L6877"},
 :full-name "cljs.core/parents",
 :clj-symbol "clojure.core/parents",
 :docstring "Returns the immediate parents of tag, either via a JavaScript type\ninheritance relationship or a relationship established via derive. h\nmust be a hierarchy obtained from make-hierarchy, if not supplied\ndefaults to the global hierarchy"}

```
