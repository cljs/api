## cljs.repl.browser/add-in-order



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(add-in-order {:keys \[expecting fns\]} order f)</samp><br>

---

 <samp>
(__add-in-order__ {:keys \[expecting fns\]} order f)<br>
</samp>

---







Source code @ [github]():

```clj
(defn add-in-order [{:keys [expecting fns]} order f]
  {:expecting (or expecting order)
   :fns (assoc fns order f)})
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/add-in-order` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/add-in-order.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/add-in-order.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "add-in-order",
 :signature ["[{:keys [expecting fns]} order f]"],
 :name-encode "add-in-order",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.browser/add-in-order",
 :source {:code "(defn add-in-order [{:keys [expecting fns]} order f]\n  {:expecting (or expecting order)\n   :fns (assoc fns order f)})",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [152 154],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/repl/browser.clj#L152-L154"},
 :usage ["(add-in-order {:keys [expecting fns]} order f)"],
 :full-name "cljs.repl.browser/add-in-order",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/add-in-order.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/add-in-order"]))
```

-->
