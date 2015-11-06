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
(__Delay.__ f value)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L8862-L8872):

```clj
(deftype Delay [^:mutable f ^:mutable value]
  IDeref
  (-deref [_]
    (when f
      (set! value (f))
      (set! f nil))
    value)

  IPending
  (-realized? [d]
    (not f)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:8862-8872](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L8862-L8872)</ins>
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
 :signature ["[f value]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core/Delay",
 :source {:code "(deftype Delay [^:mutable f ^:mutable value]\n  IDeref\n  (-deref [_]\n    (when f\n      (set! value (f))\n      (set! f nil))\n    value)\n\n  IPending\n  (-realized? [d]\n    (not f)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8862 8872]},
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
