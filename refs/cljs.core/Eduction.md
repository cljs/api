## cljs.core/Eduction



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" title="Added in 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(Eduction. xform coll)</samp><br>

---

 <samp>
(__Eduction.__ xform coll)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype Eduction [xform coll]
  Object
  (indexOf [coll x]
    (-indexOf coll x 0))
  (indexOf [coll x start]
    (-indexOf coll x start))
  (lastIndexOf [coll x]
    (-lastIndexOf coll x (count coll)))
  (lastIndexOf [coll x start]
    (-lastIndexOf coll x start))

  ISequential

  ISeqable
  (-seq [_] (seq (sequence xform coll)))

  IReduce
  (-reduce [_ f] (transduce xform (completing f) coll))
  (-reduce [_ f init] (transduce xform (completing f) init coll))

  IPrintWithWriter
  (-pr-writer [coll writer opts]
    (pr-sequential-writer writer pr-writer "(" " " ")" opts coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/Eduction` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Eduction.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Eduction.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Eduction",
 :signature ["[xform coll]"],
 :name-encode "Eduction",
 :history [["+" "0.0-2371"]],
 :type "type",
 :full-name-encode "cljs.core/Eduction",
 :source {:code "(deftype Eduction [xform coll]\n  Object\n  (indexOf [coll x]\n    (-indexOf coll x 0))\n  (indexOf [coll x start]\n    (-indexOf coll x start))\n  (lastIndexOf [coll x]\n    (-lastIndexOf coll x (count coll)))\n  (lastIndexOf [coll x start]\n    (-lastIndexOf coll x start))\n\n  ISequential\n\n  ISeqable\n  (-seq [_] (seq (sequence xform coll)))\n\n  IReduce\n  (-reduce [_ f] (transduce xform (completing f) coll))\n  (-reduce [_ f init] (transduce xform (completing f) init coll))\n\n  IPrintWithWriter\n  (-pr-writer [coll writer opts]\n    (pr-sequential-writer writer pr-writer \"(\" \" \" \")\" opts coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9503 9525],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/core.cljs#L9503-L9525"},
 :usage ["(Eduction. xform coll)"],
 :full-name "cljs.core/Eduction",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Eduction.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Eduction"]))
```

-->
