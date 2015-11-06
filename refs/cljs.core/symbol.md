## cljs.core/symbol



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/symbol</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/symbol)
</td>
</tr>
</table>


 <samp>
(__symbol__ name)<br>
</samp>
 <samp>
(__symbol__ ns name)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/core.cljs#L944-L957):

```clj
(defn symbol
  ([name]
   (if (symbol? name)
     name
     (let [idx (.indexOf name "/")]
       (if (== idx -1)
         (symbol nil name)
         (symbol (.substring name 0 idx)
                 (.substring name (inc idx) (. name -length)))))))
  ([ns name]
   (let [sym-str (if-not (nil? ns)
                   (str ns "/" name)
                   name)]
     (Symbol. ns name sym-str nil nil))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.48
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:944-957](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/core.cljs#L944-L957)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/symbol` @ clojuredocs](http://clojuredocs.org/clojure.core/symbol)<br>
[`clojure.core/symbol` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/symbol/)<br>
[`clojure.core/symbol` @ crossclj](http://crossclj.info/fun/clojure.core/symbol.html)<br>
[`cljs.core/symbol` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/symbol.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/symbol.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "symbol",
 :signature ["[name]" "[ns name]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/symbol",
 :source {:code "(defn symbol\n  ([name]\n   (if (symbol? name)\n     name\n     (let [idx (.indexOf name \"/\")]\n       (if (== idx -1)\n         (symbol nil name)\n         (symbol (.substring name 0 idx)\n                 (.substring name (inc idx) (. name -length)))))))\n  ([ns name]\n   (let [sym-str (if-not (nil? ns)\n                   (str ns \"/\" name)\n                   name)]\n     (Symbol. ns name sym-str nil nil))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.48",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [944 957]},
 :full-name "cljs.core/symbol",
 :clj-symbol "clojure.core/symbol"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/symbol"]))
```

-->
