## cljs.core/delay



 <table border="1">
<tr>
<td>function</td>
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





Source docstring:

```
Takes a body of expressions and yields a Delay object that will
invoke the body only the first time it is forced (with force or deref/@), and
will cache the result and return it on all subsequent force
calls.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L3204-L3210):

```clj
(defn delay
  [& body]
  (Delay. (fn [] (apply identity body)) (atom nil)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3204-3210](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L3204-L3210)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/delay` @ clojuredocs](http://clojuredocs.org/clojure.core/delay)<br>
[`clojure.core/delay` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/delay/)<br>
[`clojure.core/delay` @ crossclj](http://crossclj.info/fun/clojure.core/delay.html)<br>
[`cljs.core/delay` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/delay.html)<br>

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
 :type "function",
 :full-name-encode "cljs.core/delay",
 :source {:code "(defn delay\n  [& body]\n  (Delay. (fn [] (apply identity body)) (atom nil)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3204 3210]},
 :full-name "cljs.core/delay",
 :clj-symbol "clojure.core/delay",
 :docstring "Takes a body of expressions and yields a Delay object that will\ninvoke the body only the first time it is forced (with force or deref/@), and\nwill cache the result and return it on all subsequent force\ncalls."}

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
