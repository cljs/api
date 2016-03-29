## ~~cljs.core/PersistentArrayMap.fromArrays~~



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[×] 0.0-1798" title="Removed in 0.0-1798" src="https://img.shields.io/badge/×-0.0--1798-red.svg"></a> </td>
</tr>
</table>

<samp>(PersistentArrayMap.fromArrays ks vs)</samp><br>

---

 <samp>
(__PersistentArrayMap.fromArrays__ ks vs)<br>
</samp>

---







Source code @ [github]():

```clj
(set! cljs.core.PersistentArrayMap/fromArrays
      (fn [ks vs]
        (let [len (count ks)]
          (loop [i   0
                 out (transient cljs.core.PersistentArrayMap/EMPTY)]
            (if (< i len)
              (recur (inc i) (assoc! out (aget ks i) (aget vs i)))
              (persistent! out))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentArrayMap.fromArrays` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentArrayMap.fromArrays.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentArrayMapDOTfromArrays.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentArrayMap.fromArrays",
 :signature ["[ks vs]"],
 :history [["+" "0.0-1211"] ["-" "0.0-1798"]],
 :parent-type "PersistentArrayMap",
 :type "function",
 :full-name-encode "cljs.core/PersistentArrayMapDOTfromArrays",
 :source {:code "(set! cljs.core.PersistentArrayMap/fromArrays\n      (fn [ks vs]\n        (let [len (count ks)]\n          (loop [i   0\n                 out (transient cljs.core.PersistentArrayMap/EMPTY)]\n            (if (< i len)\n              (recur (inc i) (assoc! out (aget ks i) (aget vs i)))\n              (persistent! out))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1586",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3976 3983]},
 :usage ["(PersistentArrayMap.fromArrays ks vs)"],
 :full-name "cljs.core/PersistentArrayMap.fromArrays",
 :removed {:in "0.0-1798", :last-seen "0.0-1586"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentArrayMap.fromArrays"]))
```

-->
