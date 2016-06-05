## cljs.spec.impl.gen/quick-check



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(quick-check & args)</samp><br>

---

 <samp>
(__quick-check__ & args)<br>
</samp>

---







Source code @ [github]():

```clj
(defn quick-check
  [& args]
  (apply @quick-check-ref args))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.spec.impl.gen/quick-check` @ crossclj](http://crossclj.info/fun/cljs.spec.impl.gen.cljs/quick-check.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/quick-check.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec.impl.gen",
 :name "quick-check",
 :signature ["[& args]"],
 :name-encode "quick-check",
 :history [["+" "1.9.14"]],
 :type "function",
 :full-name-encode "cljs.spec.impl.gen/quick-check",
 :source {:code "(defn quick-check\n  [& args]\n  (apply @quick-check-ref args))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec/impl/gen.cljs",
          :lines [29 31],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec/impl/gen.cljs#L29-L31"},
 :usage ["(quick-check & args)"],
 :full-name "cljs.spec.impl.gen/quick-check",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.impl.gen/quick-check.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec.impl.gen/quick-check"]))
```

-->
