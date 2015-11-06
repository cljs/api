## cljs.test/run-block



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__run-block__ fns)<br>
</samp>

---





Source docstring:

```
Invoke all functions in fns with no arguments. A fn can optionally
return

an async test - is invoked with a continuation running left fns

a seq of fns tagged per block - are invoked immediately after fn
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/test.cljs#L408-L425):

```clj
(defn run-block
  [fns]
  (when-first [f fns]
    (let [obj (f)]
      (if (async? obj)
        (obj (let [d (delay (run-block (rest fns)))]
               (fn []
                 (if (realized? d)
                   (println "WARNING: Async test called done more than one time.")
                   @d))))
        (recur (cond->> (rest fns)
                 (::block? (meta obj)) (concat obj)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:408-425](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/test.cljs#L408-L425)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/run-block` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/run-block.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/run-block.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "run-block",
 :signature ["[fns]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.test/run-block",
 :source {:code "(defn run-block\n  [fns]\n  (when-first [f fns]\n    (let [obj (f)]\n      (if (async? obj)\n        (obj (let [d (delay (run-block (rest fns)))]\n               (fn []\n                 (if (realized? d)\n                   (println \"WARNING: Async test called done more than one time.\")\n                   @d))))\n        (recur (cond->> (rest fns)\n                 (::block? (meta obj)) (concat obj)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [408 425]},
 :full-name "cljs.test/run-block",
 :docstring "Invoke all functions in fns with no arguments. A fn can optionally\nreturn\n\nan async test - is invoked with a continuation running left fns\n\na seq of fns tagged per block - are invoked immediately after fn"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/run-block"]))
```

-->
