## ~~cljs.js/debug-prn~~



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.48"><img valign="middle" alt="[×] 1.7.48" title="Removed in 1.7.48" src="https://img.shields.io/badge/×-1.7.48-red.svg"></a> </td>
</tr>
</table>

<samp>(debug-prn & args)</samp><br>

---

 <samp>
(__debug-prn__ & args)<br>
</samp>

---







Source code @ [github]():

```clj
(defn debug-prn
  [& args]
  (binding [*print-fn* *print-err-fn*]
    (apply println args)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.js/debug-prn` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/debug-prn.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/debug-prn.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "debug-prn",
 :signature ["[& args]"],
 :history [["+" "1.7.10"] ["-" "1.7.48"]],
 :type "function",
 :full-name-encode "cljs.js/debug-prn",
 :source {:code "(defn debug-prn\n  [& args]\n  (binding [*print-fn* *print-err-fn*]\n    (apply println args)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.28",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [25 28]},
 :usage ["(debug-prn & args)"],
 :full-name "cljs.js/debug-prn",
 :removed {:in "1.7.48", :last-seen "1.7.28"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/debug-prn"]))
```

-->
