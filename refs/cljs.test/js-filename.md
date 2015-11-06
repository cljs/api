## cljs.test/js-filename



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__js-filename__ stack-element)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2758/src/cljs/cljs/test.cljs#L311-L312):

```clj
(defn js-filename [stack-element]
  (first (.split (last (.split stack-element "/out/")) ":")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2758
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:311-312](https://github.com/clojure/clojurescript/blob/r2758/src/cljs/cljs/test.cljs#L311-L312)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/js-filename` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/js-filename.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/js-filename.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "js-filename",
 :type "function",
 :signature ["[stack-element]"],
 :source {:code "(defn js-filename [stack-element]\n  (first (.split (last (.split stack-element \"/out/\")) \":\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2758",
          :filename "src/cljs/cljs/test.cljs",
          :lines [311 312]},
 :full-name "cljs.test/js-filename",
 :full-name-encode "cljs.test/js-filename",
 :history [["+" "0.0-2496"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/js-filename"]))
```

-->
