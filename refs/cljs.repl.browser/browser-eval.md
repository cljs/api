## cljs.repl.browser/browser-eval



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__browser-eval__ form)<br>
</samp>

---





Source docstring:

```
Given a string of JavaScript, evaluate it in the browser and return a map representing the
result of the evaluation. The map will contain the keys :type and :value. :type can be
:success, :exception, or :error. :success means that the JavaScript was evaluated without
exception and :value will contain the return value of the evaluation. :exception means that
there was an exception in the browser while evaluating the JavaScript and :value will
contain the error message. :error means that some other error has occured.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3195/src/clj/cljs/repl/browser.clj#L162-L178):

```clj
(defn browser-eval
  [form]
  (let [return-value (promise)]
    (send-for-eval form
      (fn [val] (deliver return-value val)))
    (let [ret @return-value]
      (try
        (read-string ret)
        (catch Exception e
          {:status :error
           :value (str "Could not read return value: " ret)})))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3195
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:162-178](https://github.com/clojure/clojurescript/blob/r3195/src/clj/cljs/repl/browser.clj#L162-L178)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/browser-eval` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/browser-eval.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/browser-eval.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "browser-eval",
 :signature ["[form]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.browser/browser-eval",
 :source {:code "(defn browser-eval\n  [form]\n  (let [return-value (promise)]\n    (send-for-eval form\n      (fn [val] (deliver return-value val)))\n    (let [ret @return-value]\n      (try\n        (read-string ret)\n        (catch Exception e\n          {:status :error\n           :value (str \"Could not read return value: \" ret)})))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [162 178]},
 :full-name "cljs.repl.browser/browser-eval",
 :docstring "Given a string of JavaScript, evaluate it in the browser and return a map representing the\nresult of the evaluation. The map will contain the keys :type and :value. :type can be\n:success, :exception, or :error. :success means that the JavaScript was evaluated without\nexception and :value will contain the return value of the evaluation. :exception means that\nthere was an exception in the browser while evaluating the JavaScript and :value will\ncontain the error message. :error means that some other error has occured."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/browser-eval"]))
```

-->
