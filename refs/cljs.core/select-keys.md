## cljs.core/select-keys



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/select-keys</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/select-keys)
</td>
</tr>
</table>


 <samp>
(__select-keys__ map keys)<br>
</samp>

---

Returns a map containing only those entries in `map` whose key is in `keys`.



---




Source docstring:

```
Returns a map containing only those entries in map whose key is in keys
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L7648-L7660):

```clj
(defn select-keys
  [map keyseq]
    (loop [ret {} keys (seq keyseq)]
      (if keys
        (let [key   (first keys)
              entry (get map key ::not-found)]
          (recur
           (if (not= entry ::not-found)
             (assoc ret key entry)
             ret)
           (next keys)))
        (with-meta ret (meta map)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7648-7660](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L7648-L7660)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/select-keys` @ clojuredocs](http://clojuredocs.org/clojure.core/select-keys)<br>
[`clojure.core/select-keys` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/select-keys/)<br>
[`clojure.core/select-keys` @ crossclj](http://crossclj.info/fun/clojure.core/select-keys.html)<br>
[`cljs.core/select-keys` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/select-keys.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/select-keys.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a map containing only those entries in `map` whose key is in `keys`.",
 :ns "cljs.core",
 :name "select-keys",
 :signature ["[map keys]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/select-keys",
 :source {:code "(defn select-keys\n  [map keyseq]\n    (loop [ret {} keys (seq keyseq)]\n      (if keys\n        (let [key   (first keys)\n              entry (get map key ::not-found)]\n          (recur\n           (if (not= entry ::not-found)\n             (assoc ret key entry)\n             ret)\n           (next keys)))\n        (with-meta ret (meta map)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7648 7660]},
 :full-name "cljs.core/select-keys",
 :clj-symbol "clojure.core/select-keys",
 :docstring "Returns a map containing only those entries in map whose key is in keys"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/select-keys"]))
```

-->
