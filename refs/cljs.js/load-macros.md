## ~~cljs.js/load-macros~~



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.28"><img valign="middle" alt="[×] 1.7.28" title="Removed in 1.7.28" src="https://img.shields.io/badge/×-1.7.28-red.svg"></a> </td>
</tr>
</table>

<samp>(load-macros bound-vars k macros reload reloads opts cb)</samp><br>

---

 <samp>
(__load-macros__ bound-vars k macros reload reloads opts cb)<br>
</samp>

---







Source code @ [github]():

```clj
(defn load-macros [bound-vars k macros reload reloads opts cb]
  (if (seq macros)
    (let [nsym (first (vals macros))
          k    (or (k reload)
                   (get-in reloads [k nsym])
                   (and (= nsym name) (:*reload-macros* bound-vars) :reload))]
      (require bound-vars nsym k
        (-> opts
          (assoc :macros-ns true)
          (dissoc :context)
          (dissoc :ns))
        (fn [res]
          (if-not (:error res)
            (load-macros bound-vars k (next macros) reload reloads opts cb)
            (cb res)))))
    (cb {:value nil})))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.js/load-macros` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/load-macros.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/load-macros.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "load-macros",
 :signature ["[bound-vars k macros reload reloads opts cb]"],
 :history [["+" "1.7.10"] ["-" "1.7.28"]],
 :type "function",
 :full-name-encode "cljs.js/load-macros",
 :source {:code "(defn load-macros [bound-vars k macros reload reloads opts cb]\n  (if (seq macros)\n    (let [nsym (first (vals macros))\n          k    (or (k reload)\n                   (get-in reloads [k nsym])\n                   (and (= nsym name) (:*reload-macros* bound-vars) :reload))]\n      (require bound-vars nsym k\n        (-> opts\n          (assoc :macros-ns true)\n          (dissoc :context)\n          (dissoc :ns))\n        (fn [res]\n          (if-not (:error res)\n            (load-macros bound-vars k (next macros) reload reloads opts cb)\n            (cb res)))))\n    (cb {:value nil})))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [300 315]},
 :usage ["(load-macros bound-vars k macros reload reloads opts cb)"],
 :full-name "cljs.js/load-macros",
 :removed {:in "1.7.28", :last-seen "1.7.10"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/load-macros"]))
```

-->
