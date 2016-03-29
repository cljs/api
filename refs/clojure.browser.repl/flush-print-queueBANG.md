## clojure.browser.repl/flush-print-queue!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.48"><img valign="middle" alt="[+] 1.7.48" title="Added in 1.7.48" src="https://img.shields.io/badge/+-1.7.48-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(flush-print-queue! conn)</samp><br>

---

 <samp>
(__flush-print-queue!__ conn)<br>
</samp>

---







Source code @ [github]():

```clj
(defn flush-print-queue! [conn]
  (doseq [str print-queue]
    (net/transmit conn :print str))
  (garray/clear print-queue))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.browser.repl/flush-print-queue!` @ crossclj](http://crossclj.info/fun/clojure.browser.repl.cljs/flush-print-queue%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl/flush-print-queueBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.repl",
 :name "flush-print-queue!",
 :signature ["[conn]"],
 :name-encode "flush-print-queueBANG",
 :history [["+" "1.7.48"]],
 :type "function",
 :full-name-encode "clojure.browser.repl/flush-print-queueBANG",
 :source {:code "(defn flush-print-queue! [conn]\n  (doseq [str print-queue]\n    (net/transmit conn :print str))\n  (garray/clear print-queue))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/clojure/browser/repl.cljs",
          :lines [33 36],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/clojure/browser/repl.cljs#L33-L36"},
 :usage ["(flush-print-queue! conn)"],
 :full-name "clojure.browser.repl/flush-print-queue!",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl/flush-print-queueBANG.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/flush-print-queue!"]))
```

-->
