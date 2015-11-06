## cljs.pprint/formatter-out



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/formatter-out</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/formatter-out)
</td>
</tr>
</table>


 <samp>
(__formatter-out__ format-in)<br>
</samp>

---





Source docstring:

```
Makes a function which can directly run format-in. The function is
fn [& args] ... and returns nil. This version of the formatter macro is
designed to be used with *out* set to an appropriate Writer. In particular,
this is meant to be used as part of a pretty printer dispatch method.

format-in can be either a control string or a previously compiled format.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/pprint.clj#L133-L145):

```clj
(defmacro formatter-out
  [format-in]
  `(let [format-in# ~format-in
         cf# (if (string? format-in#) (cljs.pprint/cached-compile format-in#) format-in#)]
     (fn [& args#]
       (let [navigator# (cljs.pprint/init-navigator args#)]
         (cljs.pprint/execute-format cf# navigator#)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.58
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:133-145](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/pprint.clj#L133-L145)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/formatter-out` @ clojuredocs](http://clojuredocs.org/clojure.pprint/formatter-out)<br>
[`clojure.pprint/formatter-out` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/formatter-out/)<br>
[`clojure.pprint/formatter-out` @ crossclj](http://crossclj.info/fun/clojure.pprint/formatter-out.html)<br>
[`cljs.pprint/formatter-out` @ crossclj](http://crossclj.info/fun/cljs.pprint/formatter-out.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/formatter-out.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "formatter-out",
 :signature ["[format-in]"],
 :history [["+" "0.0-3255"]],
 :type "macro",
 :full-name-encode "cljs.pprint/formatter-out",
 :source {:code "(defmacro formatter-out\n  [format-in]\n  `(let [format-in# ~format-in\n         cf# (if (string? format-in#) (cljs.pprint/cached-compile format-in#) format-in#)]\n     (fn [& args#]\n       (let [navigator# (cljs.pprint/init-navigator args#)]\n         (cljs.pprint/execute-format cf# navigator#)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.58",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [133 145]},
 :full-name "cljs.pprint/formatter-out",
 :clj-symbol "clojure.pprint/formatter-out",
 :docstring "Makes a function which can directly run format-in. The function is\nfn [& args] ... and returns nil. This version of the formatter macro is\ndesigned to be used with *out* set to an appropriate Writer. In particular,\nthis is meant to be used as part of a pretty printer dispatch method.\n\nformat-in can be either a control string or a previously compiled format."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/formatter-out"]))
```

-->
