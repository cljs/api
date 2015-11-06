## ~~cljs.js/analyze~~



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.28"><img valign="middle" alt="[×] 1.7.28" title="Removed in 1.7.28" src="https://img.shields.io/badge/×-1.7.28-red.svg"></a> </td>
</tr>
</table>


 <samp>
(__analyze__ state source cb)<br>
</samp>
 <samp>
(__analyze__ state source name cb)<br>
</samp>
 <samp>
(__analyze__ state source name opts cb)<br>
</samp>

---





Source docstring:

```
Analyze ClojureScript source. The compiler state will be populated with
the results of analyzes. The parameters:

state (atom)
  the compiler state

source (string)
  the ClojureScript source

name (symbol)
  optional, the name of the source

opts (map)
  compilation options.

:eval - the eval function to invoke, see *eval-fn*
:load - library resolution function, see *load-fn*

cb (function)
  callback, will be invoked with a map. If successful the map will contain
  a key :value, the actual value is not meaningful. If unsuccessful the
  map will contain a key :error with an ex-info instance describing the cause
  of failure.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.cljs#L423-L459):

```clj
(defn analyze
  ([state source cb]
   (analyze state source nil cb))
  ([state source name cb]
   (analyze state source name nil cb))
  ([state source name opts cb]
   {:pre [(atom? state) (string? source)
          (valid-name? name) (valid-opts? opts) (fn? cb)]}
   (analyze*
     {:*compiler*     state
      :*data-readers* tags/*cljs-data-readers*
      :*load-fn*      (or (:load opts) *load-fn*)
      :*eval-fn*      (or (:eval opts) *eval-fn*)}
     source name opts cb)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.cljs:423-459](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.cljs#L423-L459)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/analyze` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/analyze.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/analyze.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "analyze",
 :signature ["[state source cb]"
             "[state source name cb]"
             "[state source name opts cb]"],
 :history [["+" "1.7.10"] ["-" "1.7.28"]],
 :type "function",
 :full-name-encode "cljs.js/analyze",
 :source {:code "(defn analyze\n  ([state source cb]\n   (analyze state source nil cb))\n  ([state source name cb]\n   (analyze state source name nil cb))\n  ([state source name opts cb]\n   {:pre [(atom? state) (string? source)\n          (valid-name? name) (valid-opts? opts) (fn? cb)]}\n   (analyze*\n     {:*compiler*     state\n      :*data-readers* tags/*cljs-data-readers*\n      :*load-fn*      (or (:load opts) *load-fn*)\n      :*eval-fn*      (or (:eval opts) *eval-fn*)}\n     source name opts cb)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [423 459]},
 :full-name "cljs.js/analyze",
 :docstring "Analyze ClojureScript source. The compiler state will be populated with\nthe results of analyzes. The parameters:\n\nstate (atom)\n  the compiler state\n\nsource (string)\n  the ClojureScript source\n\nname (symbol)\n  optional, the name of the source\n\nopts (map)\n  compilation options.\n\n:eval - the eval function to invoke, see *eval-fn*\n:load - library resolution function, see *load-fn*\n\ncb (function)\n  callback, will be invoked with a map. If successful the map will contain\n  a key :value, the actual value is not meaningful. If unsuccessful the\n  map will contain a key :error with an ex-info instance describing the cause\n  of failure.",
 :removed {:in "1.7.28", :last-seen "1.7.10"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/analyze"]))
```

-->
