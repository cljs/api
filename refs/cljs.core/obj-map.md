## cljs.core/obj-map



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" title="Added in 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__obj-map__ & keyvals)<br>
</samp>

---





Source docstring:

```
keyval => key val
Returns a new object map with supplied mappings.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/core.cljs#L7749-L7760):

```clj
(defn obj-map
  [& keyvals]
  (let [ks  (array)
        obj (js-obj)]
    (loop [kvs (seq keyvals)]
      (if kvs
        (do (.push ks (first kvs))
            (aset obj (first kvs) (second kvs))
            (recur (nnext kvs)))
        (.fromObject ObjMap ks obj)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.170
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:7749-7760](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/core.cljs#L7749-L7760)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/obj-map` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/obj-map.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/obj-map.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "obj-map",
 :signature ["[& keyvals]"],
 :history [["+" "0.0-1443"]],
 :type "function",
 :full-name-encode "cljs.core/obj-map",
 :source {:code "(defn obj-map\n  [& keyvals]\n  (let [ks  (array)\n        obj (js-obj)]\n    (loop [kvs (seq keyvals)]\n      (if kvs\n        (do (.push ks (first kvs))\n            (aset obj (first kvs) (second kvs))\n            (recur (nnext kvs)))\n        (.fromObject ObjMap ks obj)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.170",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [7749 7760]},
 :full-name "cljs.core/obj-map",
 :docstring "keyval => key val\nReturns a new object map with supplied mappings."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/obj-map"]))
```

-->
