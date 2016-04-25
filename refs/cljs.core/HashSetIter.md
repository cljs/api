## cljs.core/HashSetIter



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.28"><img valign="middle" alt="[+] 1.7.28" title="Added in 1.7.28" src="https://img.shields.io/badge/+-1.7.28-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(HashSetIter. iter)</samp><br>

---

 <samp>
(__HashSetIter.__ iter)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype HashSetIter [iter]
  Object
  (hasNext [_]
    (.hasNext iter))
  (next [_]
    (if ^boolean (.hasNext iter)
      (aget (.-tail (.next iter)) 0)
      (throw (js/Error. "No such element"))))
  (remove [_] (js/Error. "Unsupported operation")))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/HashSetIter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/HashSetIter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/HashSetIter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "HashSetIter",
 :signature ["[iter]"],
 :name-encode "HashSetIter",
 :history [["+" "1.7.28"]],
 :type "type",
 :full-name-encode "cljs.core/HashSetIter",
 :source {:code "(deftype HashSetIter [iter]\n  Object\n  (hasNext [_]\n    (.hasNext iter))\n  (next [_]\n    (if ^boolean (.hasNext iter)\n      (aget (.-tail (.next iter)) 0)\n      (throw (js/Error. \"No such element\"))))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8197 8205],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/core.cljs#L8197-L8205"},
 :usage ["(HashSetIter. iter)"],
 :full-name "cljs.core/HashSetIter",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/HashSetIter.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/HashSetIter"]))
```

-->
