## cljs.spec/explain-data\*



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(explain-data\* spec path via in x)</samp><br>

---

 <samp>
(__explain-data\*__ spec path via in x)<br>
</samp>

---







Source code @ [github]():

```clj
(defn explain-data* [spec path via in x]
  (when-let [probs (explain* (specize spec) path via in x)]
    {::problems probs}))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.spec/explain-data*` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/explain-data*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/explain-dataSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "explain-data*",
 :signature ["[spec path via in x]"],
 :name-encode "explain-dataSTAR",
 :history [["+" "1.9.14"]],
 :type "function",
 :full-name-encode "cljs.spec/explain-dataSTAR",
 :source {:code "(defn explain-data* [spec path via in x]\n  (when-let [probs (explain* (specize spec) path via in x)]\n    {::problems probs}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [145 147],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljs#L145-L147"},
 :usage ["(explain-data* spec path via in x)"],
 :full-name "cljs.spec/explain-data*",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/explain-dataSTAR.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/explain-data*"]))
```

-->
