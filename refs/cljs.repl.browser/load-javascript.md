## cljs.repl.browser/load-javascript



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(load-javascript repl-env provides url)</samp><br>

---

 <samp>
(__load-javascript__ repl-env provides url)<br>
</samp>

---





Source docstring:

```
Accepts a REPL environment, a list of namespaces, and a URL for a
JavaScript file which contains the implementation for the list of
namespaces. Will load the JavaScript file into the REPL environment
if any of the namespaces have not already been loaded from the
ClojureScript REPL.
```


Source code @ [github]():

```clj
(defn load-javascript
  [repl-env provides url]
  (browser-eval (slurp url)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/load-javascript` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/load-javascript.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/load-javascript.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "load-javascript",
 :signature ["[repl-env provides url]"],
 :name-encode "load-javascript",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.browser/load-javascript",
 :source {:code "(defn load-javascript\n  [repl-env provides url]\n  (browser-eval (slurp url)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [202 209],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/clojure/cljs/repl/browser.clj#L202-L209"},
 :usage ["(load-javascript repl-env provides url)"],
 :full-name "cljs.repl.browser/load-javascript",
 :docstring "Accepts a REPL environment, a list of namespaces, and a URL for a\nJavaScript file which contains the implementation for the list of\nnamespaces. Will load the JavaScript file into the REPL environment\nif any of the namespaces have not already been loaded from the\nClojureScript REPL.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/load-javascript.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/load-javascript"]))
```

-->
