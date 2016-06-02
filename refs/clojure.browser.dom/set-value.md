## clojure.browser.dom/set-value



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(set-value e v)</samp><br>

---

 <samp>
(__set-value__ e v)<br>
</samp>

---





Source docstring:

```
Set the value property for an element.
```


Source code @ [github]():

```clj
(defn set-value
  [e v]
  (set-properties e {"value" v}))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.browser.dom/set-value` @ crossclj](http://crossclj.info/fun/clojure.browser.dom.cljs/set-value.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/set-value.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.dom",
 :name "set-value",
 :signature ["[e v]"],
 :name-encode "set-value",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom/set-value",
 :source {:code "(defn set-value\n  [e v]\n  (set-properties e {\"value\" v}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/clojure/browser/dom.cljs",
          :lines [142 145],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/clojure/browser/dom.cljs#L142-L145"},
 :usage ["(set-value e v)"],
 :full-name "clojure.browser.dom/set-value",
 :docstring "Set the value property for an element.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/set-value.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/set-value"]))
```

-->
