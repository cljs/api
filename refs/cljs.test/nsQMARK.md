## cljs.test/ns?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.8.51"><img valign="middle" alt="[+] 1.8.51" title="Added in 1.8.51" src="https://img.shields.io/badge/+-1.8.51-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(ns? x)</samp><br>

---

 <samp>
(__ns?__ x)<br>
</samp>

---







Source code @ [github]():

```clj
(defn ns? [x]
  (and (seq? x) (= (first x) 'quote)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.test/ns?` @ crossclj](http://crossclj.info/fun/cljs.test/ns%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/nsQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "ns?",
 :signature ["[x]"],
 :name-encode "nsQMARK",
 :history [["+" "1.8.51"]],
 :type "function",
 :full-name-encode "cljs.test/nsQMARK",
 :source {:code "(defn ns? [x]\n  (and (seq? x) (= (first x) 'quote)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/test.cljc",
          :lines [246 247],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/test.cljc#L246-L247"},
 :usage ["(ns? x)"],
 :full-name "cljs.test/ns?",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/nsQMARK.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/ns?"]))
```

-->
