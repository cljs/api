## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ancestors

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ancestors</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ancestors)
</td>
</tr>
</table>

 <samp>
(__ancestors__ tag)<br>
(__ancestors__ h tag)<br>
</samp>

```
Returns the immediate and indirect parents of tag, either via a JavaScript type
inheritance relationship or a relationship established via derive. h
must be a hierarchy obtained from make-hierarchy, if not supplied
defaults to the global hierarchy
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7162-7168](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L7162-L7168)</ins>
</pre>

```clj
(defn ancestors
  ([tag] (ancestors @(get-global-hierarchy) tag))
  ([h tag] (not-empty (get (:ancestors h) tag))))
```


---

```clj
{:ns "cljs.core",
 :name "ancestors",
 :signature ["[tag]" "[h tag]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_ancestors",
 :source {:code "(defn ancestors\n  ([tag] (ancestors @(get-global-hierarchy) tag))\n  ([h tag] (not-empty (get (:ancestors h) tag))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7162 7168],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L7162-L7168"},
 :full-name "cljs.core/ancestors",
 :clj-symbol "clojure.core/ancestors",
 :docstring "Returns the immediate and indirect parents of tag, either via a JavaScript type\ninheritance relationship or a relationship established via derive. h\nmust be a hierarchy obtained from make-hierarchy, if not supplied\ndefaults to the global hierarchy"}

```
