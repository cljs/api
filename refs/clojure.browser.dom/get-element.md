## clojure.browser.dom/get-element



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(get-element id)</samp><br>

---

 <samp>
(__get-element__ id)<br>
</samp>

---







Source code @ [github]():

```clj
(defn get-element [id]
  (gdom/getElement (name id)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.browser.dom/get-element` @ crossclj](http://crossclj.info/fun/clojure.browser.dom.cljs/get-element.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/get-element.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.dom",
 :name "get-element",
 :signature ["[id]"],
 :name-encode "get-element",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom/get-element",
 :source {:code "(defn get-element [id]\n  (gdom/getElement (name id)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/clojure/browser/dom.cljs",
          :lines [98 99],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/clojure/browser/dom.cljs#L98-L99"},
 :usage ["(get-element id)"],
 :full-name "clojure.browser.dom/get-element",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/get-element.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/get-element"]))
```

-->
