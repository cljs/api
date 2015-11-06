## clojure.set/join



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/join</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/join)
</td>
</tr>
</table>


 <samp>
(__join__ xrel yrel)<br>
</samp>
 <samp>
(__join__ xrel yrel km)<br>
</samp>

---





Source docstring:

```
When passed 2 rels, returns the rel corresponding to the natural
join. When passed an additional keymap, joins on the corresponding
keys.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/clojure/set.cljs#L102-L130):

```clj
(defn join
  ([xrel yrel] ;natural join
   (if (and (seq xrel) (seq yrel))
     (let [ks (intersection (set (keys (first xrel))) (set (keys (first yrel))))
           [r s] (if (<= (count xrel) (count yrel))
                   [xrel yrel]
                   [yrel xrel])
           idx (index r ks)]
       (reduce (fn [ret x]
                 (let [found (idx (select-keys x ks))]
                   (if found
                     (reduce #(conj %1 (merge %2 x)) ret found)
                     ret)))
               #{} s))
     #{}))
  ([xrel yrel km] ;arbitrary key mapping
   (let [[r s k] (if (<= (count xrel) (count yrel))
                   [xrel yrel (map-invert km)]
                   [yrel xrel km])
         idx (index r (vals k))]
     (reduce (fn [ret x]
               (let [found (idx (rename-keys (select-keys x (keys k)) k))]
                 (if found
                   (reduce #(conj %1 (merge %2 x)) ret found)
                   ret)))
             #{} s))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:102-130](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/clojure/set.cljs#L102-L130)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.set/join` @ clojuredocs](http://clojuredocs.org/clojure.set/join)<br>
[`clojure.set/join` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.set/join/)<br>
[`clojure.set/join` @ crossclj](http://crossclj.info/fun/clojure.set/join.html)<br>
[`clojure.set/join` @ crossclj](http://crossclj.info/fun/clojure.set.cljs/join.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set/join.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.set",
 :name "join",
 :signature ["[xrel yrel]" "[xrel yrel km]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set/join",
 :source {:code "(defn join\n  ([xrel yrel] ;natural join\n   (if (and (seq xrel) (seq yrel))\n     (let [ks (intersection (set (keys (first xrel))) (set (keys (first yrel))))\n           [r s] (if (<= (count xrel) (count yrel))\n                   [xrel yrel]\n                   [yrel xrel])\n           idx (index r ks)]\n       (reduce (fn [ret x]\n                 (let [found (idx (select-keys x ks))]\n                   (if found\n                     (reduce #(conj %1 (merge %2 x)) ret found)\n                     ret)))\n               #{} s))\n     #{}))\n  ([xrel yrel km] ;arbitrary key mapping\n   (let [[r s k] (if (<= (count xrel) (count yrel))\n                   [xrel yrel (map-invert km)]\n                   [yrel xrel km])\n         idx (index r (vals k))]\n     (reduce (fn [ret x]\n               (let [found (idx (rename-keys (select-keys x (keys k)) k))]\n                 (if found\n                   (reduce #(conj %1 (merge %2 x)) ret found)\n                   ret)))\n             #{} s))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/cljs/clojure/set.cljs",
          :lines [102 130]},
 :full-name "clojure.set/join",
 :clj-symbol "clojure.set/join",
 :docstring "When passed 2 rels, returns the rel corresponding to the natural\njoin. When passed an additional keymap, joins on the corresponding\nkeys."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/join"]))
```

-->
