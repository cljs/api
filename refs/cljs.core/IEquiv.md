## cljs.core/IEquiv



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Protocol for adding value comparison functionality to a type.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/core.cljs#L472-L475):

```clj
(defprotocol IEquiv
  "Protocol for adding value comparison functionality to a type."
  (^boolean -equiv [o other]
    "Returns true if o and other are equal, false otherwise."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:472-475](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/core.cljs#L472-L475)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IEquiv` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IEquiv.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IEquiv.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IEquiv",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/IEquiv",
 :source {:code "(defprotocol IEquiv\n  \"Protocol for adding value comparison functionality to a type.\"\n  (^boolean -equiv [o other]\n    \"Returns true if o and other are equal, false otherwise.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/cljs/core.cljs",
          :lines [472 475]},
 :methods [{:name "-equiv",
            :signature ["[o other]"],
            :docstring "Returns true if o and other are equal, false otherwise."}],
 :full-name "cljs.core/IEquiv",
 :docstring "Protocol for adding value comparison functionality to a type."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IEquiv"]))
```

-->
