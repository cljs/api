## cljs.test/test-var-block



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__test-var-block__ v)<br>
</samp>

---





Source docstring:

```
Like test-var, but returns a block for further composition and
later execution.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/test.cljs#L457-L462):

```clj
(defn test-var-block
  [v]
  (if-let [t (:test (meta v))]
    (test-var-block* v t)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:457-462](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/test.cljs#L457-L462)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/test-var-block` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/test-var-block.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/test-var-block.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "test-var-block",
 :signature ["[v]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.test/test-var-block",
 :source {:code "(defn test-var-block\n  [v]\n  (if-let [t (:test (meta v))]\n    (test-var-block* v t)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [457 462]},
 :full-name "cljs.test/test-var-block",
 :docstring "Like test-var, but returns a block for further composition and\nlater execution."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-var-block"]))
```

-->
