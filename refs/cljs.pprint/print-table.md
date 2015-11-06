## cljs.pprint/print-table



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/print-table</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/print-table)
</td>
</tr>
</table>


 <samp>
(__print-table__ ks rows)<br>
</samp>
 <samp>
(__print-table__ rows)<br>
</samp>

---





Source docstring:

```
Prints a collection of maps in a textual table. Prints table headings
ks, and then a line of output for each row, corresponding to the keys
in ks. If ks are not specified, use the keys of the first item in rows.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/cljs/pprint.cljs#L3295-L3319):

```clj
(defn print-table
  ([ks rows]
   (binding [*print-newline*]
     (when (seq rows)
       (let [widths (map
                      (fn [k]
                        (apply max (count (str k)) (map #(count (str (get % k))) rows)))
                      ks)
             spacers (map #(apply str (repeat % "-")) widths)
             fmt-row (fn [leader divider trailer row]
                       (str leader
                            (apply str (interpose divider
                                                  (for [[col width] (map vector (map #(get row %) ks) widths)]
                                                    (add-padding width (str col)))))
                            trailer))]
         (cljs.core/println)
         (cljs.core/println (fmt-row "| " " | " " |" (zipmap ks ks)))
         (cljs.core/println (fmt-row "|-" "-+-" "-|" (zipmap ks spacers)))
         (doseq [row rows]
           (cljs.core/println (fmt-row "| " " | " " |" row)))))))
  ([rows] (print-table (keys (first rows)) rows)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.166
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:3295-3319](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/cljs/pprint.cljs#L3295-L3319)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/print-table` @ clojuredocs](http://clojuredocs.org/clojure.pprint/print-table)<br>
[`clojure.pprint/print-table` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/print-table/)<br>
[`clojure.pprint/print-table` @ crossclj](http://crossclj.info/fun/clojure.pprint/print-table.html)<br>
[`cljs.pprint/print-table` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/print-table.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/print-table.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "print-table",
 :signature ["[ks rows]" "[rows]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint/print-table",
 :source {:code "(defn print-table\n  ([ks rows]\n   (binding [*print-newline*]\n     (when (seq rows)\n       (let [widths (map\n                      (fn [k]\n                        (apply max (count (str k)) (map #(count (str (get % k))) rows)))\n                      ks)\n             spacers (map #(apply str (repeat % \"-\")) widths)\n             fmt-row (fn [leader divider trailer row]\n                       (str leader\n                            (apply str (interpose divider\n                                                  (for [[col width] (map vector (map #(get row %) ks) widths)]\n                                                    (add-padding width (str col)))))\n                            trailer))]\n         (cljs.core/println)\n         (cljs.core/println (fmt-row \"| \" \" | \" \" |\" (zipmap ks ks)))\n         (cljs.core/println (fmt-row \"|-\" \"-+-\" \"-|\" (zipmap ks spacers)))\n         (doseq [row rows]\n           (cljs.core/println (fmt-row \"| \" \" | \" \" |\" row)))))))\n  ([rows] (print-table (keys (first rows)) rows)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.166",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [3295 3319]},
 :full-name "cljs.pprint/print-table",
 :clj-symbol "clojure.pprint/print-table",
 :docstring "Prints a collection of maps in a textual table. Prints table headings\nks, and then a line of output for each row, corresponding to the keys\nin ks. If ks are not specified, use the keys of the first item in rows."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/print-table"]))
```

-->
