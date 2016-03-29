## ~~cljs.core/Iteration~~



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[×] 0.0-2371" title="Removed in 0.0-2371" src="https://img.shields.io/badge/×-0.0--2371-red.svg"></a> </td>
</tr>
</table>

<samp>(Iteration. xform coll)</samp><br>

---

 <samp>
(__Iteration.__ xform coll)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype Iteration [xform coll]
   ISequential
   
   ISeqable
   (-seq [_] (seq (sequence xform coll)))

   IReduce
   (-reduce [_ f init] (transduce xform f init coll))

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

[`cljs.core/Iteration` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Iteration.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Iteration.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Iteration",
 :signature ["[xform coll]"],
 :history [["+" "0.0-2301"] ["-" "0.0-2371"]],
 :type "type",
 :full-name-encode "cljs.core/Iteration",
 :source {:code "(deftype Iteration [xform coll]\n   ISequential\n   \n   ISeqable\n   (-seq [_] (seq (sequence xform coll)))\n\n   IReduce\n   (-reduce [_ f init] (transduce xform f init coll))\n\n   IPrintWithWriter\n   (-pr-writer [coll writer opts]\n     (pr-sequential-writer writer pr-writer \"(\" \" \" \")\" opts coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8192 8203]},
 :usage ["(Iteration. xform coll)"],
 :full-name "cljs.core/Iteration",
 :removed {:in "0.0-2371", :last-seen "0.0-2356"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Iteration"]))
```

-->
