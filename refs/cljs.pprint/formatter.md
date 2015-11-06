## cljs.pprint/formatter



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/formatter</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/formatter)
</td>
</tr>
</table>


 <samp>
(__formatter__ format-in)<br>
</samp>

---





Source docstring:

```
Makes a function which can directly run format-in. The function is
fn [stream & args] ... and returns nil unless the stream is nil (meaning
output to a string) in which case it returns the resulting string.

format-in can be either a control string or a previously compiled format.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/pprint.clj#L117-L131):

```clj
(defmacro formatter
  [format-in]
  `(let [format-in# ~format-in
         my-c-c# cljs.pprint/cached-compile
         my-e-f# cljs.pprint/execute-format
         my-i-n# cljs.pprint/init-navigator
         cf# (if (string? format-in#) (my-c-c# format-in#) format-in#)]
     (fn [stream# & args#]
       (let [navigator# (my-i-n# args#)]
         (my-e-f# stream# cf# navigator#)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:117-131](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/pprint.clj#L117-L131)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/formatter` @ clojuredocs](http://clojuredocs.org/clojure.pprint/formatter)<br>
[`clojure.pprint/formatter` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/formatter/)<br>
[`clojure.pprint/formatter` @ crossclj](http://crossclj.info/fun/clojure.pprint/formatter.html)<br>
[`cljs.pprint/formatter` @ crossclj](http://crossclj.info/fun/cljs.pprint/formatter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/formatter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "formatter",
 :signature ["[format-in]"],
 :history [["+" "0.0-3255"]],
 :type "macro",
 :full-name-encode "cljs.pprint/formatter",
 :source {:code "(defmacro formatter\n  [format-in]\n  `(let [format-in# ~format-in\n         my-c-c# cljs.pprint/cached-compile\n         my-e-f# cljs.pprint/execute-format\n         my-i-n# cljs.pprint/init-navigator\n         cf# (if (string? format-in#) (my-c-c# format-in#) format-in#)]\n     (fn [stream# & args#]\n       (let [navigator# (my-i-n# args#)]\n         (my-e-f# stream# cf# navigator#)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [117 131]},
 :full-name "cljs.pprint/formatter",
 :clj-symbol "clojure.pprint/formatter",
 :docstring "Makes a function which can directly run format-in. The function is\nfn [stream & args] ... and returns nil unless the stream is nil (meaning\noutput to a string) in which case it returns the resulting string.\n\nformat-in can be either a control string or a previously compiled format."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/formatter"]))
```

-->
