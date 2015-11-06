## cljs.pprint/pprint-logical-block



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/pprint-logical-block</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint-logical-block)
</td>
</tr>
</table>


 <samp>
(__pprint-logical-block__ & args)<br>
</samp>

---





Source docstring:

```
Execute the body as a pretty printing logical block with output to *out* which
must be a pretty printing writer. When used from pprint or cl-format, this can be
assumed.

This function is intended for use when writing custom dispatch functions.

Before the body, the caller can optionally specify options: :prefix, :per-line-prefix
and :suffix.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/pprint.clj#L57-L79):

```clj
(defmacro pprint-logical-block
  [& args]
  (let [[options body] (parse-lb-options #{:prefix :per-line-prefix :suffix} args)]
    `(do (if (cljs.pprint/level-exceeded)
           (~'-write cljs.core/*out* "#")
           (do
             (cljs.core/binding [cljs.pprint/*current-level* (inc cljs.pprint/*current-level*)
                       cljs.pprint/*current-length* 0]
               (cljs.pprint/start-block cljs.core/*out*
                                        ~(:prefix options)
                                        ~(:per-line-prefix options)
                                        ~(:suffix options))
               ~@body
               (cljs.pprint/end-block cljs.core/*out*))))
         nil)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.58
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:57-79](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/pprint.clj#L57-L79)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/pprint-logical-block` @ clojuredocs](http://clojuredocs.org/clojure.pprint/pprint-logical-block)<br>
[`clojure.pprint/pprint-logical-block` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/pprint-logical-block/)<br>
[`clojure.pprint/pprint-logical-block` @ crossclj](http://crossclj.info/fun/clojure.pprint/pprint-logical-block.html)<br>
[`cljs.pprint/pprint-logical-block` @ crossclj](http://crossclj.info/fun/cljs.pprint/pprint-logical-block.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/pprint-logical-block.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "pprint-logical-block",
 :signature ["[& args]"],
 :history [["+" "0.0-3255"]],
 :type "macro",
 :full-name-encode "cljs.pprint/pprint-logical-block",
 :source {:code "(defmacro pprint-logical-block\n  [& args]\n  (let [[options body] (parse-lb-options #{:prefix :per-line-prefix :suffix} args)]\n    `(do (if (cljs.pprint/level-exceeded)\n           (~'-write cljs.core/*out* \"#\")\n           (do\n             (cljs.core/binding [cljs.pprint/*current-level* (inc cljs.pprint/*current-level*)\n                       cljs.pprint/*current-length* 0]\n               (cljs.pprint/start-block cljs.core/*out*\n                                        ~(:prefix options)\n                                        ~(:per-line-prefix options)\n                                        ~(:suffix options))\n               ~@body\n               (cljs.pprint/end-block cljs.core/*out*))))\n         nil)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.58",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [57 79]},
 :full-name "cljs.pprint/pprint-logical-block",
 :clj-symbol "clojure.pprint/pprint-logical-block",
 :docstring "Execute the body as a pretty printing logical block with output to *out* which\nmust be a pretty printing writer. When used from pprint or cl-format, this can be\nassumed.\n\nThis function is intended for use when writing custom dispatch functions.\n\nBefore the body, the caller can optionally specify options: :prefix, :per-line-prefix\nand :suffix."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/pprint-logical-block"]))
```

-->
