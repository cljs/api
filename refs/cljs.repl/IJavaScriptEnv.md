## cljs.repl/IJavaScriptEnv



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/clojure/cljs/repl.cljc#L106-L110):

```clj
(defprotocol IJavaScriptEnv
  (-setup [repl-env opts] "initialize the environment")
  (-evaluate [repl-env filename line js] "evaluate a javascript string")
  (-load [repl-env provides url] "load code at url into the environment")
  (-tear-down [repl-env] "dispose of the environment"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:106-110](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/clojure/cljs/repl.cljc#L106-L110)</ins>
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
 :source {:code "(defprotocol IJavaScriptEnv\n  (-setup [repl-env opts] \"initialize the environment\")\n  (-evaluate [repl-env filename line js] \"evaluate a javascript string\")\n  (-load [repl-env provides url] \"load code at url into the environment\")\n  (-tear-down [repl-env] \"dispose of the environment\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [106 110]},
 :methods [{:name "-setup",
            :signature ["[repl-env opts]"],
            :docstring "initialize the environment"}
           {:name "-evaluate",
            :signature ["[repl-env filename line js]"],
            :docstring "evaluate a javascript string"}
           {:name "-load",
            :signature ["[repl-env provides url]"],
            :docstring "load code at url into the environment"}
           {:name "-tear-down",
            :signature ["[repl-env]"],
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
