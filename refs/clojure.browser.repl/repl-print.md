## clojure.browser.repl/repl-print



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(repl-print data)</samp><br>

---

 <samp>
(__repl-print__ data)<br>
</samp>

---







Source code @ [github]():

```clj
(defn repl-print [data]
  (.push print-queue (pr-str data))
  (when-let [conn @xpc-connection]
    (flush-print-queue! conn)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.browser.repl/repl-print` @ crossclj](http://crossclj.info/fun/clojure.browser.repl.cljs/repl-print.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl/repl-print.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.repl",
 :name "repl-print",
 :signature ["[data]"],
 :name-encode "repl-print",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.repl/repl-print",
 :source {:code "(defn repl-print [data]\n  (.push print-queue (pr-str data))\n  (when-let [conn @xpc-connection]\n    (flush-print-queue! conn)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/clojure/browser/repl.cljs",
          :lines [38 41],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/clojure/browser/repl.cljs#L38-L41"},
 :usage ["(repl-print data)"],
 :full-name "clojure.browser.repl/repl-print",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl/repl-print.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/repl-print"]))
```

-->
