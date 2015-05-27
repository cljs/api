## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/cat

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__cat__)<br>
(__cat__ ctor)<br>
(__cat__ left right)<br>
</samp>

```
A high-performance combining fn that yields the catenation of the
reduced values. The result is reducible, foldable, seqable and
counted, providing the identity collections are reducible, seqable
and counted. The single argument version will build a combining fn
with the supplied identity constructor. Tests for identity
with (zero? (count x)). See also foldcat.
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:204-221](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/core/reducers.cljs#L204-L221)</ins>
</pre>

```clj
(defn cat
  ([] (array))
  ([ctor]
     (fn
       ([] (ctor))
       ([left right] (cat left right))))
  ([left right]
     (cond
       (zero? (count left)) right
       (zero? (count right)) left
       :else
       (Cat. (+ (count left) (count right)) left right))))
```


---

```clj
{:full-name "clojure.core.reducers/cat",
 :ns "clojure.core.reducers",
 :name "cat",
 :docstring "A high-performance combining fn that yields the catenation of the\nreduced values. The result is reducible, foldable, seqable and\ncounted, providing the identity collections are reducible, seqable\nand counted. The single argument version will build a combining fn\nwith the supplied identity constructor. Tests for identity\nwith (zero? (count x)). See also foldcat.",
 :type "function",
 :signature ["[]" "[ctor]" "[left right]"],
 :source {:code "(defn cat\n  ([] (array))\n  ([ctor]\n     (fn\n       ([] (ctor))\n       ([left right] (cat left right))))\n  ([left right]\n     (cond\n       (zero? (count left)) right\n       (zero? (count right)) left\n       :else\n       (Cat. (+ (count left) (count right)) left right))))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [204 221],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/core/reducers.cljs#L204-L221"},
 :full-name-encode "clojure.core.reducers_cat",
 :history [["+" "0.0-1236"]]}

```
