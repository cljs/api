## cljs.core/IDerefWithTimeout



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/core.cljs#L538-L539):

```clj
(defprotocol IDerefWithTimeout
  (-deref-with-timeout [o msec timeout-val]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.58
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:538-539](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/core.cljs#L538-L539)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IDerefWithTimeout` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IDerefWithTimeout.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IDerefWithTimeout.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IDerefWithTimeout",
 :type "protocol",
 :full-name-encode "cljs.core/IDerefWithTimeout",
 :source {:code "(defprotocol IDerefWithTimeout\n  (-deref-with-timeout [o msec timeout-val]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.58",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [538 539]},
 :methods [{:name "-deref-with-timeout",
            :signature ["[o msec timeout-val]"],
            :docstring nil}],
 :full-name "cljs.core/IDerefWithTimeout",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IDerefWithTimeout"]))
```

-->
