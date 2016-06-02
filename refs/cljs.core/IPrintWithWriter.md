## cljs.core/IPrintWithWriter



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
The old IPrintable protocol's implementation consisted of building a giant
   list of strings to concatenate.  This involved lots of concat calls,
   intermediate vectors, and lazy-seqs, and was very slow in some older JS
   engines.  IPrintWithWriter implements printing via the IWriter protocol, so it
   be implemented efficiently in terms of e.g. a StringBuffer append.
```


Source code @ [github]():

```clj
(defprotocol IPrintWithWriter
  "The old IPrintable protocol's implementation consisted of building a giant
   list of strings to concatenate.  This involved lots of concat calls,
   intermediate vectors, and lazy-seqs, and was very slow in some older JS
   engines.  IPrintWithWriter implements printing via the IWriter protocol, so it
   be implemented efficiently in terms of e.g. a StringBuffer append."
  (-pr-writer [o writer opts]))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/IPrintWithWriter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IPrintWithWriter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IPrintWithWriter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IPrintWithWriter",
 :name-encode "IPrintWithWriter",
 :history [["+" "0.0-1503"]],
 :type "protocol",
 :full-name-encode "cljs.core/IPrintWithWriter",
 :source {:code "(defprotocol IPrintWithWriter\n  \"The old IPrintable protocol's implementation consisted of building a giant\n   list of strings to concatenate.  This involved lots of concat calls,\n   intermediate vectors, and lazy-seqs, and was very slow in some older JS\n   engines.  IPrintWithWriter implements printing via the IWriter protocol, so it\n   be implemented efficiently in terms of e.g. a StringBuffer append.\"\n  (-pr-writer [o writer opts]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [651 657],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/core.cljs#L651-L657"},
 :methods [{:name "-pr-writer",
            :signature ["[o writer opts]"],
            :docstring nil}],
 :full-name "cljs.core/IPrintWithWriter",
 :docstring "The old IPrintable protocol's implementation consisted of building a giant\n   list of strings to concatenate.  This involved lots of concat calls,\n   intermediate vectors, and lazy-seqs, and was very slow in some older JS\n   engines.  IPrintWithWriter implements printing via the IWriter protocol, so it\n   be implemented efficiently in terms of e.g. a StringBuffer append.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IPrintWithWriter.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IPrintWithWriter"]))
```

-->
