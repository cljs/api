## cljs.core/ISwap



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2173"><img valign="middle" alt="[+] 0.0-2173" title="Added in 0.0-2173" src="https://img.shields.io/badge/+-0.0--2173-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L415-L416):

```clj
(defprotocol ISwap
  (-swap! [o f] [o f a] [o f a b] [o f a b xs]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:415-416](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L415-L416)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/ISwap` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ISwap.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ISwap.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ISwap",
 :type "protocol",
 :full-name-encode "cljs.core/ISwap",
 :source {:code "(defprotocol ISwap\n  (-swap! [o f] [o f a] [o f a b] [o f a b xs]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/cljs/core.cljs",
          :lines [415 416]},
 :methods [{:name "-swap!",
            :signature ["[o f]" "[o f a]" "[o f a b]" "[o f a b xs]"],
            :docstring nil}],
 :full-name "cljs.core/ISwap",
 :history [["+" "0.0-2173"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISwap"]))
```

-->
