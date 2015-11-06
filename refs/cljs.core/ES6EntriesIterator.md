## cljs.core/ES6EntriesIterator



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" title="Added in 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__ES6EntriesIterator.__ s)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/core.cljs#L4924-L4931):

```clj
(deftype ES6EntriesIterator [^:mutable s]
  Object
  (next [_]
    (if-not (nil? s)
      (let [[k v] (first s)]
        (set! s (next s))
        #js {:value #js [k v] :done false})
      #js {:value nil :done true})))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2371
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4924-4931](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/core.cljs#L4924-L4931)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/ES6EntriesIterator` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ES6EntriesIterator.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ES6EntriesIterator.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ES6EntriesIterator",
 :type "type",
 :signature ["[s]"],
 :source {:code "(deftype ES6EntriesIterator [^:mutable s]\n  Object\n  (next [_]\n    (if-not (nil? s)\n      (let [[k v] (first s)]\n        (set! s (next s))\n        #js {:value #js [k v] :done false})\n      #js {:value nil :done true})))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2371",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4924 4931]},
 :full-name "cljs.core/ES6EntriesIterator",
 :full-name-encode "cljs.core/ES6EntriesIterator",
 :history [["+" "0.0-2371"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ES6EntriesIterator"]))
```

-->
