## cljs.test/test-ns-block



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__test-ns-block__ env \[quote ns :as form\])<br>
</samp>

---





Source docstring:

```
Like test-ns, but returns a block for further composition and
later execution.  Does not clear the current env.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3211/src/clj/cljs/test.clj#L336-L351):

```clj
(defmacro test-ns-block
  ([env [quote ns :as form]]
   (assert (and (= quote 'quote) (symbol? ns)) "Argument to test-ns must be a quoted symbol")
   (assert (ana-api/find-ns ns) (str "Namespace " ns " does not exist"))
   `[(fn []
       (cljs.test/set-env! ~env)
       (cljs.test/do-report {:type :begin-test-ns, :ns ~form})
       ;; If the namespace has a test-ns-hook function, call that:
       ~(if-let [v (ana-api/ns-resolve ns 'test-ns-hook)]
          `(~(symbol (name ns) "test-ns-hook"))
          ;; Otherwise, just test every var in the namespace.
          `(cljs.test/block (cljs.test/test-all-vars-block ~form))))
     (fn []
       (cljs.test/do-report {:type :end-test-ns, :ns ~form}))]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3211
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:336-351](https://github.com/clojure/clojurescript/blob/r3211/src/clj/cljs/test.clj#L336-L351)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/test-ns-block` @ crossclj](http://crossclj.info/fun/cljs.test/test-ns-block.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/test-ns-block.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "test-ns-block",
 :signature ["[env [quote ns :as form]]"],
 :history [["+" "0.0-2814"]],
 :type "macro",
 :full-name-encode "cljs.test/test-ns-block",
 :source {:code "(defmacro test-ns-block\n  ([env [quote ns :as form]]\n   (assert (and (= quote 'quote) (symbol? ns)) \"Argument to test-ns must be a quoted symbol\")\n   (assert (ana-api/find-ns ns) (str \"Namespace \" ns \" does not exist\"))\n   `[(fn []\n       (cljs.test/set-env! ~env)\n       (cljs.test/do-report {:type :begin-test-ns, :ns ~form})\n       ;; If the namespace has a test-ns-hook function, call that:\n       ~(if-let [v (ana-api/ns-resolve ns 'test-ns-hook)]\n          `(~(symbol (name ns) \"test-ns-hook\"))\n          ;; Otherwise, just test every var in the namespace.\n          `(cljs.test/block (cljs.test/test-all-vars-block ~form))))\n     (fn []\n       (cljs.test/do-report {:type :end-test-ns, :ns ~form}))]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/clj/cljs/test.clj",
          :lines [336 351]},
 :full-name "cljs.test/test-ns-block",
 :docstring "Like test-ns, but returns a block for further composition and\nlater execution.  Does not clear the current env."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-ns-block"]))
```

-->
