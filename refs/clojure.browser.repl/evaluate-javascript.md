## clojure.browser.repl/evaluate-javascript



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(evaluate-javascript conn block)</samp><br>

---

 <samp>
(__evaluate-javascript__ conn block)<br>
</samp>

---





Source docstring:

```
Process a single block of JavaScript received from the server
```


Source code @ [github]():

```clj
(defn evaluate-javascript
  [conn block]
  (let [result
        (try
          {:status :success
           :value (str (js* "eval(~{block})"))}
          (catch :default e
            {:status :exception
             :ua-product (get-ua-product)
             :value (str e)
             :stacktrace
             (if (.hasOwnProperty e "stack")
               (.-stack e)
               "No stacktrace available.")}))]
    (pr-str result)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.browser.repl/evaluate-javascript` @ crossclj](http://crossclj.info/fun/clojure.browser.repl.cljs/evaluate-javascript.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl/evaluate-javascript.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.repl",
 :name "evaluate-javascript",
 :signature ["[conn block]"],
 :name-encode "evaluate-javascript",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.repl/evaluate-javascript",
 :source {:code "(defn evaluate-javascript\n  [conn block]\n  (let [result\n        (try\n          {:status :success\n           :value (str (js* \"eval(~{block})\"))}\n          (catch :default e\n            {:status :exception\n             :ua-product (get-ua-product)\n             :value (str e)\n             :stacktrace\n             (if (.hasOwnProperty e \"stack\")\n               (.-stack e)\n               \"No stacktrace available.\")}))]\n    (pr-str result)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/clojure/browser/repl.cljs",
          :lines [54 69],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/clojure/browser/repl.cljs#L54-L69"},
 :usage ["(evaluate-javascript conn block)"],
 :full-name "clojure.browser.repl/evaluate-javascript",
 :docstring "Process a single block of JavaScript received from the server",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl/evaluate-javascript.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/evaluate-javascript"]))
```

-->
