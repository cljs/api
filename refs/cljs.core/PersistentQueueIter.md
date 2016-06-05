## cljs.core/PersistentQueueIter



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.28"><img valign="middle" alt="[+] 1.7.28" title="Added in 1.7.28" src="https://img.shields.io/badge/+-1.7.28-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(PersistentQueueIter. fseq riter)</samp><br>

---

 <samp>
(__PersistentQueueIter.__ fseq riter)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype PersistentQueueIter [^:mutable fseq riter]
  Object
  (hasNext [_]
    (or (and (some? fseq) (seq fseq)) (and (some? riter) (.hasNext riter))))
  (next [_]
    (cond
      (some? fseq)
      (let [ret (first fseq)]
        (set! fseq (next fseq))
        ret)
      (and (some? riter) ^boolean (.hasNext riter))
      (.next riter)
      :else (throw (js/Error. "No such element"))))
  (remove [_] (js/Error. "Unsupported operation")))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentQueueIter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentQueueIter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentQueueIter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentQueueIter",
 :signature ["[fseq riter]"],
 :name-encode "PersistentQueueIter",
 :history [["+" "1.7.28"]],
 :type "type",
 :full-name-encode "cljs.core/PersistentQueueIter",
 :source {:code "(deftype PersistentQueueIter [^:mutable fseq riter]\n  Object\n  (hasNext [_]\n    (or (and (some? fseq) (seq fseq)) (and (some? riter) (.hasNext riter))))\n  (next [_]\n    (cond\n      (some? fseq)\n      (let [ret (first fseq)]\n        (set! fseq (next fseq))\n        ret)\n      (and (some? riter) ^boolean (.hasNext riter))\n      (.next riter)\n      :else (throw (js/Error. \"No such element\"))))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [5518 5531],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/core.cljs#L5518-L5531"},
 :usage ["(PersistentQueueIter. fseq riter)"],
 :full-name "cljs.core/PersistentQueueIter",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentQueueIter.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentQueueIter"]))
```

-->
