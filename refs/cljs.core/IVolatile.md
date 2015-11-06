## cljs.core/IVolatile



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Protocol for adding volatile functionality.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/core.cljs#L627-L631):

```clj
(defprotocol IVolatile
  "Protocol for adding volatile functionality."
  (-vreset! [o new-value]
    "Sets the value of volatile o to new-value without regard for the
     current value. Returns new-value."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:627-631](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/core.cljs#L627-L631)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IVolatile` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IVolatile.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IVolatile.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IVolatile",
 :history [["+" "0.0-2496"]],
 :type "protocol",
 :full-name-encode "cljs.core/IVolatile",
 :source {:code "(defprotocol IVolatile\n  \"Protocol for adding volatile functionality.\"\n  (-vreset! [o new-value]\n    \"Sets the value of volatile o to new-value without regard for the\n     current value. Returns new-value.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/cljs/core.cljs",
          :lines [627 631]},
 :methods [{:name "-vreset!",
            :signature ["[o new-value]"],
            :docstring "Sets the value of volatile o to new-value without regard for the\n     current value. Returns new-value."}],
 :full-name "cljs.core/IVolatile",
 :docstring "Protocol for adding volatile functionality."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IVolatile"]))
```

-->
