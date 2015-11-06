## cljs.pprint/pprint



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/pprint</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint)
</td>
</tr>
</table>


 <samp>
(__pprint__ object)<br>
</samp>
 <samp>
(__pprint__ object writer)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/pprint.cljs#L812-L823):

```clj
(defn pprint
  ([object]
   (let [sb (StringBuffer.)]
     (binding [*out* (StringBufferWriter. sb)]
       (pprint object *out*)
       (*print-fn* (str sb)))))
  ([object writer]
   (with-pretty-writer writer
                       (binding [*print-pretty* true]
                         (write-out object))
                       (if (not (= 0 (get-column *out*)))
                         (-write *out* \newline)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:812-823](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/pprint.cljs#L812-L823)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/pprint` @ clojuredocs](http://clojuredocs.org/clojure.pprint/pprint)<br>
[`clojure.pprint/pprint` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/pprint/)<br>
[`clojure.pprint/pprint` @ crossclj](http://crossclj.info/fun/clojure.pprint/pprint.html)<br>
[`cljs.pprint/pprint` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/pprint.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/pprint.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "pprint",
 :signature ["[object]" "[object writer]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint/pprint",
 :source {:code "(defn pprint\n  ([object]\n   (let [sb (StringBuffer.)]\n     (binding [*out* (StringBufferWriter. sb)]\n       (pprint object *out*)\n       (*print-fn* (str sb)))))\n  ([object writer]\n   (with-pretty-writer writer\n                       (binding [*print-pretty* true]\n                         (write-out object))\n                       (if (not (= 0 (get-column *out*)))\n                         (-write *out* \\newline)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [812 823]},
 :full-name "cljs.pprint/pprint",
 :clj-symbol "clojure.pprint/pprint"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/pprint"]))
```

-->
