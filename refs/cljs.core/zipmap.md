## cljs.core/zipmap



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/zipmap</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/zipmap)
</td>
</tr>
</table>


 <samp>
(__zipmap__ keys vals)<br>
</samp>

---

Returns a map with `keys` mapped to corresponding `vals`.

<pre>user=> (zipmap [:a :b :c :d] [1 2 3 4])
{:a 1, :b 2, :c 3, :d 4}</pre>



---


###### See Also:

[`cljs.core/interleave`](../cljs.core/interleave.md)<br>

---


Source docstring:

```
Returns a map with the keys mapped to the corresponding vals.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/cljs/core.cljs#L6249-L6259):

```clj
(defn zipmap
  [keys vals]
    (loop [map (transient {})
           ks (seq keys)
           vs (seq vals)]
      (if (and ks vs)
        (recur (assoc! map (first ks) (first vs))
               (next ks)
               (next vs))
        (persistent! map))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1859
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6249-6259](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/cljs/core.cljs#L6249-L6259)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/zipmap` @ clojuredocs](http://clojuredocs.org/clojure.core/zipmap)<br>
[`clojure.core/zipmap` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/zipmap/)<br>
[`clojure.core/zipmap` @ crossclj](http://crossclj.info/fun/clojure.core/zipmap.html)<br>
[`cljs.core/zipmap` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/zipmap.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/zipmap.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a map with `keys` mapped to corresponding `vals`.\n\n<pre>user=> (zipmap [:a :b :c :d] [1 2 3 4])\n{:a 1, :b 2, :c 3, :d 4}</pre>",
 :ns "cljs.core",
 :name "zipmap",
 :signature ["[keys vals]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/interleave"],
 :full-name-encode "cljs.core/zipmap",
 :source {:code "(defn zipmap\n  [keys vals]\n    (loop [map (transient {})\n           ks (seq keys)\n           vs (seq vals)]\n      (if (and ks vs)\n        (recur (assoc! map (first ks) (first vs))\n               (next ks)\n               (next vs))\n        (persistent! map))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1859",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6249 6259]},
 :full-name "cljs.core/zipmap",
 :clj-symbol "clojure.core/zipmap",
 :docstring "Returns a map with the keys mapped to the corresponding vals."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/zipmap"]))
```

-->
