## cljs.core/ICloneable



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2134"><img valign="middle" alt="[+] 0.0-2134" title="Added in 0.0-2134" src="https://img.shields.io/badge/+-0.0--2134-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Protocol for cloning a value.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/cljs/core.cljs#L455-L458):

```clj
(defprotocol ICloneable
  "Protocol for cloning a value."
  (^clj -clone [value]
    "Creates a clone of value."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.228
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:455-458](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/cljs/core.cljs#L455-L458)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/ICloneable` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ICloneable.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ICloneable.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ICloneable",
 :history [["+" "0.0-2134"]],
 :type "protocol",
 :full-name-encode "cljs.core/ICloneable",
 :source {:code "(defprotocol ICloneable\n  \"Protocol for cloning a value.\"\n  (^clj -clone [value]\n    \"Creates a clone of value.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.228",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [455 458]},
 :methods [{:name "-clone",
            :signature ["[value]"],
            :docstring "Creates a clone of value."}],
 :full-name "cljs.core/ICloneable",
 :docstring "Protocol for cloning a value."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ICloneable"]))
```

-->
