## cljs.repl.rhino/repl-env



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(repl-env & {:as opts})</samp><br>

---

 <samp>
(__repl-env__ & {:as opts})<br>
</samp>

---





Source docstring:

```
Returns a fresh JS environment, suitable for passing to repl.
Hang on to return for use across repl calls.
```


Source code @ [github]():

```clj
(defn repl-env
  [& {:as opts}]
  (repl-env* opts))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl.rhino/repl-env` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/repl-env.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/repl-env.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "repl-env",
 :signature ["[& {:as opts}]"],
 :name-encode "repl-env",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.rhino/repl-env",
 :source {:code "(defn repl-env\n  [& {:as opts}]\n  (repl-env* opts))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/clojure/cljs/repl/rhino.clj",
          :lines [212 216],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/clojure/cljs/repl/rhino.clj#L212-L216"},
 :usage ["(repl-env & {:as opts})"],
 :full-name "cljs.repl.rhino/repl-env",
 :docstring "Returns a fresh JS environment, suitable for passing to repl.\nHang on to return for use across repl calls.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/repl-env.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/repl-env"]))
```

-->
