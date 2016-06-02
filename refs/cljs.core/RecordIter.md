## cljs.core/RecordIter



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.28"><img valign="middle" alt="[+] 1.7.28" title="Added in 1.7.28" src="https://img.shields.io/badge/+-1.7.28-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(RecordIter. i record base-count fields ext-map-iter)</samp><br>

---

 <samp>
(__RecordIter.__ i record base-count fields ext-map-iter)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype RecordIter [^:mutable i record base-count fields ext-map-iter]
  Object
  (hasNext [_]
    (or (< i base-count) (.hasNext ext-map-iter)))
  (next [_]
    (if (< i base-count)
      (let [k (nth fields i)]
        (set! i (inc i))
        [k (-lookup record k)])
      (.next ext-map-iter)))
  (remove [_] (js/Error. "Unsupported operation")))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/RecordIter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/RecordIter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/RecordIter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "RecordIter",
 :signature ["[i record base-count fields ext-map-iter]"],
 :name-encode "RecordIter",
 :history [["+" "1.7.28"]],
 :type "type",
 :full-name-encode "cljs.core/RecordIter",
 :source {:code "(deftype RecordIter [^:mutable i record base-count fields ext-map-iter]\n  Object\n  (hasNext [_]\n    (or (< i base-count) (.hasNext ext-map-iter)))\n  (next [_]\n    (if (< i base-count)\n      (let [k (nth fields i)]\n        (set! i (inc i))\n        [k (-lookup record k)])\n      (.next ext-map-iter)))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [5831 5841],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/core.cljs#L5831-L5841"},
 :usage ["(RecordIter. i record base-count fields ext-map-iter)"],
 :full-name "cljs.core/RecordIter",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/RecordIter.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/RecordIter"]))
```

-->
