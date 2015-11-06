## cljs.reader/macro-terminating?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__macro-terminating?__ ch)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/reader.cljs#L73-L77):

```clj
(defn ^boolean macro-terminating? [ch]
  (and (not (identical? ch "#"))
       (not (identical? ch \'))
       (not (identical? ch ":"))
       (macros ch)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:73-77](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/reader.cljs#L73-L77)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/macro-terminating?` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/macro-terminating%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/macro-terminatingQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.reader",
 :name "macro-terminating?",
 :signature ["[ch]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.reader/macro-terminatingQMARK",
 :source {:code "(defn ^boolean macro-terminating? [ch]\n  (and (not (identical? ch \"#\"))\n       (not (identical? ch \\'))\n       (not (identical? ch \":\"))\n       (macros ch)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [73 77]},
 :full-name "cljs.reader/macro-terminating?"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/macro-terminating?"]))
```

-->
