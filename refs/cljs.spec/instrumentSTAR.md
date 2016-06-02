## cljs.spec/instrument\*



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(instrument\* v)</samp><br>

---

 <samp>
(__instrument\*__ v)<br>
</samp>

---







Source code @ [github]():

```clj
(defn instrument*
  [v]
  (let [specs (fn-specs v)]
    (if (fn-specs? specs)
      (locking instrumented-vars
               (let [{:keys [raw wrapped]} (get @instrumented-vars v)
                     current @v]
                 (when-not (= wrapped current)
                   (let [checked (spec-checking-fn v current)]
                     (swap! instrumented-vars assoc v {:raw current :wrapped checked})
                     checked))))
      (throw (no-fn-specs v specs)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.spec/instrument*` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/instrument*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/instrumentSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "instrument*",
 :signature ["[v]"],
 :name-encode "instrumentSTAR",
 :history [["+" "1.9.14"]],
 :type "function",
 :full-name-encode "cljs.spec/instrumentSTAR",
 :source {:code "(defn instrument*\n  [v]\n  (let [specs (fn-specs v)]\n    (if (fn-specs? specs)\n      (locking instrumented-vars\n               (let [{:keys [raw wrapped]} (get @instrumented-vars v)\n                     current @v]\n                 (when-not (= wrapped current)\n                   (let [checked (spec-checking-fn v current)]\n                     (swap! instrumented-vars assoc v {:raw current :wrapped checked})\n                     checked))))\n      (throw (no-fn-specs v specs)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [321 332],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljs#L321-L332"},
 :usage ["(instrument* v)"],
 :full-name "cljs.spec/instrument*",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/instrumentSTAR.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/instrument*"]))
```

-->
