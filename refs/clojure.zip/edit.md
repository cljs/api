## clojure.zip/edit



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/edit</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/edit)
</td>
</tr>
</table>


 <samp>
(__edit__ loc f & args)<br>
</samp>

---





Source docstring:

```
Replaces the node at this loc with the value of (f node args)
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/clojure/zip.cljs#L189-L192):

```clj
(defn edit
  [loc f & args]
    (replace loc (apply f (node loc) args)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2280
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:189-192](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/clojure/zip.cljs#L189-L192)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/edit` @ clojuredocs](http://clojuredocs.org/clojure.zip/edit)<br>
[`clojure.zip/edit` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/edit/)<br>
[`clojure.zip/edit` @ crossclj](http://crossclj.info/fun/clojure.zip/edit.html)<br>
[`clojure.zip/edit` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/edit.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/edit.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "edit",
 :signature ["[loc f & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/edit",
 :source {:code "(defn edit\n  [loc f & args]\n    (replace loc (apply f (node loc) args)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [189 192]},
 :full-name "clojure.zip/edit",
 :clj-symbol "clojure.zip/edit",
 :docstring "Replaces the node at this loc with the value of (f node args)"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/edit"]))
```

-->
