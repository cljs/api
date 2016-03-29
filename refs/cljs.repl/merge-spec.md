## ~~cljs.repl/merge-spec~~



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2655"><img valign="middle" alt="[×] 0.0-2655" title="Removed in 0.0-2655" src="https://img.shields.io/badge/×-0.0--2655-red.svg"></a> </td>
</tr>
</table>

<samp>(merge-spec \[lib & {:as aindex}\] \[_ & {:as bindex}\])</samp><br>

---

 <samp>
(__merge-spec__ \[lib & {:as aindex}\] \[_ & {:as bindex}\])<br>
</samp>

---







Source code @ [github]():

```clj
(defn merge-spec [[lib & {:as aindex}] [_ & {:as bindex}]]
  (let [merged-map
        (merge-with
          (fn [x y]
            (if (vector? x)
              (vec (distinct (into x y)))
              y))
          aindex bindex)]
    (apply vector lib
      (apply concat
        (sort
          (fn [[sa] [sb]]
            (compare (spec-sort sa) (spec-sort sb)))
          merged-map)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl/merge-spec` @ crossclj](http://crossclj.info/fun/cljs.repl/merge-spec.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/merge-spec.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "merge-spec",
 :signature ["[[lib & {:as aindex}] [_ & {:as bindex}]]"],
 :history [["+" "0.0-2629"] ["-" "0.0-2655"]],
 :type "function",
 :full-name-encode "cljs.repl/merge-spec",
 :source {:code "(defn merge-spec [[lib & {:as aindex}] [_ & {:as bindex}]]\n  (let [merged-map\n        (merge-with\n          (fn [x y]\n            (if (vector? x)\n              (vec (distinct (into x y)))\n              y))\n          aindex bindex)]\n    (apply vector lib\n      (apply concat\n        (sort\n          (fn [[sa] [sb]]\n            (compare (spec-sort sa) (spec-sort sb)))\n          merged-map)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/clj/cljs/repl.clj",
          :lines [196 209]},
 :usage ["(merge-spec [lib & {:as aindex}] [_ & {:as bindex}])"],
 :full-name "cljs.repl/merge-spec",
 :removed {:in "0.0-2655", :last-seen "0.0-2644"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/merge-spec"]))
```

-->
