## cljs.core/IMultiFn



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3117/src/cljs/cljs/core.cljs#L9238-L9245):

```clj
(defprotocol IMultiFn
  (-reset [mf])
  (-add-method [mf dispatch-val method])
  (-remove-method [mf dispatch-val])
  (-prefer-method [mf dispatch-val dispatch-val-y])
  (-get-method [mf dispatch-val])
  (-methods [mf])
  (-prefers [mf]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3117
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9238-9245](https://github.com/clojure/clojurescript/blob/r3117/src/cljs/cljs/core.cljs#L9238-L9245)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IMultiFn` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IMultiFn.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IMultiFn.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IMultiFn",
 :type "protocol",
 :full-name-encode "cljs.core/IMultiFn",
 :source {:code "(defprotocol IMultiFn\n  (-reset [mf])\n  (-add-method [mf dispatch-val method])\n  (-remove-method [mf dispatch-val])\n  (-prefer-method [mf dispatch-val dispatch-val-y])\n  (-get-method [mf dispatch-val])\n  (-methods [mf])\n  (-prefers [mf]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9238 9245]},
 :methods [{:name "-reset", :signature ["[mf]"], :docstring nil}
           {:name "-add-method",
            :signature ["[mf dispatch-val method]"],
            :docstring nil}
           {:name "-remove-method",
            :signature ["[mf dispatch-val]"],
            :docstring nil}
           {:name "-prefer-method",
            :signature ["[mf dispatch-val dispatch-val-y]"],
            :docstring nil}
           {:name "-get-method",
            :signature ["[mf dispatch-val]"],
            :docstring nil}
           {:name "-methods", :signature ["[mf]"], :docstring nil}
           {:name "-prefers", :signature ["[mf]"], :docstring nil}],
 :full-name "cljs.core/IMultiFn",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IMultiFn"]))
```

-->
