## cljs.core/eduction



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" title="Added in 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__eduction__ xform coll)<br>
</samp>

---





Source docstring:

```
Returns a reducible/iterable/seqable application of
the transducer to the items in coll. Note that these applications	
will be performed every time iterator/seq/reduce is called.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/core.cljs#L8307-L8312):

```clj
(defn eduction
  [xform coll]
  (Eduction. xform coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2371
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8307-8312](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/core.cljs#L8307-L8312)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/eduction` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/eduction.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/eduction.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "eduction",
 :signature ["[xform coll]"],
 :history [["+" "0.0-2371"]],
 :type "function",
 :full-name-encode "cljs.core/eduction",
 :source {:code "(defn eduction\n  [xform coll]\n  (Eduction. xform coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2371",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8307 8312]},
 :full-name "cljs.core/eduction",
 :docstring "Returns a reducible/iterable/seqable application of\nthe transducer to the items in coll. Note that these applications\t\nwill be performed every time iterator/seq/reduce is called."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/eduction"]))
```

-->
