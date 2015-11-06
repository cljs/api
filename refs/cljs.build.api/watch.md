## cljs.build.api/watch



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3208"><img valign="middle" alt="[+] 0.0-3208" title="Added in 0.0-3208" src="https://img.shields.io/badge/+-0.0--3208-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__watch__ source opts)<br>
</samp>
 <samp>
(__watch__ source opts compiler-env)<br>
</samp>
 <samp>
(__watch__ source opts compiler-env stop)<br>
</samp>

---





Source docstring:

```
Given a source which can be compiled, watch it for changes to produce.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/build/api.clj#L179-L186):

```clj
(defn watch
  ([source opts]
   (closure/watch source opts))
  ([source opts compiler-env]
   (closure/watch source opts compiler-env))
  ([source opts compiler-env stop]
   (closure/watch source opts compiler-env stop)))
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
                    └── <ins>[api.clj:179-186](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/build/api.clj#L179-L186)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.build.api/watch` @ crossclj](http://crossclj.info/fun/cljs.build.api/watch.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api/watch.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.build.api",
 :name "watch",
 :signature ["[source opts]"
             "[source opts compiler-env]"
             "[source opts compiler-env stop]"],
 :history [["+" "0.0-3208"]],
 :type "function",
 :full-name-encode "cljs.build.api/watch",
 :source {:code "(defn watch\n  ([source opts]\n   (closure/watch source opts))\n  ([source opts compiler-env]\n   (closure/watch source opts compiler-env))\n  ([source opts compiler-env stop]\n   (closure/watch source opts compiler-env stop)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [179 186]},
 :full-name "cljs.build.api/watch",
 :docstring "Given a source which can be compiled, watch it for changes to produce."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/watch"]))
```

-->
