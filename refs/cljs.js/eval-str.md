## cljs.js/eval-str



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__eval-str__ state source cb)<br>
</samp>
 <samp>
(__eval-str__ state source name cb)<br>
</samp>
 <samp>
(__eval-str__ state source name opts cb)<br>
</samp>

---





Source docstring:

```
Evalute ClojureScript source given as a string. The parameters:

state (atom)
  the compiler state

source (string)
  the ClojureScript source

name (symbol)
  optional, the name of the source

opts (map)
  compilation options.

  :eval         - eval function to invoke, see *eval-fn*
  :load         - library resolution function, see *load-fn*
  :source-map   - set to true to generate inline source map information
  :cache-source - optional, a function to run side-effects with the
                  compilation result prior to actual evalution. This function
                  takes two arguments, the first is the eval map, the source
                  will be under :source. The second argument is a callback of
                  one argument. If an error occurs an :error key should be
                  supplied.

cb (function)
  callback, will be invoked with a map. If succesful the map will contain
  a :value key with the result of evaluation and :ns the current namespace.
  If unsuccessful will contain a :error key with an ex-info instance describing
  the cause of failure.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/js.cljs#L704-L748):

```clj
(defn eval-str
  ([state source cb]
   (eval-str state source nil cb))
  ([state source name cb]
   (eval-str state source name nil cb))
  ([state source name opts cb]
   {:pre [(atom? state) (string? source)
          (valid-name? name) (valid-opts? opts) (fn? cb)]}
   (eval-str*
     {:*compiler*     state
      :*data-readers* tags/*cljs-data-readers*
      :*analyze-deps* (or (:analyze-deps opts) true)
      :*load-macros*  (or (:load-macros opts) true)
      :*load-fn*      (or (:load opts) *load-fn*)
      :*eval-fn*      (or (:eval opts) *eval-fn*)}
     source name opts cb)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.58
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.cljs:704-748](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/js.cljs#L704-L748)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/eval-str` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/eval-str.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/eval-str.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "eval-str",
 :signature ["[state source cb]"
             "[state source name cb]"
             "[state source name opts cb]"],
 :history [["+" "1.7.10"]],
 :type "function",
 :full-name-encode "cljs.js/eval-str",
 :source {:code "(defn eval-str\n  ([state source cb]\n   (eval-str state source nil cb))\n  ([state source name cb]\n   (eval-str state source name nil cb))\n  ([state source name opts cb]\n   {:pre [(atom? state) (string? source)\n          (valid-name? name) (valid-opts? opts) (fn? cb)]}\n   (eval-str*\n     {:*compiler*     state\n      :*data-readers* tags/*cljs-data-readers*\n      :*analyze-deps* (or (:analyze-deps opts) true)\n      :*load-macros*  (or (:load-macros opts) true)\n      :*load-fn*      (or (:load opts) *load-fn*)\n      :*eval-fn*      (or (:eval opts) *eval-fn*)}\n     source name opts cb)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.58",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [704 748]},
 :full-name "cljs.js/eval-str",
 :docstring "Evalute ClojureScript source given as a string. The parameters:\n\nstate (atom)\n  the compiler state\n\nsource (string)\n  the ClojureScript source\n\nname (symbol)\n  optional, the name of the source\n\nopts (map)\n  compilation options.\n\n  :eval         - eval function to invoke, see *eval-fn*\n  :load         - library resolution function, see *load-fn*\n  :source-map   - set to true to generate inline source map information\n  :cache-source - optional, a function to run side-effects with the\n                  compilation result prior to actual evalution. This function\n                  takes two arguments, the first is the eval map, the source\n                  will be under :source. The second argument is a callback of\n                  one argument. If an error occurs an :error key should be\n                  supplied.\n\ncb (function)\n  callback, will be invoked with a map. If succesful the map will contain\n  a :value key with the result of evaluation and :ns the current namespace.\n  If unsuccessful will contain a :error key with an ex-info instance describing\n  the cause of failure."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/eval-str"]))
```

-->
