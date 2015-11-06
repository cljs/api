## cljs.repl/print-doc



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__print-doc__ m)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/repl.cljs#L12-L49):

```clj
(defn print-doc [m]
  (println "-------------------------")
  (println (str (when-let [ns (:ns m)] (str ns "/")) (:name m)))
  (when (:protocol m)
    (println "Protocol"))
  (cond
    (:forms m) (doseq [f (:forms m)]
                 (println "  " f))
    (:arglists m) (let [arglists (:arglists m)]
                    (if (or (:macro m)
                         (:repl-special-function m))
                     (prn arglists)
                     (prn
                       (if (= 'quote (first arglists))
                         (second arglists)
                         arglists)))))
  (if (:special-form m)
    (do
      (println "Special Form")
      (println " " (:doc m)) 
      (if (contains? m :url)
        (when (:url m)
          (println (str "\n  Please see http://clojure.org/" (:url m))))
        (println (str "\n  Please see http://clojure.org/special_forms#"
                   (:name m)))))
    (do
      (when (:macro m)
        (println "Macro"))
      (when (:repl-special-function m)
        (println "REPL Special Function"))
      (println " " (:doc m))
      (when (:protocol m)
        (doseq [[name {:keys [doc arglists]}] (:methods m)]
          (println)
          (println " " name)
          (println " " arglists)
          (when doc
            (println " " doc)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.48
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[repl.cljs:12-49](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/repl.cljs#L12-L49)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/print-doc` @ crossclj](http://crossclj.info/fun/cljs.repl.cljs/print-doc.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/print-doc.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "print-doc",
 :type "function",
 :signature ["[m]"],
 :source {:code "(defn print-doc [m]\n  (println \"-------------------------\")\n  (println (str (when-let [ns (:ns m)] (str ns \"/\")) (:name m)))\n  (when (:protocol m)\n    (println \"Protocol\"))\n  (cond\n    (:forms m) (doseq [f (:forms m)]\n                 (println \"  \" f))\n    (:arglists m) (let [arglists (:arglists m)]\n                    (if (or (:macro m)\n                         (:repl-special-function m))\n                     (prn arglists)\n                     (prn\n                       (if (= 'quote (first arglists))\n                         (second arglists)\n                         arglists)))))\n  (if (:special-form m)\n    (do\n      (println \"Special Form\")\n      (println \" \" (:doc m)) \n      (if (contains? m :url)\n        (when (:url m)\n          (println (str \"\\n  Please see http://clojure.org/\" (:url m))))\n        (println (str \"\\n  Please see http://clojure.org/special_forms#\"\n                   (:name m)))))\n    (do\n      (when (:macro m)\n        (println \"Macro\"))\n      (when (:repl-special-function m)\n        (println \"REPL Special Function\"))\n      (println \" \" (:doc m))\n      (when (:protocol m)\n        (doseq [[name {:keys [doc arglists]}] (:methods m)]\n          (println)\n          (println \" \" name)\n          (println \" \" arglists)\n          (when doc\n            (println \" \" doc)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.48",
          :filename "src/main/cljs/cljs/repl.cljs",
          :lines [12 49]},
 :full-name "cljs.repl/print-doc",
 :full-name-encode "cljs.repl/print-doc",
 :history [["+" "0.0-2496"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/print-doc"]))
```

-->
