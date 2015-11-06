## cljs.core/IWatchable



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/cljs/core.cljs#L310-L313):

```clj
(defprotocol IWatchable
  (-notify-watches [this oldval newval])
  (-add-watch [this key f])
  (-remove-watch [this key]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1886
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:310-313](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/cljs/core.cljs#L310-L313)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IWatchable` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IWatchable.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IWatchable.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IWatchable",
 :type "protocol",
 :full-name-encode "cljs.core/IWatchable",
 :source {:code "(defprotocol IWatchable\n  (-notify-watches [this oldval newval])\n  (-add-watch [this key f])\n  (-remove-watch [this key]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1886",
          :filename "src/cljs/cljs/core.cljs",
          :lines [310 313]},
 :methods [{:name "-notify-watches",
            :signature ["[this oldval newval]"],
            :docstring nil}
           {:name "-add-watch",
            :signature ["[this key f]"],
            :docstring nil}
           {:name "-remove-watch",
            :signature ["[this key]"],
            :docstring nil}],
 :full-name "cljs.core/IWatchable",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IWatchable"]))
```

-->
