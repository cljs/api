## cljs.core/IWriter



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Protocol for writing. Currently only implemented by StringBufferWriter.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L518-L523):

```clj
(defprotocol IWriter
  "Protocol for writing. Currently only implemented by StringBufferWriter."
  (-write [writer s]
    "Writes s with writer and returns the result.")
  (-flush [writer]
    "Flush writer."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3123
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:518-523](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L518-L523)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IWriter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IWriter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IWriter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IWriter",
 :history [["+" "0.0-1503"]],
 :type "protocol",
 :full-name-encode "cljs.core/IWriter",
 :source {:code "(defprotocol IWriter\n  \"Protocol for writing. Currently only implemented by StringBufferWriter.\"\n  (-write [writer s]\n    \"Writes s with writer and returns the result.\")\n  (-flush [writer]\n    \"Flush writer.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/cljs/cljs/core.cljs",
          :lines [518 523]},
 :methods [{:name "-write",
            :signature ["[writer s]"],
            :docstring "Writes s with writer and returns the result."}
           {:name "-flush",
            :signature ["[writer]"],
            :docstring "Flush writer."}],
 :full-name "cljs.core/IWriter",
 :docstring "Protocol for writing. Currently only implemented by StringBufferWriter."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IWriter"]))
```

-->
