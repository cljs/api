## clojure.core.reducers/take



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__take__ n)<br>
</samp>
 <samp>
(__take__ n coll)<br>
</samp>

---





Source docstring:

```
Ends the reduction of coll after consuming n values.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/core/reducers.cljs#L153-L165):

```clj
(defcurried take
  "Ends the reduction of coll after consuming n values."
  {}
  [n coll]
  (reducer coll
   (fn [f1]
     (let [cnt (atom n)]
       (rfn [f1 k]
         ([ret k v]
            (swap! cnt dec)
            (if (neg? @cnt)
              (reduced ret)
              (f1 ret k v))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:153-165](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/core/reducers.cljs#L153-L165)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/take` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/take.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/take.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "take",
 :signature ["[n]" "[n coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers/take",
 :source {:code "(defcurried take\n  \"Ends the reduction of coll after consuming n values.\"\n  {}\n  [n coll]\n  (reducer coll\n   (fn [f1]\n     (let [cnt (atom n)]\n       (rfn [f1 k]\n         ([ret k v]\n            (swap! cnt dec)\n            (if (neg? @cnt)\n              (reduced ret)\n              (f1 ret k v))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [153 165]},
 :full-name "clojure.core.reducers/take",
 :docstring "Ends the reduction of coll after consuming n values."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/take"]))
```

-->
