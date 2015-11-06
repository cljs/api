## cljs.core/comp



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/comp</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/comp)
</td>
</tr>
</table>


 <samp>
(__comp__ & fns)<br>
</samp>

---

Takes a set of functions and returns a function that is the composition
of those functions.

The returned function takes a variable number of arguments, applies the
rightmost of `fns` to the arguments, whose result is subsequently applied to
the next left function, and so on.

`((comp a b c) x y)` = `(a (b (c x y)))`



---

###### Examples:

```clj
(def f (comp str inc +))
(f 1 2 3)
;;=> "7"
```



---

###### See Also:

[`cljs.core/partial`](../cljs.core/partial.md)<br>
[`cljs.core/juxt`](../cljs.core/juxt.md)<br>

---


Source docstring:

```
Takes a set of functions and returns a fn that is the composition
of those fns.  The returned fn takes a variable number of args,
applies the rightmost of fns to the args, the next
fn (right-to-left) to the result, etc.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L3631-L3658):

```clj
(defn comp
  ([] identity)
  ([f] f)
  ([f g]
     (fn
       ([] (f (g)))
       ([x] (f (g x)))
       ([x y] (f (g x y)))
       ([x y z] (f (g x y z)))
       ([x y z & args] (f (apply g x y z args)))))
  ([f g h]
     (fn
       ([] (f (g (h))))
       ([x] (f (g (h x))))
       ([x y] (f (g (h x y))))
       ([x y z] (f (g (h x y z))))
       ([x y z & args] (f (g (apply h x y z args))))))
  ([f1 f2 f3 & fs]
    (let [fs (reverse (list* f1 f2 f3 fs))]
      (fn [& args]
        (loop [ret (apply (first fs) args) fs (next fs)]
          (if fs
            (recur ((first fs) ret) (next fs))
            ret))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3148
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3631-3658](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L3631-L3658)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/comp` @ clojuredocs](http://clojuredocs.org/clojure.core/comp)<br>
[`clojure.core/comp` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/comp/)<br>
[`clojure.core/comp` @ crossclj](http://crossclj.info/fun/clojure.core/comp.html)<br>
[`cljs.core/comp` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/comp.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/comp.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Takes a set of functions and returns a function that is the composition\nof those functions.\n\nThe returned function takes a variable number of arguments, applies the\nrightmost of `fns` to the arguments, whose result is subsequently applied to\nthe next left function, and so on.\n\n`((comp a b c) x y)` = `(a (b (c x y)))`",
 :ns "cljs.core",
 :name "comp",
 :signature ["[& fns]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/partial" "cljs.core/juxt"],
 :full-name-encode "cljs.core/comp",
 :source {:code "(defn comp\n  ([] identity)\n  ([f] f)\n  ([f g]\n     (fn\n       ([] (f (g)))\n       ([x] (f (g x)))\n       ([x y] (f (g x y)))\n       ([x y z] (f (g x y z)))\n       ([x y z & args] (f (apply g x y z args)))))\n  ([f g h]\n     (fn\n       ([] (f (g (h))))\n       ([x] (f (g (h x))))\n       ([x y] (f (g (h x y))))\n       ([x y z] (f (g (h x y z))))\n       ([x y z & args] (f (g (apply h x y z args))))))\n  ([f1 f2 f3 & fs]\n    (let [fs (reverse (list* f1 f2 f3 fs))]\n      (fn [& args]\n        (loop [ret (apply (first fs) args) fs (next fs)]\n          (if fs\n            (recur ((first fs) ret) (next fs))\n            ret))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3631 3658]},
 :examples [{:id "5d3250",
             :content "```clj\n(def f (comp str inc +))\n(f 1 2 3)\n;;=> \"7\"\n```"}],
 :full-name "cljs.core/comp",
 :clj-symbol "clojure.core/comp",
 :docstring "Takes a set of functions and returns a fn that is the composition\nof those fns.  The returned fn takes a variable number of args,\napplies the rightmost of fns to the args, the next\nfn (right-to-left) to the result, etc."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/comp"]))
```

-->
