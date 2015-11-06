## clojure.browser.repl/bootstrap



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3115"><img valign="middle" alt="[+] 0.0-3115" title="Added in 0.0-3115" src="https://img.shields.io/badge/+-0.0--3115-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__bootstrap__)<br>
</samp>

---





Source docstring:

```
Reusable browser REPL bootstrapping. Patches the essential functions
in goog.base to support re-loading of namespaces after page load.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/clojure/browser/repl.cljs#L114-L161):

```clj
(defn bootstrap
  []
  ;; Monkey-patch goog.provide if running under optimizations :none - David
  (when-not js/COMPILED
    (set! (.-require__ js/goog) js/goog.require)
    ;; suppress useless Google Closure error about duplicate provides
    (set! (.-isProvided_ js/goog) (fn [name] false))
    (set! (.-writeScriptTag__ js/goog)
      (fn [src opt_sourceText]
        (let [loaded (atom false)
              onload (fn []
                       (when (and load-queue (false? @loaded))
                         (swap! loaded not)
                         (if (zero? (alength load-queue))
                           (set! load-queue nil)
                           (.apply js/goog.writeScriptTag__ nil (.shift load-queue)))))]
          (.appendChild js/document.body
           (as-> (.createElement js/document "script") script
             (doto script
               (aset "type" "text/javascript")
               (aset "onload" onload)
               (aset "onreadystatechange" onload))
             (if (nil? opt_sourceText)
               (doto script (aset "src" src))
               (doto script (gdom/setTextContext opt_sourceText))))))))
    (set! (.-writeScriptTag_ js/goog)
      (fn [src opt_sourceText]
        (if load-queue
          (.push load-queue #js [src opt_sourceText])
          (do
            (set! load-queue #js [])
            (js/goog.writeScriptTag__ src opt_sourceText)))))
    (set! (.-require js/goog)
      (fn [src reload]
        (when (= reload "reload-all")
          (set! (.-cljsReloadAll_ js/goog) true))
        (let [reload? (or reload (.-cljsReloadAll__ js/goog))]
          (when reload?
            (let [path (aget js/goog.dependencies_.nameToPath src)]
              (js-delete js/goog.dependencies_.visited path)
              (js-delete js/goog.dependencies_.written
                (str js/goog.basePath path))))
          (let [ret (.require__ js/goog src)]
            (when (= reload "reload-all")
              (set! (.-cljsReloadAll_ js/goog) false))
            ret))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:114-161](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/clojure/browser/repl.cljs#L114-L161)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.repl/bootstrap` @ crossclj](http://crossclj.info/fun/clojure.browser.repl.cljs/bootstrap.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl/bootstrap.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.repl",
 :name "bootstrap",
 :signature ["[]"],
 :history [["+" "0.0-3115"]],
 :type "function",
 :full-name-encode "clojure.browser.repl/bootstrap",
 :source {:code "(defn bootstrap\n  []\n  ;; Monkey-patch goog.provide if running under optimizations :none - David\n  (when-not js/COMPILED\n    (set! (.-require__ js/goog) js/goog.require)\n    ;; suppress useless Google Closure error about duplicate provides\n    (set! (.-isProvided_ js/goog) (fn [name] false))\n    (set! (.-writeScriptTag__ js/goog)\n      (fn [src opt_sourceText]\n        (let [loaded (atom false)\n              onload (fn []\n                       (when (and load-queue (false? @loaded))\n                         (swap! loaded not)\n                         (if (zero? (alength load-queue))\n                           (set! load-queue nil)\n                           (.apply js/goog.writeScriptTag__ nil (.shift load-queue)))))]\n          (.appendChild js/document.body\n           (as-> (.createElement js/document \"script\") script\n             (doto script\n               (aset \"type\" \"text/javascript\")\n               (aset \"onload\" onload)\n               (aset \"onreadystatechange\" onload))\n             (if (nil? opt_sourceText)\n               (doto script (aset \"src\" src))\n               (doto script (gdom/setTextContext opt_sourceText))))))))\n    (set! (.-writeScriptTag_ js/goog)\n      (fn [src opt_sourceText]\n        (if load-queue\n          (.push load-queue #js [src opt_sourceText])\n          (do\n            (set! load-queue #js [])\n            (js/goog.writeScriptTag__ src opt_sourceText)))))\n    (set! (.-require js/goog)\n      (fn [src reload]\n        (when (= reload \"reload-all\")\n          (set! (.-cljsReloadAll_ js/goog) true))\n        (let [reload? (or reload (.-cljsReloadAll__ js/goog))]\n          (when reload?\n            (let [path (aget js/goog.dependencies_.nameToPath src)]\n              (js-delete js/goog.dependencies_.visited path)\n              (js-delete js/goog.dependencies_.written\n                (str js/goog.basePath path))))\n          (let [ret (.require__ js/goog src)]\n            (when (= reload \"reload-all\")\n              (set! (.-cljsReloadAll_ js/goog) false))\n            ret))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [114 161]},
 :full-name "clojure.browser.repl/bootstrap",
 :docstring "Reusable browser REPL bootstrapping. Patches the essential functions\nin goog.base to support re-loading of namespaces after page load."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/bootstrap"]))
```

-->
