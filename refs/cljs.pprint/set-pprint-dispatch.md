## cljs.pprint/set-pprint-dispatch



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/set-pprint-dispatch</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/set-pprint-dispatch)
</td>
</tr>
</table>


 <samp>
(__set-pprint-dispatch__ function)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/cljs/pprint.cljs#L824-L827):

```clj
(defn set-pprint-dispatch
  [function]
  (set! *print-pprint-dispatch* function)
  nil)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.166
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:824-827](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/cljs/pprint.cljs#L824-L827)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/set-pprint-dispatch` @ clojuredocs](http://clojuredocs.org/clojure.pprint/set-pprint-dispatch)<br>
[`clojure.pprint/set-pprint-dispatch` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/set-pprint-dispatch/)<br>
[`clojure.pprint/set-pprint-dispatch` @ crossclj](http://crossclj.info/fun/clojure.pprint/set-pprint-dispatch.html)<br>
[`cljs.pprint/set-pprint-dispatch` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/set-pprint-dispatch.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/set-pprint-dispatch.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "set-pprint-dispatch",
 :signature ["[function]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint/set-pprint-dispatch",
 :source {:code "(defn set-pprint-dispatch\n  [function]\n  (set! *print-pprint-dispatch* function)\n  nil)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.166",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [824 827]},
 :full-name "cljs.pprint/set-pprint-dispatch",
 :clj-symbol "clojure.pprint/set-pprint-dispatch"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/set-pprint-dispatch"]))
```

-->
