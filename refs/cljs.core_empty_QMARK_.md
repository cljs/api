## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/empty?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/empty?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/empty?)
</td>
</tr>
</table>

 <samp>
(__empty?__ coll)<br>
</samp>

```
Returns true if coll has no items - same as (not (seq coll)).
Please use the idiom (seq x) rather than (not (empty? x))
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:905-908](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L905-L908)</ins>
</pre>

```clj
(defn ^boolean empty?
  [coll] (not (seq coll)))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "empty?",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_empty_QMARK_",
 :source {:code "(defn ^boolean empty?\n  [coll] (not (seq coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [905 908],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L905-L908"},
 :full-name "cljs.core/empty?",
 :clj-symbol "clojure.core/empty?",
 :docstring "Returns true if coll has no items - same as (not (seq coll)).\nPlease use the idiom (seq x) rather than (not (empty? x))"}

```
