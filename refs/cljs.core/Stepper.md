## cljs.core/Stepper



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__Stepper.__ xform iter)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/cljs/core.cljs#L2943-L2954):

```clj
(deftype Stepper [xform iter]
  Object
  (step [this lt]
    (loop []
      (if (and (not (nil? (.-stepper lt)))
               (.hasNext iter))
        (if (reduced? (xform lt (.next iter)))
          (when-not (nil? (.-rest lt))
            (set! (.. lt -rest -stepper) nil))
          (recur))))
    (when-not (nil? (.-stepper lt))
      (xform lt))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2311
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2943-2954](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/cljs/core.cljs#L2943-L2954)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/Stepper` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Stepper.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Stepper.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Stepper",
 :type "type",
 :signature ["[xform iter]"],
 :source {:code "(deftype Stepper [xform iter]\n  Object\n  (step [this lt]\n    (loop []\n      (if (and (not (nil? (.-stepper lt)))\n               (.hasNext iter))\n        (if (reduced? (xform lt (.next iter)))\n          (when-not (nil? (.-rest lt))\n            (set! (.. lt -rest -stepper) nil))\n          (recur))))\n    (when-not (nil? (.-stepper lt))\n      (xform lt))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2311",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2943 2954]},
 :full-name "cljs.core/Stepper",
 :full-name-encode "cljs.core/Stepper",
 :history [["+" "0.0-2301"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Stepper"]))
```

-->
