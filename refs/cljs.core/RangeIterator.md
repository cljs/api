## cljs.core/RangeIterator



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" title="Added in 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__RangeIterator.__ i end step)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L8404-L8413):

```clj
(deftype RangeIterator [^:mutable i end step]
  Object
  (hasNext [_]
    (if (pos? step)
      (< i end)
      (> i end)))
  (next [_]
    (let [ret i]
      (set! i (+ i step))
      ret)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:8404-8413](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L8404-L8413)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/RangeIterator` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/RangeIterator.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/RangeIterator.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "RangeIterator",
 :type "type",
 :signature ["[i end step]"],
 :source {:code "(deftype RangeIterator [^:mutable i end step]\n  Object\n  (hasNext [_]\n    (if (pos? step)\n      (< i end)\n      (> i end)))\n  (next [_]\n    (let [ret i]\n      (set! i (+ i step))\n      ret)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8404 8413]},
 :full-name "cljs.core/RangeIterator",
 :full-name-encode "cljs.core/RangeIterator",
 :history [["+" "0.0-2371"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/RangeIterator"]))
```

-->
