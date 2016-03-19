## cljs.pprint/pprint-tab



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/pprint-tab</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint-tab)
</td>
</tr>
</table>


 <samp>
(__pprint-tab__ kind colnum colinc)<br>
</samp>

---





Source docstring:

```
Tab at this point in the pretty printing stream. kind specifies whether the tab
is :line, :section, :line-relative, or :section-relative.

Colnum and colinc specify the target column and the increment to move the target
forward if the output is already past the original target.

This function is intended for use when writing custom dispatch functions.

Output is sent to *out* which must be a pretty printing writer.

THIS FUNCTION IS NOT YET IMPLEMENTED.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/pprint.cljs#L866-L881):

```clj
(defn pprint-tab
  [kind colnum colinc]
  (check-enumerated-arg kind #{:line :section :line-relative :section-relative})
  (throw (js/Error. "pprint-tab is not yet implemented")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:866-881](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/pprint.cljs#L866-L881)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/pprint-tab` @ clojuredocs](http://clojuredocs.org/clojure.pprint/pprint-tab)<br>
[`clojure.pprint/pprint-tab` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/pprint-tab/)<br>
[`clojure.pprint/pprint-tab` @ crossclj](http://crossclj.info/fun/clojure.pprint/pprint-tab.html)<br>
[`cljs.pprint/pprint-tab` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/pprint-tab.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/pprint-tab.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "pprint-tab",
 :signature ["[kind colnum colinc]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint/pprint-tab",
 :source {:code "(defn pprint-tab\n  [kind colnum colinc]\n  (check-enumerated-arg kind #{:line :section :line-relative :section-relative})\n  (throw (js/Error. \"pprint-tab is not yet implemented\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [866 881]},
 :full-name "cljs.pprint/pprint-tab",
 :clj-symbol "clojure.pprint/pprint-tab",
 :docstring "Tab at this point in the pretty printing stream. kind specifies whether the tab\nis :line, :section, :line-relative, or :section-relative.\n\nColnum and colinc specify the target column and the increment to move the target\nforward if the output is already past the original target.\n\nThis function is intended for use when writing custom dispatch functions.\n\nOutput is sent to *out* which must be a pretty printing writer.\n\nTHIS FUNCTION IS NOT YET IMPLEMENTED."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/pprint-tab"]))
```

-->
