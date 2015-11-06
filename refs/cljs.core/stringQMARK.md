## cljs.core/string?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/string?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/string?)
</td>
</tr>
</table>


 <samp>
(__string?__ x)<br>
</samp>

---

Returns true if `x` is a string, false otherwise.



---






Source code @ [github](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L848-L851):

```clj
(defn ^boolean string? [x]
  (and (goog/isString x)
       (not (or (identical? (.charAt x 0) \uFDD0)
                (identical? (.charAt x 0) \uFDD1)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:848-851](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L848-L851)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/string?` @ clojuredocs](http://clojuredocs.org/clojure.core/string_q)<br>
[`clojure.core/string?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/string%3F/)<br>
[`clojure.core/string?` @ crossclj](http://crossclj.info/fun/clojure.core/string%3F.html)<br>
[`cljs.core/string?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/string%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/stringQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` is a string, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "string?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/stringQMARK",
 :source {:code "(defn ^boolean string? [x]\n  (and (goog/isString x)\n       (not (or (identical? (.charAt x 0) \\uFDD0)\n                (identical? (.charAt x 0) \\uFDD1)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [848 851]},
 :full-name "cljs.core/string?",
 :clj-symbol "clojure.core/string?"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/string?"]))
```

-->
