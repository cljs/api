## cljs.core/system-time



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.145"><img valign="middle" alt="[+] 1.7.145" title="Added in 1.7.145" src="https://img.shields.io/badge/+-1.7.145-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__system-time__)<br>
</samp>

---





Source docstring:

```
Returns highest resolution time offered by host in milliseconds.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/core.cljs#L336-L349):

```clj
(defn system-time
  []
  (cond
    (and (exists? js/performance)
         (not (nil? (. js/performance -now))))
    (.now js/performance)

    (and (exists? js/process)
         (not (nil? (. js/process -hrtime))))
    (let [t (.hrtime js/process)]
      (/ (+ (* (aget t 0) 1e9) (aget t 1)) 1e6))

    :else (.getTime (js/Date.))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.170
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:336-349](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/core.cljs#L336-L349)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/system-time` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/system-time.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/system-time.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "system-time",
 :signature ["[]"],
 :history [["+" "1.7.145"]],
 :type "function",
 :full-name-encode "cljs.core/system-time",
 :source {:code "(defn system-time\n  []\n  (cond\n    (and (exists? js/performance)\n         (not (nil? (. js/performance -now))))\n    (.now js/performance)\n\n    (and (exists? js/process)\n         (not (nil? (. js/process -hrtime))))\n    (let [t (.hrtime js/process)]\n      (/ (+ (* (aget t 0) 1e9) (aget t 1)) 1e6))\n\n    :else (.getTime (js/Date.))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.170",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [336 349]},
 :full-name "cljs.core/system-time",
 :docstring "Returns highest resolution time offered by host in milliseconds."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/system-time"]))
```

-->
