## cljs.pprint/pprint-newline



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/pprint-newline</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint-newline)
</td>
</tr>
</table>

<samp>(pprint-newline kind)</samp><br>

---

 <samp>
(__pprint-newline__ kind)<br>
</samp>

---





Source docstring:

```
Print a conditional newline to a pretty printing stream. kind specifies if the
newline is :linear, :miser, :fill, or :mandatory.

This function is intended for use when writing custom dispatch functions.

Output is sent to *out* which must be a pretty printing writer.
```


Source code @ [github]():

```clj
(defn pprint-newline
  [kind]
  (check-enumerated-arg kind #{:linear :miser :fill :mandatory})
  (nl *out* kind))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.pprint/pprint-newline` @ clojuredocs](http://clojuredocs.org/clojure.pprint/pprint-newline)<br>
[`clojure.pprint/pprint-newline` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/pprint-newline/)<br>
[`clojure.pprint/pprint-newline` @ crossclj](http://crossclj.info/fun/clojure.pprint/pprint-newline.html)<br>
[`cljs.pprint/pprint-newline` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/pprint-newline.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/pprint-newline.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "pprint-newline",
 :signature ["[kind]"],
 :name-encode "pprint-newline",
 :history [["+" "0.0-3255"]],
 :type "function",
 :clj-equiv {:full-name "clojure.pprint/pprint-newline",
             :url "http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint-newline"},
 :full-name-encode "cljs.pprint/pprint-newline",
 :source {:code "(defn pprint-newline\n  [kind]\n  (check-enumerated-arg kind #{:linear :miser :fill :mandatory})\n  (nl *out* kind))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [841 850],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/pprint.cljs#L841-L850"},
 :usage ["(pprint-newline kind)"],
 :full-name "cljs.pprint/pprint-newline",
 :docstring "Print a conditional newline to a pretty printing stream. kind specifies if the\nnewline is :linear, :miser, :fill, or :mandatory.\n\nThis function is intended for use when writing custom dispatch functions.\n\nOutput is sent to *out* which must be a pretty printing writer.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/pprint-newline.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/pprint-newline"]))
```

-->
