## cljs.repl.browser/compile-client-js



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__compile-client-js__ opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/clojure/cljs/repl/browser.clj#L215-L230):

```clj
(defn compile-client-js [opts]
  (let [copts {:optimizations (:optimizations opts)
               :output-dir (:working-dir opts)}]
    ;; we're inside the REPL process where cljs.env/*compiler* is already
    ;; established, need to construct a new one to avoid mutating the one
    ;; the REPL uses
    (cljsc/build
      '[(ns clojure.browser.repl.client
          (:require [goog.events :as event]
                    [clojure.browser.repl :as repl]))
        (defn start [url]
          (event/listen js/window
            "load"
            (fn []
              (repl/start-evaluator url))))]
      copts (env/default-compiler-env copts))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.189
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[browser.clj:215-230](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/clojure/cljs/repl/browser.clj#L215-L230)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/compile-client-js` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/compile-client-js.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/compile-client-js.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "compile-client-js",
 :type "function",
 :signature ["[opts]"],
 :source {:code "(defn compile-client-js [opts]\n  (let [copts {:optimizations (:optimizations opts)\n               :output-dir (:working-dir opts)}]\n    ;; we're inside the REPL process where cljs.env/*compiler* is already\n    ;; established, need to construct a new one to avoid mutating the one\n    ;; the REPL uses\n    (cljsc/build\n      '[(ns clojure.browser.repl.client\n          (:require [goog.events :as event]\n                    [clojure.browser.repl :as repl]))\n        (defn start [url]\n          (event/listen js/window\n            \"load\"\n            (fn []\n              (repl/start-evaluator url))))]\n      copts (env/default-compiler-env copts))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.189",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [215 230]},
 :full-name "cljs.repl.browser/compile-client-js",
 :full-name-encode "cljs.repl.browser/compile-client-js",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/compile-client-js"]))
```

-->
