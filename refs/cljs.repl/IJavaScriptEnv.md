## cljs.repl/IJavaScriptEnv



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1844/src/clj/cljs/repl.clj#L21-L25):

```clj
(defprotocol IJavaScriptEnv
  (-setup [this] "initialize the environment")
  (-evaluate [this filename line js] "evaluate a javascript string")
  (-load [this ns url] "load code at url into the environment")
  (-tear-down [this] "dispose of the environment"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1844
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:21-25](https://github.com/clojure/clojurescript/blob/r1844/src/clj/cljs/repl.clj#L21-L25)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/IJavaScriptEnv` @ crossclj](http://crossclj.info/fun/cljs.repl/IJavaScriptEnv.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/IJavaScriptEnv.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "IJavaScriptEnv",
 :type "protocol",
 :full-name-encode "cljs.repl/IJavaScriptEnv",
 :source {:code "(defprotocol IJavaScriptEnv\n  (-setup [this] \"initialize the environment\")\n  (-evaluate [this filename line js] \"evaluate a javascript string\")\n  (-load [this ns url] \"load code at url into the environment\")\n  (-tear-down [this] \"dispose of the environment\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/clj/cljs/repl.clj",
          :lines [21 25]},
 :methods [{:name "-setup",
            :signature ["[this]"],
            :docstring "initialize the environment"}
           {:name "-evaluate",
            :signature ["[this filename line js]"],
            :docstring "evaluate a javascript string"}
           {:name "-load",
            :signature ["[this ns url]"],
            :docstring "load code at url into the environment"}
           {:name "-tear-down",
            :signature ["[this]"],
            :docstring "dispose of the environment"}],
 :full-name "cljs.repl/IJavaScriptEnv",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/IJavaScriptEnv"]))
```

-->
