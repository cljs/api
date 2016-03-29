## ~~cljs.js/load-deps~~



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.28"><img valign="middle" alt="[×] 1.7.28" title="Removed in 1.7.28" src="https://img.shields.io/badge/×-1.7.28-red.svg"></a> </td>
</tr>
</table>

<samp>(load-deps bound-vars ana-env lib deps cb)</samp><br>
<samp>(load-deps bound-vars ana-env lib deps opts cb)</samp><br>

---

 <samp>
(__load-deps__ bound-vars ana-env lib deps cb)<br>
</samp>
 <samp>
(__load-deps__ bound-vars ana-env lib deps opts cb)<br>
</samp>

---







Source code @ [github]():

```clj
(defn load-deps
  ([bound-vars ana-env lib deps cb]
   (analyze-deps bound-vars ana-env lib deps nil cb))
  ([bound-vars ana-env lib deps opts cb]
   (when (:verbose opts)
     (debug-prn "Loading dependencies for" lib))
   (binding [ana/*cljs-dep-set* (vary-meta (conj (:*cljs-dep-set* bound-vars) lib)
                                  update-in [:dep-path] conj lib)]
     (assert (every? #(not (contains? (:*cljs-dep-set* bound-vars) %)) deps)
       (str "Circular dependency detected "
         (-> (:*cljs-dep-set* bound-vars) meta :dep-path)))
     (if (seq deps)
       (let [dep (first deps)]
         (require bound-vars dep
           (-> opts
             (dissoc :context)
             (dissoc :ns))
           (fn [res]
             (if-not (:error res)
               (load-deps bound-vars ana-env lib (next deps) opts cb)
               (cb res)))))
       (cb {:value nil})))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.js/load-deps` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/load-deps.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/load-deps.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "load-deps",
 :signature ["[bound-vars ana-env lib deps cb]"
             "[bound-vars ana-env lib deps opts cb]"],
 :history [["+" "1.7.10"] ["-" "1.7.28"]],
 :type "function",
 :full-name-encode "cljs.js/load-deps",
 :source {:code "(defn load-deps\n  ([bound-vars ana-env lib deps cb]\n   (analyze-deps bound-vars ana-env lib deps nil cb))\n  ([bound-vars ana-env lib deps opts cb]\n   (when (:verbose opts)\n     (debug-prn \"Loading dependencies for\" lib))\n   (binding [ana/*cljs-dep-set* (vary-meta (conj (:*cljs-dep-set* bound-vars) lib)\n                                  update-in [:dep-path] conj lib)]\n     (assert (every? #(not (contains? (:*cljs-dep-set* bound-vars) %)) deps)\n       (str \"Circular dependency detected \"\n         (-> (:*cljs-dep-set* bound-vars) meta :dep-path)))\n     (if (seq deps)\n       (let [dep (first deps)]\n         (require bound-vars dep\n           (-> opts\n             (dissoc :context)\n             (dissoc :ns))\n           (fn [res]\n             (if-not (:error res)\n               (load-deps bound-vars ana-env lib (next deps) opts cb)\n               (cb res)))))\n       (cb {:value nil})))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [236 257]},
 :usage ["(load-deps bound-vars ana-env lib deps cb)"
         "(load-deps bound-vars ana-env lib deps opts cb)"],
 :full-name "cljs.js/load-deps",
 :removed {:in "1.7.28", :last-seen "1.7.10"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/load-deps"]))
```

-->
