## cljs.js/\*load-fn\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Each runtime environment provides a different way to load a library.
Whatever function *load-fn* is bound to will be passed two arguments - a
map and a callback function: The map will have the following keys:

:name   - the name of the library (a symbol)
:macros - modifier signaling a macros namespace load
:path   - munged relative library path (a string)

It is up to the implementor to correctly resolve the corresponding .cljs,
.cljc, or .js resource (the order must be respected). If :macros is true
resolution should only consider .clj or .cljc resources (the order must be
respected). Upon resolution the callback should be invoked with a map
containing the following keys:

:lang       - the language, :clj or :js
:source     - the source of the library (a string)
:cache      - optional, if a :clj namespace has been precompiled to :js, can
              give an analysis cache for faster loads.
:source-map - optional, if a :clj namespace has been precompiled to :js, can
              give a V3 source map JSON

If the resource could not be resolved, the callback should be invoked with
nil.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.107/src/main/cljs/cljs/js.cljs#L50-L77):

```clj
(defonce
  ^{:doc "Each runtime environment provides a different way to load a library.
  Whatever function *load-fn* is bound to will be passed two arguments - a
  map and a callback function: The map will have the following keys:

  :name   - the name of the library (a symbol)
  :macros - modifier signaling a macros namespace load
  :path   - munged relative library path (a string)

  It is up to the implementor to correctly resolve the corresponding .cljs,
  .cljc, or .js resource (the order must be respected). If :macros is true
  resolution should only consider .clj or .cljc resources (the order must be
  respected). Upon resolution the callback should be invoked with a map
  containing the following keys:

  :lang       - the language, :clj or :js
  :source     - the source of the library (a string)
  :cache      - optional, if a :clj namespace has been precompiled to :js, can
                give an analysis cache for faster loads.
  :source-map - optional, if a :clj namespace has been precompiled to :js, can
                give a V3 source map JSON

  If the resource could not be resolved, the callback should be invoked with
  nil."
    :dynamic true}
  *load-fn*
  (fn [name cb]
    (throw (js/Error. "No *load-fn* set"))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.107
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.cljs:50-77](https://github.com/clojure/clojurescript/blob/r1.7.107/src/main/cljs/cljs/js.cljs#L50-L77)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/*load-fn*` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/*load-fn*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/STARload-fnSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "*load-fn*",
 :docstring "Each runtime environment provides a different way to load a library.\nWhatever function *load-fn* is bound to will be passed two arguments - a\nmap and a callback function: The map will have the following keys:\n\n:name   - the name of the library (a symbol)\n:macros - modifier signaling a macros namespace load\n:path   - munged relative library path (a string)\n\nIt is up to the implementor to correctly resolve the corresponding .cljs,\n.cljc, or .js resource (the order must be respected). If :macros is true\nresolution should only consider .clj or .cljc resources (the order must be\nrespected). Upon resolution the callback should be invoked with a map\ncontaining the following keys:\n\n:lang       - the language, :clj or :js\n:source     - the source of the library (a string)\n:cache      - optional, if a :clj namespace has been precompiled to :js, can\n              give an analysis cache for faster loads.\n:source-map - optional, if a :clj namespace has been precompiled to :js, can\n              give a V3 source map JSON\n\nIf the resource could not be resolved, the callback should be invoked with\nnil.",
 :type "dynamic var",
 :source {:code "(defonce\n  ^{:doc \"Each runtime environment provides a different way to load a library.\n  Whatever function *load-fn* is bound to will be passed two arguments - a\n  map and a callback function: The map will have the following keys:\n\n  :name   - the name of the library (a symbol)\n  :macros - modifier signaling a macros namespace load\n  :path   - munged relative library path (a string)\n\n  It is up to the implementor to correctly resolve the corresponding .cljs,\n  .cljc, or .js resource (the order must be respected). If :macros is true\n  resolution should only consider .clj or .cljc resources (the order must be\n  respected). Upon resolution the callback should be invoked with a map\n  containing the following keys:\n\n  :lang       - the language, :clj or :js\n  :source     - the source of the library (a string)\n  :cache      - optional, if a :clj namespace has been precompiled to :js, can\n                give an analysis cache for faster loads.\n  :source-map - optional, if a :clj namespace has been precompiled to :js, can\n                give a V3 source map JSON\n\n  If the resource could not be resolved, the callback should be invoked with\n  nil.\"\n    :dynamic true}\n  *load-fn*\n  (fn [name cb]\n    (throw (js/Error. \"No *load-fn* set\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.107",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [50 77]},
 :full-name "cljs.js/*load-fn*",
 :full-name-encode "cljs.js/STARload-fnSTAR",
 :history [["+" "1.7.10"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/*load-fn*"]))
```

-->
