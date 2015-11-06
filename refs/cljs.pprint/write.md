## cljs.pprint/write



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/write</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/write)
</td>
</tr>
</table>


 <samp>
(__write__ object & kw-args)<br>
</samp>

---





Source docstring:

```
Write an object subject to the current bindings of the printer control variables.
Use the kw-args argument to override individual variables for this call (and any
recursive calls). Returns the string result if :stream is nil or nil otherwise.

The following keyword arguments can be passed with values:
  Keyword              Meaning                              Default value
  :stream              Writer for output or nil             true (indicates *out*)
  :base                Base to use for writing rationals    Current value of *print-base*
  :circle*             If true, mark circular structures    Current value of *print-circle*
  :length              Maximum elements to show in sublists Current value of *print-length*
  :level               Maximum depth                        Current value of *print-level*
  :lines*              Maximum lines of output              Current value of *print-lines*
  :miser-width         Width to enter miser mode            Current value of *print-miser-width*
  :dispatch            The pretty print dispatch function   Current value of *print-pprint-dispatch*
  :pretty              If true, do pretty printing          Current value of *print-pretty*
  :radix               If true, prepend a radix specifier   Current value of *print-radix*
  :readably*           If true, print readably              Current value of *print-readably*
  :right-margin        The column for the right margin      Current value of *print-right-margin*
  :suppress-namespaces If true, no namespaces in symbols    Current value of *print-suppress-namespaces*

  * = not yet supported

```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/cljs/pprint.cljs#L748-L809):

```clj
(defn write
  [object & kw-args]
  (let [options (merge {:stream true} (apply hash-map kw-args))]
    ;;TODO rewrite this as a macro
    (binding [cljs.pprint/*print-base* (:base options cljs.pprint/*print-base*)
              ;;:case             *print-case*,
              cljs.pprint/*print-circle* (:circle options cljs.pprint/*print-circle*)
              ;;:escape           *print-escape*
              ;;:gensym           *print-gensym*
              cljs.core/*print-length* (:length options cljs.core/*print-length*)
              cljs.core/*print-level* (:level options cljs.core/*print-level*)
              cljs.pprint/*print-lines* (:lines options cljs.pprint/*print-lines*)
              cljs.pprint/*print-miser-width* (:miser-width options cljs.pprint/*print-miser-width*)
              cljs.pprint/*print-pprint-dispatch* (:dispatch options cljs.pprint/*print-pprint-dispatch*)
              cljs.pprint/*print-pretty* (:pretty options cljs.pprint/*print-pretty*)
              cljs.pprint/*print-radix* (:radix options cljs.pprint/*print-radix*)
              cljs.core/*print-readably* (:readably options cljs.core/*print-readably*)
              cljs.pprint/*print-right-margin* (:right-margin options cljs.pprint/*print-right-margin*)
              cljs.pprint/*print-suppress-namespaces* (:suppress-namespaces options cljs.pprint/*print-suppress-namespaces*)]
      ;;TODO enable printing base
      #_[bindings (if (or (not (= *print-base* 10)) *print-radix*)
                  {#'pr pr-with-base}
                  {})]
      (binding []
        (let [sb (StringBuffer.)
              optval (if (contains? options :stream)
                       (:stream options)
                       true)
              base-writer (if (or (true? optval) (nil? optval))
                            (StringBufferWriter. sb)
                            optval)]
          (if *print-pretty*
            (with-pretty-writer base-writer
                                (write-out object))
            (binding [*out* base-writer]
              (pr object)))
          (if (true? optval)
            (*print-fn* (str sb)))
          (if (nil? optval)
            (str sb)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.166
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:748-809](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/cljs/pprint.cljs#L748-L809)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/write` @ clojuredocs](http://clojuredocs.org/clojure.pprint/write)<br>
[`clojure.pprint/write` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/write/)<br>
[`clojure.pprint/write` @ crossclj](http://crossclj.info/fun/clojure.pprint/write.html)<br>
[`cljs.pprint/write` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/write.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/write.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "write",
 :signature ["[object & kw-args]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint/write",
 :source {:code "(defn write\n  [object & kw-args]\n  (let [options (merge {:stream true} (apply hash-map kw-args))]\n    ;;TODO rewrite this as a macro\n    (binding [cljs.pprint/*print-base* (:base options cljs.pprint/*print-base*)\n              ;;:case             *print-case*,\n              cljs.pprint/*print-circle* (:circle options cljs.pprint/*print-circle*)\n              ;;:escape           *print-escape*\n              ;;:gensym           *print-gensym*\n              cljs.core/*print-length* (:length options cljs.core/*print-length*)\n              cljs.core/*print-level* (:level options cljs.core/*print-level*)\n              cljs.pprint/*print-lines* (:lines options cljs.pprint/*print-lines*)\n              cljs.pprint/*print-miser-width* (:miser-width options cljs.pprint/*print-miser-width*)\n              cljs.pprint/*print-pprint-dispatch* (:dispatch options cljs.pprint/*print-pprint-dispatch*)\n              cljs.pprint/*print-pretty* (:pretty options cljs.pprint/*print-pretty*)\n              cljs.pprint/*print-radix* (:radix options cljs.pprint/*print-radix*)\n              cljs.core/*print-readably* (:readably options cljs.core/*print-readably*)\n              cljs.pprint/*print-right-margin* (:right-margin options cljs.pprint/*print-right-margin*)\n              cljs.pprint/*print-suppress-namespaces* (:suppress-namespaces options cljs.pprint/*print-suppress-namespaces*)]\n      ;;TODO enable printing base\n      #_[bindings (if (or (not (= *print-base* 10)) *print-radix*)\n                  {#'pr pr-with-base}\n                  {})]\n      (binding []\n        (let [sb (StringBuffer.)\n              optval (if (contains? options :stream)\n                       (:stream options)\n                       true)\n              base-writer (if (or (true? optval) (nil? optval))\n                            (StringBufferWriter. sb)\n                            optval)]\n          (if *print-pretty*\n            (with-pretty-writer base-writer\n                                (write-out object))\n            (binding [*out* base-writer]\n              (pr object)))\n          (if (true? optval)\n            (*print-fn* (str sb)))\n          (if (nil? optval)\n            (str sb)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.166",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [748 809]},
 :full-name "cljs.pprint/write",
 :clj-symbol "clojure.pprint/write",
 :docstring "Write an object subject to the current bindings of the printer control variables.\nUse the kw-args argument to override individual variables for this call (and any\nrecursive calls). Returns the string result if :stream is nil or nil otherwise.\n\nThe following keyword arguments can be passed with values:\n  Keyword              Meaning                              Default value\n  :stream              Writer for output or nil             true (indicates *out*)\n  :base                Base to use for writing rationals    Current value of *print-base*\n  :circle*             If true, mark circular structures    Current value of *print-circle*\n  :length              Maximum elements to show in sublists Current value of *print-length*\n  :level               Maximum depth                        Current value of *print-level*\n  :lines*              Maximum lines of output              Current value of *print-lines*\n  :miser-width         Width to enter miser mode            Current value of *print-miser-width*\n  :dispatch            The pretty print dispatch function   Current value of *print-pprint-dispatch*\n  :pretty              If true, do pretty printing          Current value of *print-pretty*\n  :radix               If true, prepend a radix specifier   Current value of *print-radix*\n  :readably*           If true, print readably              Current value of *print-readably*\n  :right-margin        The column for the right margin      Current value of *print-right-margin*\n  :suppress-namespaces If true, no namespaces in symbols    Current value of *print-suppress-namespaces*\n\n  * = not yet supported\n"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/write"]))
```

-->
