## clojure.browser.dom/insert-at



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(insert-at parent child index)</samp><br>

---

 <samp>
(__insert-at__ parent child index)<br>
</samp>

---







Source code @ [github]():

```clj
(defn insert-at [parent child index]
  (gdom/insertChildAt parent child index))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.browser.dom/insert-at` @ crossclj](http://crossclj.info/fun/clojure.browser.dom.cljs/insert-at.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/insert-at.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.dom",
 :name "insert-at",
 :signature ["[parent child index]"],
 :name-encode "insert-at",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom/insert-at",
 :source {:code "(defn insert-at [parent child index]\n  (gdom/insertChildAt parent child index))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/clojure/browser/dom.cljs",
          :lines [104 105],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/clojure/browser/dom.cljs#L104-L105"},
 :usage ["(insert-at parent child index)"],
 :full-name "clojure.browser.dom/insert-at",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/insert-at.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/insert-at"]))
```

-->
