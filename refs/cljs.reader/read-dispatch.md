## cljs.reader/read-dispatch



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-dispatch__ rdr _)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/reader.cljs#L250-L258):

```clj
(defn read-dispatch
  [rdr _]
  (let [ch (read-char rdr)
        dm (dispatch-macros ch)]
    (if dm
      (dm rdr _)
      (if-let [obj (maybe-read-tagged-type rdr ch)]
        obj
        (reader-error rdr "No dispatch macro for " ch)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:250-258](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/reader.cljs#L250-L258)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/read-dispatch` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/read-dispatch.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/read-dispatch.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "read-dispatch",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-dispatch\n  [rdr _]\n  (let [ch (read-char rdr)\n        dm (dispatch-macros ch)]\n    (if dm\n      (dm rdr _)\n      (if-let [obj (maybe-read-tagged-type rdr ch)]\n        obj\n        (reader-error rdr \"No dispatch macro for \" ch)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [250 258]},
 :full-name "cljs.reader/read-dispatch",
 :full-name-encode "cljs.reader/read-dispatch",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-dispatch"]))
```

-->
