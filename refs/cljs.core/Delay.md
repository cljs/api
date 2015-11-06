## cljs.core/Delay



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Delay</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Delay.java)
</td>
</tr>
</table>


 <samp>
(__Delay.__ state f)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L6819-L6829):

```clj
(deftype Delay [state f]
  IDeref
  (-deref [_]
    (:value (swap! state (fn [{:keys [done] :as curr-state}]
                           (if done
                             curr-state,
                             {:done true :value (f)})))))

  IPending
  (-realized? [d]
    (:done @state)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6819-6829](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L6819-L6829)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Delay` @ clojuredocs](http://clojuredocs.org/clojure.lang/Delay)<br>
[`clojure.lang/Delay` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Delay/)<br>
[`clojure.lang/Delay` @ crossclj](http://crossclj.info/fun/clojure.lang/Delay.html)<br>
[`cljs.core/Delay` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Delay.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Delay.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Delay",
 :signature ["[state f]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core/Delay",
 :source {:code "(deftype Delay [state f]\n  IDeref\n  (-deref [_]\n    (:value (swap! state (fn [{:keys [done] :as curr-state}]\n                           (if done\n                             curr-state,\n                             {:done true :value (f)})))))\n\n  IPending\n  (-realized? [d]\n    (:done @state)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1535",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6819 6829]},
 :full-name "cljs.core/Delay",
 :clj-symbol "clojure.lang/Delay"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Delay"]))
```

-->
