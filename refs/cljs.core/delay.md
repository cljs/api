## cljs.core/delay



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/delay</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/delay)
</td>
</tr>
</table>


 <samp>
(__delay__ & body)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2197/src/clj/cljs/core.clj#L1045-L1050):

```clj
(defmacro delay [& body]
  "Takes a body of expressions and yields a Delay object that will
  invoke the body only the first time it is forced (with force or deref/@), and
  will cache the result and return it on all subsequent force
  calls."
  `(new cljs.core/Delay (atom {:done false, :value nil}) (fn [] ~@body)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2197
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1045-1050](https://github.com/clojure/clojurescript/blob/r2197/src/clj/cljs/core.clj#L1045-L1050)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/delay` @ clojuredocs](http://clojuredocs.org/clojure.core/delay)<br>
[`clojure.core/delay` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/delay/)<br>
[`clojure.core/delay` @ crossclj](http://crossclj.info/fun/clojure.core/delay.html)<br>
[`cljs.core/delay` @ crossclj](http://crossclj.info/fun/cljs.core/delay.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/delay.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "delay",
 :signature ["[& body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core/delay",
 :source {:code "(defmacro delay [& body]\n  \"Takes a body of expressions and yields a Delay object that will\n  invoke the body only the first time it is forced (with force or deref/@), and\n  will cache the result and return it on all subsequent force\n  calls.\"\n  `(new cljs.core/Delay (atom {:done false, :value nil}) (fn [] ~@body)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2197",
          :filename "src/clj/cljs/core.clj",
          :lines [1045 1050]},
 :full-name "cljs.core/delay",
 :clj-symbol "clojure.core/delay"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/delay"]))
```

-->
