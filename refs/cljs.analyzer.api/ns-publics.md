## cljs.analyzer.api/ns-publics



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" title="Added in 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns-publics</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-publics)
</td>
</tr>
</table>

<samp>(ns-publics ns)</samp><br>
<samp>(ns-publics state ns)</samp><br>

---

 <samp>
(__ns-publics__ ns)<br>
</samp>
 <samp>
(__ns-publics__ state ns)<br>
</samp>

---





Source docstring:

```
Given a namespace return all the public var analysis maps. Analagous to
clojure.core/ns-publics but returns var analysis maps not vars.
```


Source code @ [github]():

```clj
(defn ns-publics
  ([ns]
   (ns-publics env/*compiler* ns))
  ([state ns]
   {:pre [(symbol? ns)]}
   (->> (merge
          (get-in @state [::ana/namespaces ns :macros])
          (get-in @state [::ana/namespaces ns :defs]))
        (remove (fn [[k v]] (:private v)))
        (into {}))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/ns-publics` @ clojuredocs](http://clojuredocs.org/clojure.core/ns-publics)<br>
[`clojure.core/ns-publics` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/ns-publics/)<br>
[`clojure.core/ns-publics` @ crossclj](http://crossclj.info/fun/clojure.core/ns-publics.html)<br>
[`cljs.analyzer.api/ns-publics` @ crossclj](http://crossclj.info/fun/cljs.analyzer.api/ns-publics.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/ns-publics.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.analyzer.api",
 :name "ns-publics",
 :signature ["[ns]" "[state ns]"],
 :name-encode "ns-publics",
 :history [["+" "0.0-2985"]],
 :type "function",
 :clj-equiv {:full-name "clojure.core/ns-publics",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-publics"},
 :full-name-encode "cljs.analyzer.api/ns-publics",
 :source {:code "(defn ns-publics\n  ([ns]\n   (ns-publics env/*compiler* ns))\n  ([state ns]\n   {:pre [(symbol? ns)]}\n   (->> (merge\n          (get-in @state [::ana/namespaces ns :macros])\n          (get-in @state [::ana/namespaces ns :defs]))\n        (remove (fn [[k v]] (:private v)))\n        (into {}))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/clojure/cljs/analyzer/api.cljc",
          :lines [183 194],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/clojure/cljs/analyzer/api.cljc#L183-L194"},
 :usage ["(ns-publics ns)" "(ns-publics state ns)"],
 :full-name "cljs.analyzer.api/ns-publics",
 :docstring "Given a namespace return all the public var analysis maps. Analagous to\nclojure.core/ns-publics but returns var analysis maps not vars.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/ns-publics.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/ns-publics"]))
```

-->
