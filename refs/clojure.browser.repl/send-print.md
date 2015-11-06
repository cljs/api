## clojure.browser.repl/send-print



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__send-print__ url data)<br>
</samp>
 <samp>
(__send-print__ url data n)<br>
</samp>

---





Source docstring:

```
Send data to be printed in the REPL. If there is an error, try again
up to 10 times.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2138/src/cljs/clojure/browser/repl.cljs#L41-L53):

```clj
(defn send-print
  ([url data]
     (send-print url data 0))
  ([url data n]
     (let [conn (net/xhr-connection)]
       (event/listen conn :error
                     (fn [_]
                       (if (< n 10)
                         (send-print url data (inc n))
                         (.log js/console (str "Could not send " data " after " n " attempts.")))))
       (net/transmit conn url "POST" data nil 0))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2138
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:41-53](https://github.com/clojure/clojurescript/blob/r2138/src/cljs/clojure/browser/repl.cljs#L41-L53)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.repl/send-print` @ crossclj](http://crossclj.info/fun/clojure.browser.repl.cljs/send-print.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl/send-print.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.repl",
 :name "send-print",
 :signature ["[url data]" "[url data n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.repl/send-print",
 :source {:code "(defn send-print\n  ([url data]\n     (send-print url data 0))\n  ([url data n]\n     (let [conn (net/xhr-connection)]\n       (event/listen conn :error\n                     (fn [_]\n                       (if (< n 10)\n                         (send-print url data (inc n))\n                         (.log js/console (str \"Could not send \" data \" after \" n \" attempts.\")))))\n       (net/transmit conn url \"POST\" data nil 0))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2138",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [41 53]},
 :full-name "clojure.browser.repl/send-print",
 :docstring "Send data to be printed in the REPL. If there is an error, try again\nup to 10 times."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/send-print"]))
```

-->
