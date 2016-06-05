## cljs.spec.impl.gen/dynaload



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(dynaload \[quote s\])</samp><br>

---

 <samp>
(__dynaload__ \[quote s\])<br>
</samp>

---







Source code @ [github]():

```clj
(defmacro dynaload [[quote s]]
  (let [xs     (string/split (namespace s) #"\.")
        cnt    (count xs)
        checks (map
                 (fn [n xs]
                   `(c/exists? ~(symbol (string/join "." (take n xs)))))
                 (range 2 cnt)
                 (repeat xs))]
    `(cljs.spec.impl.gen/LazyVar.
       (fn []
         (if (and ~@checks (c/exists? ~s))
           ~(vary-meta s assoc :cljs.analyzer/no-resolve true)
           (throw
             (js/Error.
               (str "Var " '~s " does not exist, "
                    (namespace '~s) " never required")))))
       nil)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.spec.impl.gen/dynaload` @ crossclj](http://crossclj.info/fun/cljs.spec.impl.gen/dynaload.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/dynaload.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec.impl.gen",
 :name "dynaload",
 :signature ["[[quote s]]"],
 :name-encode "dynaload",
 :history [["+" "1.9.14"]],
 :type "macro",
 :full-name-encode "cljs.spec.impl.gen/dynaload",
 :source {:code "(defmacro dynaload [[quote s]]\n  (let [xs     (string/split (namespace s) #\"\\.\")\n        cnt    (count xs)\n        checks (map\n                 (fn [n xs]\n                   `(c/exists? ~(symbol (string/join \".\" (take n xs)))))\n                 (range 2 cnt)\n                 (repeat xs))]\n    `(cljs.spec.impl.gen/LazyVar.\n       (fn []\n         (if (and ~@checks (c/exists? ~s))\n           ~(vary-meta s assoc :cljs.analyzer/no-resolve true)\n           (throw\n             (js/Error.\n               (str \"Var \" '~s \" does not exist, \"\n                    (namespace '~s) \" never required\")))))\n       nil)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec/impl/gen.cljc",
          :lines [14 30],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec/impl/gen.cljc#L14-L30"},
 :usage ["(dynaload [quote s])"],
 :full-name "cljs.spec.impl.gen/dynaload",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/dynaload.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec.impl.gen/dynaload"]))
```

-->
