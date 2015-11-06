## cljs.repl.browser/handle-post



 <table border="1">
<tr>
<td>multimethod</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__handle-post__ m _ _)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1878/src/clj/cljs/repl/browser.clj#L92):

```clj
(defmulti handle-post (fn [m _ _ ] (:type m)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1878
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:92](https://github.com/clojure/clojurescript/blob/r1878/src/clj/cljs/repl/browser.clj#L92)</ins>
</pre>

-->

---

Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r1878/src/clj/cljs/repl/browser.clj#L98-L105):

```clj
(defmethod handle-post :ready [_ conn _]
  (do (reset! loaded-libs @preloaded-libs)
      (send ordering (fn [_] {:expecting nil :fns {}}))
      (send-for-eval conn
                     (cljsc/-compile
                      '[(ns cljs.user)
                        (set! *print-fn* clojure.browser.repl/repl-print)] {})
                     identity)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1878
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:98-105](https://github.com/clojure/clojurescript/blob/r1878/src/clj/cljs/repl/browser.clj#L98-L105)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r1878/src/clj/cljs/repl/browser.clj#L125-L128):

```clj
(defmethod handle-post :print [{:keys [content order]} conn _ ]
  (do (constrain-order order (fn [] (do (print (read-string content))
                                       (.flush *out*))))
      (server/send-and-close conn 200 "ignore__")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1878
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:125-128](https://github.com/clojure/clojurescript/blob/r1878/src/clj/cljs/repl/browser.clj#L125-L128)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r1878/src/clj/cljs/repl/browser.clj#L130-L132):

```clj
(defmethod handle-post :result [{:keys [content order]} conn _ ]
  (constrain-order order (fn [] (do (return-value content)
                                   (server/set-connection conn)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1878
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:130-132](https://github.com/clojure/clojurescript/blob/r1878/src/clj/cljs/repl/browser.clj#L130-L132)</ins>
</pre>
-->

---


###### External doc links:

[`cljs.repl.browser/handle-post` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/handle-post.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/handle-post.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "handle-post",
 :signature ["[m _ _]"],
 :history [["+" "0.0-927"]],
 :type "multimethod",
 :full-name-encode "cljs.repl.browser/handle-post",
 :source {:code "(defmulti handle-post (fn [m _ _ ] (:type m)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1878",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [92]},
 :extra-sources ({:code "(defmethod handle-post :ready [_ conn _]\n  (do (reset! loaded-libs @preloaded-libs)\n      (send ordering (fn [_] {:expecting nil :fns {}}))\n      (send-for-eval conn\n                     (cljsc/-compile\n                      '[(ns cljs.user)\n                        (set! *print-fn* clojure.browser.repl/repl-print)] {})\n                     identity)))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1878",
                  :filename "src/clj/cljs/repl/browser.clj",
                  :lines [98 105]}
                 {:code "(defmethod handle-post :print [{:keys [content order]} conn _ ]\n  (do (constrain-order order (fn [] (do (print (read-string content))\n                                       (.flush *out*))))\n      (server/send-and-close conn 200 \"ignore__\")))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1878",
                  :filename "src/clj/cljs/repl/browser.clj",
                  :lines [125 128]}
                 {:code "(defmethod handle-post :result [{:keys [content order]} conn _ ]\n  (constrain-order order (fn [] (do (return-value content)\n                                   (server/set-connection conn)))))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1878",
                  :filename "src/clj/cljs/repl/browser.clj",
                  :lines [130 132]}),
 :full-name "cljs.repl.browser/handle-post"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/handle-post"]))
```

-->
