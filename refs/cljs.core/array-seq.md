## cljs.core/array-seq



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__array-seq__ array)<br>
</samp>
 <samp>
(__array-seq__ array i)<br>
</samp>

---

Creates a `seq` from a JavaScript array, starting at index `i` if given.



---

###### Examples:

```clj
(array-seq #js [1 2 3])
;;=> (1 2 3)

(array-seq #js [1 2 3] 1)
;;=> (2 3)
```



---





Source code @ [github](https://github.com/clojure/clojurescript/blob/r2156/src/cljs/cljs/core.cljs#L741-L745):

```clj
(defn array-seq
  ([array]
     (prim-seq array 0))
  ([array i]
     (prim-seq array i)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2156
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:741-745](https://github.com/clojure/clojurescript/blob/r2156/src/cljs/cljs/core.cljs#L741-L745)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/array-seq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/array-seq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/array-seq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Creates a `seq` from a JavaScript array, starting at index `i` if given.",
 :ns "cljs.core",
 :name "array-seq",
 :signature ["[array]" "[array i]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/array-seq",
 :source {:code "(defn array-seq\n  ([array]\n     (prim-seq array 0))\n  ([array i]\n     (prim-seq array i)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2156",
          :filename "src/cljs/cljs/core.cljs",
          :lines [741 745]},
 :examples [{:id "9ef6de",
             :content "```clj\n(array-seq #js [1 2 3])\n;;=> (1 2 3)\n\n(array-seq #js [1 2 3] 1)\n;;=> (2 3)\n```"}],
 :full-name "cljs.core/array-seq"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array-seq"]))
```

-->
