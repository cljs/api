## cljs.core/find-ns-obj



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__find-ns-obj__ ns)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/core.cljs#L10104-L10112):

```clj
(defn find-ns-obj [ns]
  (let [munged-ns (munge (str ns))
        segs (.split munged-ns ".")]
    (case *target*
      "nodejs"  (if ^boolean js/COMPILED
                  (js/eval munged-ns)
                  (find-ns-obj* js/global segs))
      "default" (find-ns-obj* js/window segs)
      (throw (js/Error. (str "find-ns-obj not supported for target " *target*))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.48
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:10104-10112](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/core.cljs#L10104-L10112)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/find-ns-obj` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/find-ns-obj.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/find-ns-obj.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "find-ns-obj",
 :type "function",
 :signature ["[ns]"],
 :source {:code "(defn find-ns-obj [ns]\n  (let [munged-ns (munge (str ns))\n        segs (.split munged-ns \".\")]\n    (case *target*\n      \"nodejs\"  (if ^boolean js/COMPILED\n                  (js/eval munged-ns)\n                  (find-ns-obj* js/global segs))\n      \"default\" (find-ns-obj* js/window segs)\n      (throw (js/Error. (str \"find-ns-obj not supported for target \" *target*))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.48",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [10104 10112]},
 :full-name "cljs.core/find-ns-obj",
 :full-name-encode "cljs.core/find-ns-obj",
 :history [["+" "1.7.10"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/find-ns-obj"]))
```

-->
