## ~~cljs.repl.browser/handle-get~~



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[×] 0.0-1503" title="Removed in 0.0-1503" src="https://img.shields.io/badge/×-0.0--1503-red.svg"></a> </td>
</tr>
</table>

<samp>(handle-get opts conn request)</samp><br>

---

 <samp>
(__handle-get__ opts conn request)<br>
</samp>

---







Source code @ [github]():

```clj
(defn handle-get [opts conn request]
  (let [path (:path request)]
    (cond
     (.startsWith path "/repl") (send-repl-client-page opts conn request)
     (:serve-static opts) (send-static opts conn request)
     :else (send-404 conn (:path request)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/handle-get` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/handle-get.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/handle-get.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "handle-get",
 :signature ["[opts conn request]"],
 :history [["+" "0.0-927"] ["-" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.browser/handle-get",
 :source {:code "(defn handle-get [opts conn request]\n  (let [path (:path request)]\n    (cond\n     (.startsWith path \"/repl\") (send-repl-client-page opts conn request)\n     (:serve-static opts) (send-static opts conn request)\n     :else (send-404 conn (:path request)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [199 204]},
 :usage ["(handle-get opts conn request)"],
 :full-name "cljs.repl.browser/handle-get",
 :removed {:in "0.0-1503", :last-seen "0.0-1450"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/handle-get"]))
```

-->
