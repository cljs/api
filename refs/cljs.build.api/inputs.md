## cljs.build.api/inputs



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3208"><img valign="middle" alt="[+] 0.0-3208" title="Added in 0.0-3208" src="https://img.shields.io/badge/+-0.0--3208-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__inputs__ & xs)<br>
</samp>

---





Source docstring:

```
Given a list of directories and files, return a compilable object that may
be passed to build or watch.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/build/api.clj#L140-L155):

```clj
(defn inputs
  [& xs]
  (reify
    closure/Inputs
    (-paths [_]
      (map io/file xs))
    closure/Compilable
    (-compile [_ opts]
      (letfn [(compile-input [x]
                (let [compiled (closure/-compile x opts)]
                  (if (sequential? compiled)
                    compiled
                    [compiled])))]
        (mapcat compile-input xs)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:140-155](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/build/api.clj#L140-L155)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.build.api/inputs` @ crossclj](http://crossclj.info/fun/cljs.build.api/inputs.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api/inputs.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.build.api",
 :name "inputs",
 :signature ["[& xs]"],
 :history [["+" "0.0-3208"]],
 :type "function",
 :full-name-encode "cljs.build.api/inputs",
 :source {:code "(defn inputs\n  [& xs]\n  (reify\n    closure/Inputs\n    (-paths [_]\n      (map io/file xs))\n    closure/Compilable\n    (-compile [_ opts]\n      (letfn [(compile-input [x]\n                (let [compiled (closure/-compile x opts)]\n                  (if (sequential? compiled)\n                    compiled\n                    [compiled])))]\n        (mapcat compile-input xs)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [140 155]},
 :full-name "cljs.build.api/inputs",
 :docstring "Given a list of directories and files, return a compilable object that may\nbe passed to build or watch."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/inputs"]))
```

-->
