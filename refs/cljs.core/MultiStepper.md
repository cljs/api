## cljs.core/MultiStepper



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__MultiStepper.__ xform iters nexts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/core.cljs#L3091-L3114):

```clj
(deftype MultiStepper [xform iters nexts]
  Object
  (hasNext [_]
    (loop [iters (seq iters)]
      (if-not (nil? iters)
        (let [iter (first iters)]
          (if-not (.hasNext iter)
            false
            (recur (next iters))))
        true)))
  (next [_]
    (dotimes [i (alength iters)]
      (aset nexts i (.next (aget iters i))))
    (prim-seq nexts 0))
  (step [this lt]
    (loop []
      (if (and (not (nil? (.-stepper lt)))
               (.hasNext this))
        (if (reduced? (apply xform (cons lt (.next this))))
          (when-not (nil? (.-rest lt))
            (set! (.. lt -rest -stepper) nil))
          (recur))))
    (when-not (nil? (.-stepper lt))
      (xform lt))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3091-3114](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/core.cljs#L3091-L3114)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/MultiStepper` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/MultiStepper.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/MultiStepper.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "MultiStepper",
 :type "type",
 :signature ["[xform iters nexts]"],
 :source {:code "(deftype MultiStepper [xform iters nexts]\n  Object\n  (hasNext [_]\n    (loop [iters (seq iters)]\n      (if-not (nil? iters)\n        (let [iter (first iters)]\n          (if-not (.hasNext iter)\n            false\n            (recur (next iters))))\n        true)))\n  (next [_]\n    (dotimes [i (alength iters)]\n      (aset nexts i (.next (aget iters i))))\n    (prim-seq nexts 0))\n  (step [this lt]\n    (loop []\n      (if (and (not (nil? (.-stepper lt)))\n               (.hasNext this))\n        (if (reduced? (apply xform (cons lt (.next this))))\n          (when-not (nil? (.-rest lt))\n            (set! (.. lt -rest -stepper) nil))\n          (recur))))\n    (when-not (nil? (.-stepper lt))\n      (xform lt))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3091 3114]},
 :full-name "cljs.core/MultiStepper",
 :full-name-encode "cljs.core/MultiStepper",
 :history [["+" "0.0-2301"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/MultiStepper"]))
```

-->
