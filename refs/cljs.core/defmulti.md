## cljs.core/defmulti



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defmulti</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defmulti)
</td>
</tr>
</table>


 <samp>
(__defmulti__ mm-name & options)<br>
</samp>

---





Source docstring:

```
Creates a new multimethod with the associated dispatch function.
The docstring and attribute-map are optional.

Options are key-value pairs and may be one of:
  :default    the default dispatch value, defaults to :default
  :hierarchy  the isa? hierarchy to use for dispatching
              defaults to the global hierarchy
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L904-L948):

```clj
(defmacro defmulti
  [mm-name & options]
  (let [docstring   (if (core/string? (first options))
                      (first options)
                      nil)
        options     (if (core/string? (first options))
                      (next options)
                      options)
        m           (if (map? (first options))
                      (first options)
                      {})
        options     (if (map? (first options))
                      (next options)
                      options)
        dispatch-fn (first options)
        options     (next options)
        m           (if docstring
                      (assoc m :doc docstring)
                      m)
        m           (if (meta mm-name)
                      (conj (meta mm-name) m)
                      m)]
    (when (= (count options) 1)
      (throw "The syntax for defmulti has changed. Example: (defmulti name dispatch-fn :default dispatch-value)"))
    (let [options   (apply hash-map options)
          default   (get options :default :default)
          ;; hierarchy (get options :hierarchy #'cljs.core.global-hierarchy)
	  ]
      (check-valid-options options :default :hierarchy)
      `(def ~(with-meta mm-name m)
	 (let [method-table# (atom {})
	       prefer-table# (atom {})
	       method-cache# (atom {})
	       cached-hierarchy# (atom {})
	       hierarchy# (get ~options :hierarchy cljs.core/global-hierarchy)
	       ]
	   (cljs.core.MultiFn. ~(name mm-name) ~dispatch-fn ~default hierarchy#
			       method-table# prefer-table# method-cache# cached-hierarchy#))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:904-948](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L904-L948)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/defmulti` @ clojuredocs](http://clojuredocs.org/clojure.core/defmulti)<br>
[`clojure.core/defmulti` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/defmulti/)<br>
[`clojure.core/defmulti` @ crossclj](http://crossclj.info/fun/clojure.core/defmulti.html)<br>
[`cljs.core/defmulti` @ crossclj](http://crossclj.info/fun/cljs.core/defmulti.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/defmulti.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "defmulti",
 :signature ["[mm-name & options]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core/defmulti",
 :source {:code "(defmacro defmulti\n  [mm-name & options]\n  (let [docstring   (if (core/string? (first options))\n                      (first options)\n                      nil)\n        options     (if (core/string? (first options))\n                      (next options)\n                      options)\n        m           (if (map? (first options))\n                      (first options)\n                      {})\n        options     (if (map? (first options))\n                      (next options)\n                      options)\n        dispatch-fn (first options)\n        options     (next options)\n        m           (if docstring\n                      (assoc m :doc docstring)\n                      m)\n        m           (if (meta mm-name)\n                      (conj (meta mm-name) m)\n                      m)]\n    (when (= (count options) 1)\n      (throw \"The syntax for defmulti has changed. Example: (defmulti name dispatch-fn :default dispatch-value)\"))\n    (let [options   (apply hash-map options)\n          default   (get options :default :default)\n          ;; hierarchy (get options :hierarchy #'cljs.core.global-hierarchy)\n\t  ]\n      (check-valid-options options :default :hierarchy)\n      `(def ~(with-meta mm-name m)\n\t (let [method-table# (atom {})\n\t       prefer-table# (atom {})\n\t       method-cache# (atom {})\n\t       cached-hierarchy# (atom {})\n\t       hierarchy# (get ~options :hierarchy cljs.core/global-hierarchy)\n\t       ]\n\t   (cljs.core.MultiFn. ~(name mm-name) ~dispatch-fn ~default hierarchy#\n\t\t\t       method-table# prefer-table# method-cache# cached-hierarchy#))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/clj/cljs/core.clj",
          :lines [904 948]},
 :full-name "cljs.core/defmulti",
 :clj-symbol "clojure.core/defmulti",
 :docstring "Creates a new multimethod with the associated dispatch function.\nThe docstring and attribute-map are optional.\n\nOptions are key-value pairs and may be one of:\n  :default    the default dispatch value, defaults to :default\n  :hierarchy  the isa? hierarchy to use for dispatching\n              defaults to the global hierarchy"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defmulti"]))
```

-->
