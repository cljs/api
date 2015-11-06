## cljs.test/get-and-clear-env!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__get-and-clear-env!__)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2816/src/cljs/cljs/test.cljs#L258-L262):

```clj
(defn get-and-clear-env! []
  "Like get-current-env, but cleans env before returning."
  (let [env (cljs.test/get-current-env)]
    (clear-env!)
    env))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2816
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:258-262](https://github.com/clojure/clojurescript/blob/r2816/src/cljs/cljs/test.cljs#L258-L262)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/get-and-clear-env!` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/get-and-clear-env%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/get-and-clear-envBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "get-and-clear-env!",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn get-and-clear-env! []\n  \"Like get-current-env, but cleans env before returning.\"\n  (let [env (cljs.test/get-current-env)]\n    (clear-env!)\n    env))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2816",
          :filename "src/cljs/cljs/test.cljs",
          :lines [258 262]},
 :full-name "cljs.test/get-and-clear-env!",
 :full-name-encode "cljs.test/get-and-clear-envBANG",
 :history [["+" "0.0-2814"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/get-and-clear-env!"]))
```

-->
