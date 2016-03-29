## cljs.core/ns-unmap



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3169"><img valign="middle" alt="[+] 0.0-3169" title="Added in 0.0-3169" src="https://img.shields.io/badge/+-0.0--3169-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns-unmap</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-unmap)
</td>
</tr>
</table>

<samp>(ns-unmap \[quote0 ns\] \[quote1 sym\])</samp><br>

---

 <samp>
(__ns-unmap__ \[quote0 ns\] \[quote1 sym\])<br>
</samp>

---





Source docstring:

```
Removes the mappings for the symbol from the namespace.
```


Source code @ [github]():

```clj
(core/defmacro ns-unmap
  [[quote0 ns] [quote1 sym]]
  (core/assert (core/and (= quote0 'quote) (core/symbol? ns)
                         (= quote1 'quote) (core/symbol? sym))
    "Arguments to ns-unmap must be quoted symbols")
  (swap! env/*compiler* update-in [::ana/namespaces ns :defs] dissoc sym)
  `(js-delete ~(comp/munge ns) ~(comp/munge (core/str sym))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/ns-unmap` @ clojuredocs](http://clojuredocs.org/clojure.core/ns-unmap)<br>
[`clojure.core/ns-unmap` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/ns-unmap/)<br>
[`clojure.core/ns-unmap` @ crossclj](http://crossclj.info/fun/clojure.core/ns-unmap.html)<br>
[`cljs.core/ns-unmap` @ crossclj](http://crossclj.info/fun/cljs.core/ns-unmap.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ns-unmap.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ns-unmap",
 :signature ["[[quote0 ns] [quote1 sym]]"],
 :name-encode "ns-unmap",
 :history [["+" "0.0-3169"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.core/ns-unmap",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-unmap"},
 :full-name-encode "cljs.core/ns-unmap",
 :source {:code "(core/defmacro ns-unmap\n  [[quote0 ns] [quote1 sym]]\n  (core/assert (core/and (= quote0 'quote) (core/symbol? ns)\n                         (= quote1 'quote) (core/symbol? sym))\n    \"Arguments to ns-unmap must be quoted symbols\")\n  (swap! env/*compiler* update-in [::ana/namespaces ns :defs] dissoc sym)\n  `(js-delete ~(comp/munge ns) ~(comp/munge (core/str sym))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [2659 2666],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/core.cljc#L2659-L2666"},
 :usage ["(ns-unmap [quote0 ns] [quote1 sym])"],
 :full-name "cljs.core/ns-unmap",
 :docstring "Removes the mappings for the symbol from the namespace.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ns-unmap.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ns-unmap"]))
```

-->
