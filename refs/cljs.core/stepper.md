## cljs.core/stepper



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__stepper__ xform iter)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L3232-L3246):

```clj
(defn stepper [xform iter]
  (letfn [(stepfn
            ([result]
               (let [lt (if (reduced? result)
                          @result
                          result)]
                 (set! (.-stepper lt) nil)
                 result))
            ([result input]
               (let [lt result]
                 (set! (.-first lt) input)
                 (set! (.-rest lt) (lazy-transformer (.-stepper lt)))
                 (set! (.-stepper lt) nil)
                 (.-rest lt))))]
   (Stepper. (xform stepfn) iter)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3232-3246](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L3232-L3246)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/stepper` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/stepper.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/stepper.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "stepper",
 :type "function",
 :signature ["[xform iter]"],
 :source {:code "(defn stepper [xform iter]\n  (letfn [(stepfn\n            ([result]\n               (let [lt (if (reduced? result)\n                          @result\n                          result)]\n                 (set! (.-stepper lt) nil)\n                 result))\n            ([result input]\n               (let [lt result]\n                 (set! (.-first lt) input)\n                 (set! (.-rest lt) (lazy-transformer (.-stepper lt)))\n                 (set! (.-stepper lt) nil)\n                 (.-rest lt))))]\n   (Stepper. (xform stepfn) iter)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3232 3246]},
 :full-name "cljs.core/stepper",
 :full-name-encode "cljs.core/stepper",
 :history [["+" "0.0-2301"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/stepper"]))
```

-->
