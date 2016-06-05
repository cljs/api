## cljs.repl.browser/repl-client-js



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(repl-client-js)</samp><br>

---

 <samp>
(__repl-client-js__)<br>
</samp>

---







Source code @ [github]():

```clj
(defn repl-client-js []
  (slurp (:client-js @browser-state)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/repl-client-js` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/repl-client-js.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/repl-client-js.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "repl-client-js",
 :signature ["[]"],
 :name-encode "repl-client-js",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.browser/repl-client-js",
 :source {:code "(defn repl-client-js []\n  (slurp (:client-js @browser-state)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [76 77],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/clojure/cljs/repl/browser.clj#L76-L77"},
 :usage ["(repl-client-js)"],
 :full-name "cljs.repl.browser/repl-client-js",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/repl-client-js.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/repl-client-js"]))
```

-->
