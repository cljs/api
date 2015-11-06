## cljs.core/ES6IteratorSeq



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2411"><img valign="middle" alt="[+] 0.0-2411" title="Added in 0.0-2411" src="https://img.shields.io/badge/+-0.0--2411-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__ES6IteratorSeq.__ value iter _rest)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L1026-L1034):

```clj
(deftype ES6IteratorSeq [value iter ^:mutable _rest]
  ISeqable
  (-seq [this] this)
  ISeq
  (-first [_] value)
  (-rest [_]
    (when (nil? _rest)
      (set! _rest (es6-iterator-seq iter)))
    _rest))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1026-1034](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L1026-L1034)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/ES6IteratorSeq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ES6IteratorSeq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ES6IteratorSeq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ES6IteratorSeq",
 :type "type",
 :signature ["[value iter _rest]"],
 :source {:code "(deftype ES6IteratorSeq [value iter ^:mutable _rest]\n  ISeqable\n  (-seq [this] this)\n  ISeq\n  (-first [_] value)\n  (-rest [_]\n    (when (nil? _rest)\n      (set! _rest (es6-iterator-seq iter)))\n    _rest))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1026 1034]},
 :full-name "cljs.core/ES6IteratorSeq",
 :full-name-encode "cljs.core/ES6IteratorSeq",
 :history [["+" "0.0-2411"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ES6IteratorSeq"]))
```

-->
