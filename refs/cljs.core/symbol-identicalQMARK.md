## cljs.core/symbol-identical?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(symbol-identical? x y)</samp><br>

---

 <samp>
(__symbol-identical?__ x y)<br>
</samp>

---





Source docstring:

```
Efficient test to determine that two symbols are identical.
```


Source code @ [github]():

```clj
(defn ^boolean symbol-identical?
  [x y]
  (if (identical? x y)
    true
    (if (and (symbol? x) (symbol? y))
      (identical? (.-str x) (.-str y))
      false)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/symbol-identical?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/symbol-identical%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/symbol-identicalQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "symbol-identical?",
 :signature ["[x y]"],
 :name-encode "symbol-identicalQMARK",
 :history [["+" "1.7.10"]],
 :type "function",
 :full-name-encode "cljs.core/symbol-identicalQMARK",
 :source {:code "(defn ^boolean symbol-identical?\n  [x y]\n  (if (identical? x y)\n    true\n    (if (and (symbol? x) (symbol? y))\n      (identical? (.-str x) (.-str y))\n      false)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3073 3080],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/core.cljs#L3073-L3080"},
 :usage ["(symbol-identical? x y)"],
 :full-name "cljs.core/symbol-identical?",
 :docstring "Efficient test to determine that two symbols are identical.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/symbol-identicalQMARK.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/symbol-identical?"]))
```

-->
