## cljs.test/set-env!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(set-env! new-env)</samp><br>

---

 <samp>
(__set-env!__ new-env)<br>
</samp>

---







Source code @ [github]():

```clj
(defn set-env! [new-env]
  (set! *current-env* new-env))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.test/set-env!` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/set-env%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/set-envBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "set-env!",
 :signature ["[new-env]"],
 :name-encode "set-envBANG",
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test/set-envBANG",
 :source {:code "(defn set-env! [new-env]\n  (set! *current-env* new-env))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [277 278],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/test.cljs#L277-L278"},
 :usage ["(set-env! new-env)"],
 :full-name "cljs.test/set-env!",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/set-envBANG.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/set-env!"]))
```

-->
