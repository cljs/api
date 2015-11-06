## clojure.set/project



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/project</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/project)
</td>
</tr>
</table>


 <samp>
(__project__ xrel ks)<br>
</samp>

---





Source docstring:

```
Returns a rel of the elements of xrel with only the keys in ks
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/clojure/set.cljs#L67-L70):

```clj
(defn project
  [xrel ks]
    (set (map #(select-keys % ks) xrel)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2067
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:67-70](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/clojure/set.cljs#L67-L70)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.set/project` @ clojuredocs](http://clojuredocs.org/clojure.set/project)<br>
[`clojure.set/project` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.set/project/)<br>
[`clojure.set/project` @ crossclj](http://crossclj.info/fun/clojure.set/project.html)<br>
[`clojure.set/project` @ crossclj](http://crossclj.info/fun/clojure.set.cljs/project.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set/project.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.set",
 :name "project",
 :signature ["[xrel ks]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set/project",
 :source {:code "(defn project\n  [xrel ks]\n    (set (map #(select-keys % ks) xrel)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/cljs/clojure/set.cljs",
          :lines [67 70]},
 :full-name "clojure.set/project",
 :clj-symbol "clojure.set/project",
 :docstring "Returns a rel of the elements of xrel with only the keys in ks"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/project"]))
```

-->
