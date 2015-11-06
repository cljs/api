## cljs.pprint/get-pretty-writer



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/get-pretty-writer</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/get-pretty-writer)
</td>
</tr>
</table>


 <samp>
(__get-pretty-writer__ writer)<br>
</samp>

---





Source docstring:

```
Returns the IWriter passed in wrapped in a pretty writer proxy, unless it's
already a pretty writer. Generally, it is unnecessary to call this function, since pprint,
write, and cl-format all call it if they need to. However if you want the state to be
preserved across calls, you will want to wrap them with this.

For example, when you want to generate column-aware output with multiple calls to cl-format,
do it like in this example:

    (defn print-table [aseq column-width]
      (binding [*out* (get-pretty-writer *out*)]
        (doseq [row aseq]
          (doseq [col row]
            (cl-format true "~4D~7,vT" col column-width))
          (prn))))

Now when you run:

    user> (print-table (map #(vector % (* % %) (* % % %)) (range 1 11)) 8)

It prints a table of squares and cubes for the numbers from 1 to 10:

       1      1       1
       2      4       8
       3      9      27
       4     16      64
       5     25     125
       6     36     216
       7     49     343
       8     64     512
       9     81     729
      10    100    1000
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/pprint.cljs#L2065-L2100):

```clj
(defn get-pretty-writer
  [writer]
  (if (pretty-writer? writer)
    writer
    (pretty-writer writer *print-right-margin* *print-miser-width*)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:2065-2100](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/pprint.cljs#L2065-L2100)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/get-pretty-writer` @ clojuredocs](http://clojuredocs.org/clojure.pprint/get-pretty-writer)<br>
[`clojure.pprint/get-pretty-writer` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/get-pretty-writer/)<br>
[`clojure.pprint/get-pretty-writer` @ crossclj](http://crossclj.info/fun/clojure.pprint/get-pretty-writer.html)<br>
[`cljs.pprint/get-pretty-writer` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/get-pretty-writer.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/get-pretty-writer.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "get-pretty-writer",
 :signature ["[writer]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint/get-pretty-writer",
 :source {:code "(defn get-pretty-writer\n  [writer]\n  (if (pretty-writer? writer)\n    writer\n    (pretty-writer writer *print-right-margin* *print-miser-width*)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [2065 2100]},
 :full-name "cljs.pprint/get-pretty-writer",
 :clj-symbol "clojure.pprint/get-pretty-writer",
 :docstring "Returns the IWriter passed in wrapped in a pretty writer proxy, unless it's\nalready a pretty writer. Generally, it is unnecessary to call this function, since pprint,\nwrite, and cl-format all call it if they need to. However if you want the state to be\npreserved across calls, you will want to wrap them with this.\n\nFor example, when you want to generate column-aware output with multiple calls to cl-format,\ndo it like in this example:\n\n    (defn print-table [aseq column-width]\n      (binding [*out* (get-pretty-writer *out*)]\n        (doseq [row aseq]\n          (doseq [col row]\n            (cl-format true \"~4D~7,vT\" col column-width))\n          (prn))))\n\nNow when you run:\n\n    user> (print-table (map #(vector % (* % %) (* % % %)) (range 1 11)) 8)\n\nIt prints a table of squares and cubes for the numbers from 1 to 10:\n\n       1      1       1\n       2      4       8\n       3      9      27\n       4     16      64\n       5     25     125\n       6     36     216\n       7     49     343\n       8     64     512\n       9     81     729\n      10    100    1000"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/get-pretty-writer"]))
```

-->
