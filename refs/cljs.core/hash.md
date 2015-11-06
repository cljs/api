## cljs.core/hash



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash)
</td>
</tr>
</table>


 <samp>
(__hash__ o)<br>
</samp>
 <samp>
(__hash__ o check-cache)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1896/src/cljs/cljs/core.cljs#L1074-L1079):

```clj
(defn hash
  ([o] (hash o true))
  ([o ^boolean check-cache]
     (if (and ^boolean (goog/isString o) check-cache)
       (check-string-hash-cache o)
       (-hash o))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1896
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1074-1079](https://github.com/clojure/clojurescript/blob/r1896/src/cljs/cljs/core.cljs#L1074-L1079)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/hash` @ clojuredocs](http://clojuredocs.org/clojure.core/hash)<br>
[`clojure.core/hash` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/hash/)<br>
[`clojure.core/hash` @ crossclj](http://crossclj.info/fun/clojure.core/hash.html)<br>
[`cljs.core/hash` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/hash.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/hash.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "hash",
 :signature ["[o]" "[o check-cache]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/hash",
 :source {:code "(defn hash\n  ([o] (hash o true))\n  ([o ^boolean check-cache]\n     (if (and ^boolean (goog/isString o) check-cache)\n       (check-string-hash-cache o)\n       (-hash o))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1896",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1074 1079]},
 :full-name "cljs.core/hash",
 :clj-symbol "clojure.core/hash"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash"]))
```

-->
