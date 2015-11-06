## cljs.core/IHash



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Protocol for adding hashing functionality to a type.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3165/src/cljs/cljs/core.cljs#L477-L480):

```clj
(defprotocol IHash
  "Protocol for adding hashing functionality to a type."
  (-hash [o]
    "Returns the hash code of o."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3165
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:477-480](https://github.com/clojure/clojurescript/blob/r3165/src/cljs/cljs/core.cljs#L477-L480)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IHash` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IHash.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IHash.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IHash",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/IHash",
 :source {:code "(defprotocol IHash\n  \"Protocol for adding hashing functionality to a type.\"\n  (-hash [o]\n    \"Returns the hash code of o.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/cljs/cljs/core.cljs",
          :lines [477 480]},
 :methods [{:name "-hash",
            :signature ["[o]"],
            :docstring "Returns the hash code of o."}],
 :full-name "cljs.core/IHash",
 :docstring "Protocol for adding hashing functionality to a type."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IHash"]))
```

-->
